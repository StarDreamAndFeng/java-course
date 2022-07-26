package fly;

/*
 * 多维数组
 */

public class TestArray2 {

	public static void main(String[] args) {
		
		String[][] two = new String[10][18];  
		
		//赋值
		for(int i = 0;i < two.length;i++) {
			for(int j = 0;j < two[i].length;j++) {
				two[i][j] = "*";
			}
		}
		
		//打印输出
		for(int i = 0;i < two.length;i++) {
			for(int j = 0;j < two[i].length;j++) {
				System.out.print(two[i][j]);
			}
			System.out.println();
		}
		
	}
}
