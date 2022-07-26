package exer04;

import java.text.SimpleDateFormat;
import java.util.Date;


import org.junit.Test;

public class JdbcTest {

	@Test
	public void test1() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

//		String[] name = { "�����", "��Ψ��", "���h�u", "������", "������", "������", "����ӱ", "������", "�����", "������", "������", "������", "������",
//				"����н", "����ͯ", "������", "���̳�", "����ݽ", "����Ӣ", "������", "������", "����һ", "��ݼ�", "������", "������", "���Պ�", "��ޱ��", "�����",
//				"������", "�����", "����ޱ", "���D��", "���u��", "��ʩ��", "���۸�", "������", "����ѩ", "���ﺭ", "������", "�����", "������", "������", "�����",
//				"������", "������", "������", "�����B", "���Ϸ�", "����֦", "����Ƚ", "������", "������", "�����c", "���Ȼ", "������", "��Ľ��", "������", "����΢",
//				"������", "������" };

//		// ���ѧ��
//		Student student = null;
//		for (int i = 1006; i < 1020; i++) {
//			
//			student = createStudent(i, name[i-1006], "Ů", sdf.parse("2000-12-23 12:00:42"), "19218229802", "������ɳƺ�������л�԰��·111��");
//			addStudent(student);
//		}
		
		//���ѧ��
//		Student student = createStudent(1020, "�����", "��",sdf.parse("2003-3-17 8:23:9"), "15210762300", "�ɶ������������������7��");
//
//		addStudent(student);
		
		// ��ѯѧ��
//		searchStudent(1001);
//		searchStudent(1002);
//		searchStudent(1003);
//		searchStudent(1004);
//		searchStudent(1005);
//		searchStudent(1006);
//		searchStudent(1007);

		// ɾ��ѧ��
		deleteStudent(1019);
		deleteStudent(1020);

	}

	/**
	 * ����һ��ѧ��
	 * 
	 * @param id       ѧ��
	 * @param stuname  ����
	 * @param sex      �Ա�
	 * @param birth    ����
	 * @param telphone �绰
	 * @param addr     ��ַ
	 * @return ����һ��ѧ��
	 */
	public Student createStudent(int id, String stuname, String sex, Date birth, String telphone, String addr) {

		// ����ѧ��
		Student student = new Student(id, stuname, sex, birth, telphone, addr);

		return student;
	}

	/**
	 * ���һ����ѧ��
	 * 
	 * @param student ѧ��
	 */
	public void addStudent(Student student) {

		// 1.׼��SQL���
		String sql = "INSERT INTO student VALUES(?,?,?,?,?,?);";

		// 2.����JdbcTools�����ִ�й���
		JdbcTools.update(sql,student.getId(),student.getStuname(),student.getSex(),
				student.getBirth(),student.getTelphone(),student.getAddr());
		
		System.out.println("���ѧ���ɹ���");
	}

	/**
	 * ɾ��һ��ѧ��
	 * 
	 * @param student ѧ��
	 */
	public void deleteStudent(int id) {

		// 1.׼��SQL���
		String sql = "DELETE FROM student WHERE id = ?;";

		// 2.����JdbcTools�����ִ�й���
		JdbcTools.update(sql,id);
		System.out.println("ɾ��ѧ���ɹ���");
	}

	/**
	 * ����ѧ����ͨ��ѧ�š�
	 * 
	 * @param id
	 */
	public void searchStudent(int id) {

		// 1.׼��SQL���
		String sql = "SELECT id,stuname,sex,birth,telphone,addr FROM student  WHERE id = ?;";

		// 2.ͨ��SQL����ȡѧ��
		Student student = JdbcTools.getStudent(sql,id);

		// 3.��ӡѧ��������Ϣ
		printStudent(student);

	}

	/**
	 * ��ӡѧ����Ϣ
	 * 
	 * @param student
	 */
	private void printStudent(Student student) {

		if (student != null) {

			// ��student ��Ϊ��ʱ����ӡ���
			System.out.println("==ѧ��������Ϣ==");
			System.out.println("ѧ�ţ�" + "\t" + student.getId());
			System.out.println("������" + "\t" + student.getStuname());
			System.out.println("�Ա�" + "\t" + student.getSex());
			System.out.println("���գ�" + "\t" + student.getBirth());
			System.out.println("�绰��" + "\t" + student.getTelphone());
			System.out.println("��ַ��" + "\t" + student.getAddr());
		} else {
			System.out.println("δ�ҵ���ѧ��,�뻻һ��ѧ�Ż�����������");
		}

	}

	/**
	 * ����ѧ����ͨ��������
	 * 
	 * @param name
	 */
	public void searchStudent(String name) {
		// 1.׼��SQL���
		String sql = "SELECT id,stuname,sex,birth,telphone,addr FROM student  WHERE name = ?;";

		// 2.ͨ��SQL����ȡѧ��
		Student student = JdbcTools.getStudent(sql,name);

		// 3.��ӡѧ��������Ϣ
		printStudent(student);
	}

}
