package exer03;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TestOther {

	public static void main(String[] args) {
		
		Class<Person> clazz = Person.class;
		
		//1.获取父类构造器
		System.out.println(clazz.getSuperclass());
		System.out.println();
		
		//2.获取带泛型的父类构造器
		Type type =  clazz.getGenericSuperclass();
		System.out.println(type);
		System.out.println();
		
		//3.获取父类的泛型
		ParameterizedType parameterizedType =  (ParameterizedType)type;//强转成Type的子接口
		Type[] generic =  parameterizedType.getActualTypeArguments();//获取泛型
		for(Type t : generic) {
			System.out.print(((Class)t).getName() + "  ");//获取了泛型,强转成Class类的实例
		}
		System.out.println("\n");
		
		//4.获取实现的接口
		Class[] interfaces =  clazz.getInterfaces();
		for(Class c : interfaces) {
			System.out.print(c.getName() + " ");
		}
		System.out.println("\n");
		
		//5.获取所在的包
		Package pack = clazz.getPackage();
		System.out.println(pack);
		System.out.println();
		
		//6.获取运行时类的注解
		Annotation[] annotations =  clazz.getAnnotations();
		for(Annotation a : annotations) {
			System.out.println(a);
		}
		
	}
}
