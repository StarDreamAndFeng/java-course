package exer02;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Properties;

import org.junit.Test;

public class TestReflection {
	
	//��λ�ȡClass��ʵ��
	@Test
	public void test1() throws Exception{
		
		//1.��������ʱ�౾���.class����
		Class clazz1 = Person.class;
		System.out.println(clazz1.getName());
		
		//2.ͨ������ʱ��Ķ����ȡ
		Person p = new Person();
		Class clazz2  = p.getClass();
		System.out.println(clazz2.getName());
		
		//3.ͨ��Class�ľ�̬������ȡ
		String className = "exer02.Person";
		try {
			Class clazz3 = Class.forName(className);
			System.out.println(clazz3.getName());
			
			/*
			 * �����Ӧ�á���ȡ���ࡿ
			 */
			Constructor<Person> constructor = clazz3.getConstructor(String.class);
			Person p1 = constructor.newInstance("����");
			
			Field field =  clazz3.getDeclaredField("name");
			field.setAccessible(true);
			field.set(p1, "����");
			System.out.println(p1);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//ͨ����ļ�����
		ClassLoader classLoader = this.getClass().getClassLoader();
		Class clazz4 = classLoader.loadClass(className);
		System.out.println(clazz4.getName());
		
	}
	
	/*
	 * �����������
	 * 		1.ϵͳ�������
	 * 		2.��չ(ƽ̨)�������
	 * 		3.�����������
	 */
	@Test
	public void test2() throws Exception {
		
		ClassLoader classLoader =  this.getClass().getClassLoader();
		System.out.println(classLoader);//�����jdk.internal.loader.ClassLoaders$AppClassLoader@736e9adb
		
		ClassLoader classLoader2 = classLoader.getParent();//��ȡ����
		System.out.println(classLoader2);//�����jdk.internal.loader.ClassLoaders$PlatformClassLoader@45f45fa1
		
		ClassLoader classLoader3 = classLoader2.getParent();
		System.out.println(classLoader3);//�����null
		
		/*
		 * 	ʵ��Ӧ��
		 * 		1.ͨ�������������ȡ�ࡾ����Ĵ��롿
		 * 		2.�ڰ��·����ļ���������Ҫ�ڹ���Ŀ¼�·����ļ�
		 */
		ClassLoader classLoader4 = this.getClass().getClassLoader();
		InputStream is = classLoader4.getResourceAsStream("exer02\\jdbc.properties");//�ļ���ַҪ��ȷ
		
		Properties properties = new Properties();
		System.out.println(properties);
		properties.load(is);
		String name =  properties.getProperty("user");
		System.out.println("�û���:"+name);
		String password = properties.getProperty("password");
		System.out.println("����:" + password);
		
	}
	

}
