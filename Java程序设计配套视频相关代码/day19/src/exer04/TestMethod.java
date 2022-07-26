package exer04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestMethod {

	public static void main(String[] args) throws Exception{
		
		//1.����Class���ʵ��
		Class<Person> clazz = Person.class;
		
		//2.��ȡ������
		Constructor<Person> person =  clazz.getDeclaredConstructor();
		
		//3.��������
		Person p1 = person.newInstance();
		
		//4.��ȡ����
		Method method =  clazz.getDeclaredMethod("shadow");//˽�з���
		
		//5.���÷����ɷ���
		method.setAccessible(true);
		
		//5.���÷���
		Object obj =  method.invoke(p1);
		
		//6.��ӡ����ֵ�����п��ޡ�
		System.out.println(obj);
		
	}
}
