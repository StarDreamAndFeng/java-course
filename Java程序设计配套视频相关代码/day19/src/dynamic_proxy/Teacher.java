package dynamic_proxy;

/*
 * 【被代理类】
 * 老师类 ： 对学生进行打分
 */

public class Teacher implements GiveScore {

	@Override
	public void giveStudentScore(Student student,double score) {
		
		//设置学生分数
		student.setScore(score);
		System.out.println("老师给" + student.getName() + "分数：" + score);
	}

}
