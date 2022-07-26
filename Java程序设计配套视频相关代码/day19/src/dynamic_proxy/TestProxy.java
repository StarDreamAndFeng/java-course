package dynamic_proxy;

public class TestProxy {

	public static void main(String[] args) {
		
		//1.创建一个被代理类
		Teacher teacher = new Teacher();
		
		//2.创建一个实现了InvocationHandler接口的类的对象
		ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
		
		//3.创建一个代理类【该代理类同样实现了被代理类实现接口GiveScore】
		GiveScore proxy =  (GiveScore) proxyInvocationHandler.create(teacher);//填入的是被代理类
		
		//4.创建一个学生【被代理类要操作的对象】
		Student student = new Student("张三","男",0);
		System.out.println(student);
		
		//5.通过代理类可以调用方法【调用的方法与被代理类一致】
		proxy.giveStudentScore(student, 78.5);
		System.out.println(student);
		
		/*
		 * 再增加一个被代理类
		 */
		Student student2 = new Student("小红","女",0);
		Machine machine = new Machine();
		System.out.println(student2);
		
		//获取代理类
		Homework proxy1 =  (Homework) proxyInvocationHandler.create(machine);
		
		proxy1.assignHomework(student2, "背古诗");
		
	}
}



