package fly2;
/*
 * �Ӽ��̶���ѧ���ɼ�����ͳ����߷֣������ѧ���ɼ��ȼ�
 * �ɼ� >= ��߷� - 10   �ȼ�ΪA
 * �ɼ� >= ��߷� - 10   �ȼ�ΪB
 * �ɼ� >= ��߷� - 10   �ȼ�ΪC
 * ����                           �ȼ�ΪD
 * 
 * ��ʾ��������ѧ������������ѧ����������int���飬���ѧ���ɼ�
 */
import java.util.Scanner;

public class TestStudentScore {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ѧ��������");
		int num = scanner.nextInt();//����ѧ������
		int[] scores = new int[num];//���ѧ���ɼ�
		int max = 0;//��߷�
		//����ѧ���ɼ�
		for(int i = 0;i < num;i++) {
			System.out.println("�������"+ (i+1) +"��ѧ���ĳɼ�:");
			scores[i] = scanner.nextInt();//����ѧ���ɼ�
		}
		//�ҳ���߷�
		for(int i = 0;i < scores.length;i++) {
			if(scores[i] > max) {
				//�ҵ����ߵķ������滻max
				max = scores[i];
			}
		}
		//���ȼ�
		for(int i = 0;i < num;i++) {
			if(scores[i] >= max - 10) {
				System.out.println("ѧ��" + (i+1) + "�ɼ���" + scores[i] + "\t�ȼ���" + "A");
			}else if(scores[i] >= max - 20) {
				System.out.println("ѧ��" + (i+1) + "�ɼ���" + scores[i] + "\t�ȼ���" + "B");
			}else if(scores[i] >= max - 30) {
				System.out.println("ѧ��" + (i+1) + "�ɼ���" + scores[i] + "\t�ȼ���" + "C");
			}else{
				System.out.println("ѧ��" + (i+1) + "�ɼ���" + scores[i] + "\t�ȼ���" + "D");
			}
		}
		
		scanner.close();//�ر�scanner
	}	
}
