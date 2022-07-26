package arrays.util;
/*
 * �������鹤����
 */
public class ArrayUtil {
	 
		//����������ֵ
		/**
		 * 
		 * @param arr  ����
		 * @return       ���������е����ֵ
		 */
		public int getMax(int[] arr) {
			int max = arr[0];
			for(int i = 1;i < arr.length;i++) {
				if(max < arr[i]) {
					max = arr[i];
				}
			}
			return max;
		}
	
		//���������Сֵ
		/**
		 * 
		 * @param arr ����
		 * @return      ���������е���Сֵ
		 */
		public int getMin(int[] arr) {
			int min = arr[0];
			for(int i = 1;i < arr.length;i++) {
				if(min > arr[i]) {
					min = arr[i];
				}
			}
			return min;
		}
	
		//��������Ԫ��
		/**
		 * 
		 * @param arr  ����
		 */
		public void printArray(int[] arr) {
			System.out.print("�������[");
			for(int i = 0;i < arr.length;i++) {
				if(i == arr.length - 1) {
					//�������һ��Ԫ��
					System.out.print(arr[i]);
				}else {
					System.out.print(arr[i] + "\t");
				}			
			}
			System.out.println("]");
		}
		
		//������Ԫ���ܺ�
		/**
		 * 
		 * @param arr ����
		 * @return     ����������ܺ�
		 */
		public int getSum(int[] arr) {
			int sum = 0;
			for(int i = 0;i < arr.length;i++) {
				sum += arr[i];
			}
			return sum;
		}
	
		//�������ƽ��ֵ
		/**
		 * 
		 * @param arr ����
		 * @return    ���������ƽ��ֵ
		 */
		public int getAvg(int[] arr) {
			
			int sum = getSum(arr);
			return sum/arr.length;
		}
		
		//ʵ�����鷴ת
		/**
		 * 
		 * @param arr  ����
		 * @return  ����һ����ת�����飨�ڱ���Ļ����ϣ�
		 */
		public int[] reverse(int[] arr) {
			for(int x = 0,y = arr.length - 1; x < y;x++ , y--) {
				int temp = arr[x];
				arr[x] = arr[y];
				arr[y] = temp;
			}		
			return arr;
		}
		
		//ʵ������ĸ���
		/**
		 * 
		 * @param arr   ����
		 * @return   ����һ��������
		 */
		public int[] copy(int[] arr) {
			int[] arrNew = new int[arr.length];
			for(int i = 0;i < arr.length;i++) {
				arrNew[i] = arr[i];
			}
			return arrNew;
		}
		
		//�������������
		/**
		 * 
		 * @param arr   ����
		 * @param upAndDown   ����ʽ
		 */
		public void sort(int[] arr,String upAndDown) {
			if(upAndDown == "from_min_to_max") {
				for(int i = 0;i < arr.length - 1;i++) {
					for(int j = 0; j < arr.length - 1 - i;j++) {
						if(arr[j] > arr[j+1]) {
							swap(arr,j,j+1);
						}
					}
				}
			}else if(upAndDown == "from_max_to_min") {
				for(int i = 0;i < arr.length - 1;i++) {
					for(int j = 0; j < arr.length - 1 - i;j++) {
						if(arr[j] < arr[j+1]) {
							swap(arr,j,j+1);
						}
					}
				}
			}else {
				System.out.println("��������");
			}
		}
		
		//����������ָ��λ�õ�����Ԫ��
		public void swap(int[] arr,int i,int j) {
			
			//�ж�����ֵi��jδ����
			if(i < 0 && i >= arr.length || j < 0 && j >= arr.length) {
				System.out.println("����i,j���󣬴�������Խ��Ŀ��ܣ�");//�����������Ϊ�༭�����Զ�����
			}else {
				//����
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}		
		}
}
