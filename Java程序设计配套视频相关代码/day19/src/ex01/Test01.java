package ex01;

import fly.Person;

/*
 * 一个运行时类 <===> 一个Class类的实例  
 */

public class Test01 {
	
	public static void main(String[] args) {
		
		//创建一个对象
		Person p = new Person();
		String str = "hello";
		
		//获取该对象对应的类
		@SuppressWarnings("unchecked")
		Class<Person> clazz = (Class<Person>) p.getClass();
		
		System.out.println(clazz);//class fly.Person
		
		Class<? extends String> class1 = str.getClass();
		
		System.out.println(class1);//class java.lang.String
		
	}

}
