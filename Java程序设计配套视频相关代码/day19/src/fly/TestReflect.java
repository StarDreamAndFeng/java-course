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
		
		//1.ͨ�����䣬��������ʱ��
//		Person p = class1.getDeclaredConstructor(fly.Person.class).newInstance();//��Java9֮��ʹ�ø÷�ʽ��ȡʵ��
//		Person p = class1.newInstance();
//		Person p = class1.getDeclaredConstructor(Person.class).newInstance();
//		String str = class2.getDeclaredConstructor(String.class).newInstance("Hello");
//		Person p = class1.getDeclaredConstructor(Person.class).newInstance();
//		Constructor<Student>  student[] = class3.getDeclaredConstructors(Student.class);
		Constructor constructor =  class3.getDeclaredConstructor(String.class);
		Student student = (Student) constructor.newInstance("����");

//		//2.ͨ�����䣬��������
//		Field field =  class3.getDeclaredField("name");//��ȡ��������
//		field.setAccessible(true);//���ÿ��Է���˽������
//		field.set(student,"����");//�ı����p������
		System.out.println(student);
//		
//		//3.ͨ�����䣬���÷���
		Method m1 =  class3.getMethod("show");//��ȡ��show����
		m1.invoke(student);//���÷���
		System.out.println(student);
		
//		Person p = new Person();
//		System.out.println(p);
	
		
	}
	
}


