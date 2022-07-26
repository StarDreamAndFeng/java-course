package fly;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public class TestReflect {

	@SuppressWarnings({ "unchecked"})
	public static void main(String[] args) throws Exception{
		
		Class  class1 =  Person.class;
		Class  class2 = String.class;
		Class  class3 = Student.class;
		
		//1.通过反射，创建运行时类
//		Person p = class1.getDeclaredConstructor(fly.Person.class).newInstance();//在Java9之后，使用该方式获取实例
//		Person p = class1.newInstance();
//		Person p = class1.getDeclaredConstructor(Person.class).newInstance();
//		String str = class2.getDeclaredConstructor(String.class).newInstance("Hello");
//		Person p = class1.getDeclaredConstructor(Person.class).newInstance();
//		Constructor<Student>  student[] = class3.getDeclaredConstructors(Student.class);
		Constructor constructor =  class3.getDeclaredConstructor(String.class);
		Student student = (Student) constructor.newInstance("张三");

//		//2.通过反射，调用属性
//		Field field =  class3.getDeclaredField("name");//获取到了属性
//		field.setAccessible(true);//设置可以访问私有属性
//		field.set(student,"张三");//改变对象p的名字
		System.out.println(student);
//		
//		//3.通过反射，调用方法
		Method m1 =  class3.getMethod("show");//获取到show方法
		m1.invoke(student);//调用方法
		System.out.println(student);
		
//		Person p = new Person();
//		System.out.println(p);
	
		
	}
	
}


