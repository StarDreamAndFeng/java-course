package exer03;

/*
 * 	获取属性
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
		
		//获取运行时类的属性
		Field[]  fields  = clazz.getDeclaredFields();
		for(Field field : fields) {
			
			//1.获取属性的权限修饰符
			int i = field.getModifiers();//返回值为int型
			String str1 = Modifier.toString(i);
			System.out.print(str1 + " ");
			
			//2.获取属性的变量类型
			Class c =  field.getType();
			System.out.print(c.getName() + " ");
			
			//3.获取属性的变量名
			System.out.println(field.getName());
			
			System.out.println();
		}
		
	}
}


