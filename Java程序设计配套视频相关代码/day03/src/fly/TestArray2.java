package fly;

/*
 * ��ά����
 */

public class TestArray2 {

	public static void main(String[] args) {
		
		String[][] two = new String[10][18];  
		
		//��ֵ
		for(int i = 0;i < two.length;i++) {
			for(int j = 0;j < two[i].length;j++) {
				two[i][j] = "*";
			}
		}
		
		//��ӡ���
		for(int i = 0;i < two.length;i++) {
			for(int j = 0;j < two[i].length;j++) {
				System.out.print(two[i][j]);
			}
			System.out.println();
		}
		
	}
}
