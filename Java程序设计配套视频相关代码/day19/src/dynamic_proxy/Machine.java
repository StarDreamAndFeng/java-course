package dynamic_proxy;

/*
 * 再创建一个被代理类
 */

//实现接口Homework
public class Machine implements Homework{

	@Override
	public void assignHomework(Student student,String content) {
		
		System.out.println("机器给" + student.getName() + "布置的作业为：" + content);
		
	}
}