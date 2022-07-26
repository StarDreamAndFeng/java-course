package fly;

import java.lang.reflect.Constructor;

//通过反射来获取对象，并调用方法

public class TestReflect2 {

	public static void main(String[] args) throws Exception {
		
		/*
		 * 正确示范：
		 */
		
		//创建一个类
		Class<Student> clazz = Student.class;
		
		//获取带参数的构造器
		Constructor<Student> constructor = clazz.getDeclaredConstructor(String.class,Integer.class);
		
		//由获取的构造器创建一个对象
		Student student = constructor.newInstance("张三",18);
		
		//打印
		System.out.println(student);
	}	
}
