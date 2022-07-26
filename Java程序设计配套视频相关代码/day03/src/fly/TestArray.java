//TestArray.java                          描述：数组练习

package fly;

public class TestArray {
	public static void main(String[] args) {
		
		//定义数组
		String[] names;
		int[] scores;
		
		//初始化数组 
		/**
		 * 两种初始化方式：
		 * 		①静态初始化：
		 * 		names = new String[]{"张三"};
		 * 		②动态初始化：
		 * 		scores = new Int[2];
		 * 		scores[0] = 100;
		 * 		scores[1] = 80;
		 */
		names = new String[]{"张三","李四","王五"};
		scores = new int[3];
		scores[0] = 89;
		scores[1] = 90;
		scores[2] = 78;
		
		//遍历数组
		System.out.println("学生\t分数");
		for(int i = 0;i < names.length;i++) {
			System.out.println(names[i]+"\t"+scores[i]);
		}
		
	}
}
