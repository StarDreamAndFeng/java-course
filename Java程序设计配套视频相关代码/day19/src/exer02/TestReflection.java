package exer02;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Properties;

import org.junit.Test;

public class TestReflection {
	
	//如何获取Class的实例
	@Test
	public void test1() throws Exception{
		
		//1.调用运行时类本身的.class属性
		Class clazz1 = Person.class;
		System.out.println(clazz1.getName());
		
		//2.通过运行时类的对象获取
		Person p = new Person();
		Class clazz2  = p.getClass();
		System.out.println(clazz2.getName());
		
		//3.通过Class的静态方法获取
		String className = "exer02.Person";
		try {
			Class clazz3 = Class.forName(className);
			System.out.println(clazz3.getName());
			
			/*
			 * 具体的应用【获取到类】
			 */
			Constructor<Person> constructor = clazz3.getConstructor(String.class);
			Person p1 = constructor.newInstance("张三");
			
			Field field =  clazz3.getDeclaredField("name");
			field.setAccessible(true);
			field.set(p1, "李四");
			System.out.println(p1);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//通过类的加载器
		ClassLoader classLoader = this.getClass().getClassLoader();
		Class clazz4 = classLoader.loadClass(className);
		System.out.println(clazz4.getName());
		
	}
	
	/*
	 * 三个类加载器
	 * 		1.系统类加载器
	 * 		2.扩展(平台)类加载器
	 * 		3.引导类加载器
	 */
	@Test
	public void test2() throws Exception {
		
		ClassLoader classLoader =  this.getClass().getClassLoader();
		System.out.println(classLoader);//结果：jdk.internal.loader.ClassLoaders$AppClassLoader@736e9adb
		
		ClassLoader classLoader2 = classLoader.getParent();//获取父类
		System.out.println(classLoader2);//结果：jdk.internal.loader.ClassLoaders$PlatformClassLoader@45f45fa1
		
		ClassLoader classLoader3 = classLoader2.getParent();
		System.out.println(classLoader3);//结果：null
		
		/*
		 * 	实际应用
		 * 		1.通过类加载器，获取类【上面的代码】
		 * 		2.在包下访问文件，而不需要在工程目录下访问文件
		 */
		ClassLoader classLoader4 = this.getClass().getClassLoader();
		InputStream is = classLoader4.getResourceAsStream("exer02\\jdbc.properties");//文件地址要正确
		
		Properties properties = new Properties();
		System.out.println(properties);
		properties.load(is);
		String name =  properties.getProperty("user");
		System.out.println("用户名:"+name);
		String password = properties.getProperty("password");
		System.out.println("密码:" + password);
		
	}
	

}
