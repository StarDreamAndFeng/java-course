package dynamic_proxy;

public class TestProxy {

	public static void main(String[] args) {
		
		//1.����һ����������
		Teacher teacher = new Teacher();
		
		//2.����һ��ʵ����InvocationHandler�ӿڵ���Ķ���
		ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
		
		//3.����һ�������ࡾ�ô�����ͬ��ʵ���˱�������ʵ�ֽӿ�GiveScore��
		GiveScore proxy =  (GiveScore) proxyInvocationHandler.create(teacher);//������Ǳ�������
		
		//4.����һ��ѧ������������Ҫ�����Ķ���
		Student student = new Student("����","��",0);
		System.out.println(student);
		
		//5.ͨ����������Ե��÷��������õķ����뱻������һ�¡�
		proxy.giveStudentScore(student, 78.5);
		System.out.println(student);
		
		/*
		 * ������һ����������
		 */
		Student student2 = new Student("С��","Ů",0);
		Machine machine = new Machine();
		System.out.println(student2);
		
		//��ȡ������
		Homework proxy1 =  (Homework) proxyInvocationHandler.create(machine);
		
		proxy1.assignHomework(student2, "����ʫ");
		
	}
}



