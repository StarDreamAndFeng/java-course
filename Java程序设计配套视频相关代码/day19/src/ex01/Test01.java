package ex01;

import fly.Person;

/*
 * һ������ʱ�� <===> һ��Class���ʵ��  
 */

public class Test01 {
	
	public static void main(String[] args) {
		
		//����һ������
		Person p = new Person();
		String str = "hello";
		
		//��ȡ�ö����Ӧ����
		@SuppressWarnings("unchecked")
		Class<Person> clazz = (Class<Person>) p.getClass();
		
		System.out.println(clazz);//class fly.Person
		
		Class<? extends String> class1 = str.getClass();
		
		System.out.println(class1);//class java.lang.String
		
	}

}
