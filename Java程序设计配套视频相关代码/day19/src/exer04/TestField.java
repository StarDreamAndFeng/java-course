package exer04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
 * 调用属性
 */

public class TestField {

	public static void main(String[] args) throws Exception {
		
		Class<Person> clazz = Person.class;
		
		//1.获取构造器
		Constructor<Person> person = clazz.getConstructor();
		
		//2.通过构造器创建一个对象
		Person p1 =  person.newInstance();
		System.out.println(p1);
		
		//3.获取属性
		Field address =  clazz.getDeclaredField("address");
		
		//4.将属性设定为可访问
		address.setAccessible(true);
		
		//4.对属性进行赋值
		address.set(p1, "中国重庆");
		
		//5.打印输出该信息
		System.out.println(p1);
		
	}
}
