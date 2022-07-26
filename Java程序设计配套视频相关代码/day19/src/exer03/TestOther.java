package exer03;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TestOther {

	public static void main(String[] args) {
		
		Class<Person> clazz = Person.class;
		
		//1.��ȡ���๹����
		System.out.println(clazz.getSuperclass());
		System.out.println();
		
		//2.��ȡ�����͵ĸ��๹����
		Type type =  clazz.getGenericSuperclass();
		System.out.println(type);
		System.out.println();
		
		//3.��ȡ����ķ���
		ParameterizedType parameterizedType =  (ParameterizedType)type;//ǿת��Type���ӽӿ�
		Type[] generic =  parameterizedType.getActualTypeArguments();//��ȡ����
		for(Type t : generic) {
			System.out.print(((Class)t).getName() + "  ");//��ȡ�˷���,ǿת��Class���ʵ��
		}
		System.out.println("\n");
		
		//4.��ȡʵ�ֵĽӿ�
		Class[] interfaces =  clazz.getInterfaces();
		for(Class c : interfaces) {
			System.out.print(c.getName() + " ");
		}
		System.out.println("\n");
		
		//5.��ȡ���ڵİ�
		Package pack = clazz.getPackage();
		System.out.println(pack);
		System.out.println();
		
		//6.��ȡ����ʱ���ע��
		Annotation[] annotations =  clazz.getAnnotations();
		for(Annotation a : annotations) {
			System.out.println(a);
		}
		
	}
}
