package exer04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestMethod {

	public static void main(String[] args) throws Exception{
		
		//1.创建Class类的实例
		Class<Person> clazz = Person.class;
		
		//2.获取构造器
		Constructor<Person> person =  clazz.getDeclaredConstructor();
		
		//3.创建对象
		Person p1 = person.newInstance();
		
		//4.获取方法
		Method method =  clazz.getDeclaredMethod("shadow");//私有方法
		
		//5.设置方法可访问
		method.setAccessible(true);
		
		//5.调用方法
		Object obj =  method.invoke(p1);
		
		//6.打印返回值【可有可无】
		System.out.println(obj);
		
	}
}
