package dynamic_proxy;

/*
 * 功能：给学生打分
 */

public interface GiveScore {

	/**
	 * 给出学生分数
	 * @param student 给哪一个学生打分
	 * @param score 打分的多少
	 */
	public void giveStudentScore(Student student,double score);
	
}
