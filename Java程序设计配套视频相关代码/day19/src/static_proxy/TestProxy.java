package static_proxy;

public class TestProxy {

	public static void main(String[] args) {
		
		//����һ��ѧ��
		Student student1 = new Student("����","��",0);
		
		//����һ��ѧ��
		Student student2 = new Student("С��","Ů",0);
		
		System.out.println(student1);
		System.out.println(student2);
		
		//����һ��������
		ProxyStudent proxyStudent = new ProxyStudent(new Teacher());
		ProxyStudent proxyStudent2 = new ProxyStudent(new Machine());
		
		//��student[����]���
		proxyStudent.giveStudentScore(student1, 78.5);
//		proxyStudent.assignHomework(student1,"����");
		
		//��student[С��]���
//		proxyStudent2.giveStudentScore(student2, 89.2);
		proxyStudent2.assignHomework(student1,"д��");
		
		//��ӡ���ѧ����Ϣ
		System.out.println(student1);
		System.out.println(student2);
		
	}
}
