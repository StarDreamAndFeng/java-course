package static_proxy;

/*
 * 【代理类】
 * 由老师指派的一些学生进行打分
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
		
		System.out.print("[代理学生]");
		giveScore.giveStudentScore(student, score);
	}

	@Override
	public void assignHomework(Student student, String content) {
		
		System.out.print("[代理学生]");
		homework.assignHomework(student, content);
	}

}
