//YangHui.java                                           描述：打印输出杨辉三角
package fly2;

/*
 * 提示：
 * 		①每一行第一列和最后一列都为1
 * 		②YangHui[i][j] = YangHui[i-1][j-1] + YangHui[i-1][j];
 */

public class YangHui {

	private static int row = 10;//行
	private static int col = 10;//列
	
	public static void main(String[] args) {
		
		//初始化二维数组
		int[][] yangHui = new int[row][col]; 
		
		//赋值
		for(int i = 0;i < row;i++) {
			for(int j = 0;j <= i;j++) {
				if(j == 0 || j== i || i== 0) {
					//每一行的第一列和最后一列
					yangHui[i][j] = 1;
				}else {
					yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j];
				}
			}
		}
		
		//打印输出
		for(int i = 0;i < row;i++) {
			for(int j = 0;j <= i;j++) {
				System.out.print(yangHui[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
