package exer04;

import java.lang.reflect.Constructor;

public class TestConstructor {

	public static void main(String[] args) throws Exception {
		
		Class<Person> clazz = Person.class;
		
		Constructor<Person> person =  clazz.getDeclaredConstructor(String.class,int.class);//������Ҫʹ�õĹ������Ĳ���
		
		//��������
		Person p1 =  person.newInstance("����",10);
		
		System.out.println(p1);
		
	}
}
