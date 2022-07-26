package exer03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class TestConstructor {
	
	public static void main(String[] args) {
		
		Class<Person> clazz = Person.class;
		
		Constructor[] constructors = clazz.getDeclaredConstructors();
		
		for(Constructor c : constructors) {
			
			//1.获取构造器的权限修饰符
			System.out.print(Modifier.toString(c.getModifiers()) + " ");
			
			//2.获取构造器名
			System.out.print(c.getName());
			
			//3.获取构造器参数列表
			Class[] param =  c.getParameterTypes();
			System.out.print("(");
			for(int i = 0;i < param.length;i++) {
				if(i == param.length - 1) {
					System.out.print(param[i].getName() + " args-" + i);
				}else {
					System.out.print(param[i].getName() + " args-" + i + ",");
				}
			}
			System.out.println(")");
			
		}		
	}
}
