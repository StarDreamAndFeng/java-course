package exer04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
 * ��������
 */

public class TestField {

	public static void main(String[] args) throws Exception {
		
		Class<Person> clazz = Person.class;
		
		//1.��ȡ������
		Constructor<Person> person = clazz.getConstructor();
		
		//2.ͨ������������һ������
		Person p1 =  person.newInstance();
		System.out.println(p1);
		
		//3.��ȡ����
		Field address =  clazz.getDeclaredField("address");
		
		//4.�������趨Ϊ�ɷ���
		address.setAccessible(true);
		
		//4.�����Խ��и�ֵ
		address.set(p1, "�й�����");
		
		//5.��ӡ�������Ϣ
		System.out.println(p1);
		
	}
}
