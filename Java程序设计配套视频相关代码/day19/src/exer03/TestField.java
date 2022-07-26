package exer03;

/*
 * 	��ȡ����
 */

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.Test;

public class TestField {

	@Test
	public void test1() throws Exception {
		
		String str = new String("exer03.Person");
		
		@SuppressWarnings("unchecked")
		Class<Person> clazz = (Class<Person>) Class.forName(str);
		
		//��ȡ����ʱ�������
		Field[]  fields  = clazz.getDeclaredFields();
		for(Field field : fields) {
			
			//1.��ȡ���Ե�Ȩ�����η�
			int i = field.getModifiers();//����ֵΪint��
			String str1 = Modifier.toString(i);
			System.out.print(str1 + " ");
			
			//2.��ȡ���Եı�������
			Class c =  field.getType();
			System.out.print(c.getName() + " ");
			
			//3.��ȡ���Եı�����
			System.out.println(field.getName());
			
			System.out.println();
		}
		
	}
}


