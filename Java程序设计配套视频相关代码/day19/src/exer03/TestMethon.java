package exer03;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.Test;

public class TestMethon {
	
	@Test 
	public void test2() {
		
		Class<Person> clazz = Person.class;
		
		Method[] methods =  clazz.getDeclaredMethods();
		for(Method method : methods) {
			
			//1.��ȡע��
			Annotation[] annotation =  method.getAnnotations();
			for(Annotation a : annotation) {
				System.out.println(a);
			}
			
			//2.��ȡȨ�����η�
			int i = method.getModifiers();
			String str = Modifier.toString(i);
			System.out.print(str + " ");
			
			//3.��ȡ��������
			Class returnType = method.getReturnType();
			System.out.print(returnType.getName() + " ");
			
			//4.��ȡ������
			System.out.print(method.getName());
			
			//5.��ȡ�����б�
			Class[] param =  method.getParameterTypes();
			System.out.print("(");
			for(int j = 0;j < param.length;j++) {	
				if(j == param.length - 1) {
					System.out.print(param[j].getName() + " args-" + j);
				}else {
					System.out.print(param[j].getName() + " args-" + j + ",");
				}
			}
			System.out.print(")");
			
			//6.��ȡ�쳣
			Class[] exceptions =  method.getExceptionTypes();
			if(exceptions.length != 0) {
				//������쳣,�����throws 
				System.out.print(" throws ");
			}
			
			for(int j = 0;j < exceptions.length;j++) {
				System.out.print(exceptions[j].getName() + " ");
			}
			
			System.out.println();
			
		}
	}
}

/*
@Test
public void test1() {
	
	Class<Person> clazz = Person.class;
	
	//getMethods():��ȡ����ʱ�༰�丸�������Ϊpublic�ķ���
	Method[] methods =  clazz.getMethods();
	for(Method method : methods) {
		System.out.println(method);
	}
	
	System.out.println();
	
	//getDeclaredMethods() : ��ȡ����ʱ������з���
	Method[] methods2 =  clazz.getDeclaredMethods();
	for(Method method : methods2) {
		System.out.println(method);
	}
	
}
*/