//TestArray.java                          ������������ϰ

package fly;

public class TestArray {
	public static void main(String[] args) {
		
		//��������
		String[] names;
		int[] scores;
		
		//��ʼ������ 
		/**
		 * ���ֳ�ʼ����ʽ��
		 * 		�پ�̬��ʼ����
		 * 		names = new String[]{"����"};
		 * 		�ڶ�̬��ʼ����
		 * 		scores = new Int[2];
		 * 		scores[0] = 100;
		 * 		scores[1] = 80;
		 */
		names = new String[]{"����","����","����"};
		scores = new int[3];
		scores[0] = 89;
		scores[1] = 90;
		scores[2] = 78;
		
		//��������
		System.out.println("ѧ��\t����");
		for(int i = 0;i < names.length;i++) {
			System.out.println(names[i]+"\t"+scores[i]);
		}
		
	}
}
