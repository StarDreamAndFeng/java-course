package fly2;

public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestPritimive d = new TestPritimive();//创建TestPritimive对象
		
		//输出boolean数组三个元素值
		for(int i = 0;i < d.t.length;i++) {
			System.out.println(d.t[i]);
		}
		
		System.out.println("修改后：");
		
		//赋值t的三个元素值为true
		for(int i = 0;i < d.t.length;i++) {
			d.t[i] = true;
		}
		//输出boolean数组三个元素值
		for(int i = 0;i < d.t.length;i++) {
			System.out.println(d.t[i]);
		}
		
	}

}
