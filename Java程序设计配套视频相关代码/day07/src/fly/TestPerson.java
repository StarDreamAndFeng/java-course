package fly;

import java.util.*;

public class TestPerson {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Person p1 = new Person("张三",12);
		
		p1.sleep();
		System.out.println(p1.getAge());
		
		Date d = new Date();
		System.out.println("日期："+d.getDate());
		
	}
}

class Person{
	
	private String name;
	private int age;
	
	public Person() {
		
	}
	public Person(String name) {
		this.name = name;
	}
	public Person(int age) {
		this.age = age;
	}
	public Person(String name,int age) {
		this(name);//this.构造器-----《用法》
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void sleep() {
		System.out.println("睡觉");
	}
}

























