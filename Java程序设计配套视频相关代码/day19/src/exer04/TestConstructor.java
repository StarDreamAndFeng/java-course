package exer04;

import java.lang.reflect.Constructor;

public class TestConstructor {

	public static void main(String[] args) throws Exception {
		
		Class<Person> clazz = Person.class;
		
		Constructor<Person> person =  clazz.getDeclaredConstructor(String.class,int.class);//填入你要使用的构造器的参数
		
		//创建对象
		Person p1 =  person.newInstance("张三",10);
		
		System.out.println(p1);
		
	}
}
