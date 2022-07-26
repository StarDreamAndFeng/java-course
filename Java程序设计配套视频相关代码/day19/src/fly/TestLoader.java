package fly;

import org.junit.Test;

public class TestLoader {

	@Test
	public void test1() {
		
		//应用类加载器(系统类加载器)
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		System.out.println(classLoader);
		
		//平台类加载器(扩展类加载器)
		ClassLoader classLoader1 = classLoader.getParent();
		System.out.println(classLoader1);
		
		//引导类加载器(无法直接获取)
		ClassLoader classLoader2 = classLoader1.getParent();
		System.out.println(classLoader2);//null
		
	}
}
