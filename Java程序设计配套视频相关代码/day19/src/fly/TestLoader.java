package fly;

import org.junit.Test;

public class TestLoader {

	@Test
	public void test1() {
		
		//Ӧ���������(ϵͳ�������)
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		System.out.println(classLoader);
		
		//ƽ̨�������(��չ�������)
		ClassLoader classLoader1 = classLoader.getParent();
		System.out.println(classLoader1);
		
		//�����������(�޷�ֱ�ӻ�ȡ)
		ClassLoader classLoader2 = classLoader1.getParent();
		System.out.println(classLoader2);//null
		
	}
}
