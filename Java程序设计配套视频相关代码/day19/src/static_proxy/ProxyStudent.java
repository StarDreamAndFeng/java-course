package static_proxy;

/*
 * �������ࡿ
 * ����ʦָ�ɵ�һЩѧ�����д��
 */

public class ProxyStudent implements GiveScore,Homework{
	
	GiveScore giveScore;
	Homework homework;

	public ProxyStudent(Teacher teacher) {
		super();
		this.giveScore = teacher;
	}
	
	public ProxyStudent(Machine machine) {
		super();
		this.homework = machine;
	}

	@Override
	public void giveStudentScore(Student student,double score) {
		
		System.out.print("[����ѧ��]");
		giveScore.giveStudentScore(student, score);
	}

	@Override
	public void assignHomework(Student student, String content) {
		
		System.out.print("[����ѧ��]");
		homework.assignHomework(student, content);
	}

}
