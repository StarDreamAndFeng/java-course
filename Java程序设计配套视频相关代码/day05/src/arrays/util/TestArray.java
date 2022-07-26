package arrays.util;

public class TestArray {
	public static void main(String[] args) {
		
		int[] arr1 = new int[] {12,23,56,5,-67,-23,8,34};
		
		System.out.println("���鳤�ȣ�"+arr1.length);
		
		ArrayUtil arrayUtil = new ArrayUtil();//����һ�����鹤�߶���
		
		//���������ֵ
		int arr1Max = arrayUtil.getMax(arr1);
		System.out.println("arr1�����ֵ��"+arr1Max);
		
		//��������Сֵ
		int arr1Min = arrayUtil.getMin(arr1);
		System.out.println("arr1����Сֵ��"+arr1Min);
		
		//��������
		arrayUtil.printArray(arr1);
		
		//�������ܺ�
		int arr1Sum = arrayUtil.getSum(arr1);
		System.out.println("arr1�ܺͣ�"+arr1Sum);
		
		//������ƽ��ֵ
		int arr1Avg = arrayUtil.getAvg(arr1);
		System.out.println("arr1�ܺͣ�"+arr1Avg);
		
		//���鸴��
		int[] arr2 = arrayUtil.copy(arr1);
		arrayUtil.printArray(arr2);
		
		//���鷴ת
		arrayUtil.reverse(arr2);
		arrayUtil.printArray(arr1);
		arrayUtil.printArray(arr2);
		
		//��������
		System.out.println("�����С����");
		arrayUtil.sort(arr1,"from_min_to_max");
		arrayUtil.printArray(arr1);
		System.out.println("����Ӵ�С��");
		arrayUtil.sort(arr1,"from_max_to_min");
		arrayUtil.printArray(arr1);
		
		//���齻��
		arrayUtil.swap(arr1, 0, 7);
		arrayUtil.printArray(arr1);
 	}
}
