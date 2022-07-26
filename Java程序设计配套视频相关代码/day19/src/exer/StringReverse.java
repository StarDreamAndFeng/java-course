package exer;

import org.junit.Test;

public class StringReverse {
	
	@Test
	public void test1() {
		
		String str = reverse("helloworld");
		
		System.out.println(str);
		
		String str1 = reverse1("helloworld");
		
		System.out.println(str1);
		
		String str2 = reverse2("helloworld");
		
		System.out.println(str2);
		
	}
	
	//方法一
	public static String reverse(String str) {
		
		char[] c = str.toCharArray();//转换成字符输组
		
		for(int i = 0,j = str.length() - 1;i <= j;i++,j--) {
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
		}
		
		return new String(c);
	}
	
	//方法二：
	public static String reverse1(String str) {
		
		StringBuilder stringBuilder = new StringBuilder(str);
		
		return stringBuilder.reverse().toString();
		
	}
	
	//方法三：
	public static String reverse2(String str) {
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for(int i = str.length() - 1;i >= 0;i--) {
			stringBuilder.append(str.charAt(i));
		}
		
		return stringBuilder.toString();
		
	}

}




























