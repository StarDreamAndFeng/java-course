package static_proxy;

/*
 * ���������ࡿ
 * ��ʦ�� �� ��ѧ�����д��
 */

public class Teacher implements GiveScore {

	@Override
	public void giveStudentScore(Student student,double score) {
		
		//����ѧ������
		student.setScore(score);
		System.out.println("��" + student.getName() + "������" + score);
	}

}
