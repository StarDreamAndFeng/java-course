package fly;

import java.lang.reflect.Constructor;

//ͨ����������ȡ���󣬲����÷���

public class TestReflect2 {

	public static void main(String[] args) throws Exception {
		
		/*
		 * ��ȷʾ����
		 */
		
		//����һ����
		Class<Student> clazz = Student.class;
		
		//��ȡ�������Ĺ�����
		Constructor<Student> constructor = clazz.getDeclaredConstructor(String.class,Integer.class);
		
		//�ɻ�ȡ�Ĺ���������һ������
		Student student = constructor.newInstance("����",18);
		
		//��ӡ
		System.out.println(student);
	}	
}
