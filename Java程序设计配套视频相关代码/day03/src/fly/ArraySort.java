package fly;

import java.util.Arrays;

/*
 * ��������
 */

public class ArraySort {

	public static void main(String[] args) {
		
		
		int[] arr = new int[] {12,-9,8,34,78,45,7,20};
		
		System.out.println("���鳤�ȣ�"+arr.length);
		
		//����
		System.out.println("����ǰ��");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
		
		Arrays.sort(arr);//�Դ��������㷨
		
		//����
		System.out.println("\n�����");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
		
	}
}
