package dynamic_proxy;

/*
 * 布置作业
 */

public interface Homework {

	/**
	 * 布置作业
	 * @param content 作业内容
	 * @param student 具体哪一个学生
	 */
	public void assignHomework(Student student,String content);
	
}
