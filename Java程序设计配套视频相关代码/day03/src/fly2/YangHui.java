//YangHui.java                                           ��������ӡ����������
package fly2;

/*
 * ��ʾ��
 * 		��ÿһ�е�һ�к����һ�ж�Ϊ1
 * 		��YangHui[i][j] = YangHui[i-1][j-1] + YangHui[i-1][j];
 */

public class YangHui {

	private static int row = 10;//��
	private static int col = 10;//��
	
	public static void main(String[] args) {
		
		//��ʼ����ά����
		int[][] yangHui = new int[row][col]; 
		
		//��ֵ
		for(int i = 0;i < row;i++) {
			for(int j = 0;j <= i;j++) {
				if(j == 0 || j== i || i== 0) {
					//ÿһ�еĵ�һ�к����һ��
					yangHui[i][j] = 1;
				}else {
					yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j];
				}
			}
		}
		
		//��ӡ���
		for(int i = 0;i < row;i++) {
			for(int j = 0;j <= i;j++) {
				System.out.print(yangHui[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
