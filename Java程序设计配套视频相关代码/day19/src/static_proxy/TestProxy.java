package static_proxy;

public class TestProxy {

	public static void main(String[] args) {
		
		//创建一个学生
		Student student1 = new Student("张三","男",0);
		
		//创建一个学生
		Student student2 = new Student("小花","女",0);
		
		System.out.println(student1);
		System.out.println(student2);
		
		//创建一个代理类
		ProxyStudent proxyStudent = new ProxyStudent(new Teacher());
		ProxyStudent proxyStudent2 = new ProxyStudent(new Machine());
		
		//给student[张三]打分
		proxyStudent.giveStudentScore(student1, 78.5);
//		proxyStudent.assignHomework(student1,"背书");
		
		//给student[小花]打分
//		proxyStudent2.giveStudentScore(student2, 89.2);
		proxyStudent2.assignHomework(student1,"写字");
		
		//打印输出学生信息
		System.out.println(student1);
		System.out.println(student2);
		
	}
}
