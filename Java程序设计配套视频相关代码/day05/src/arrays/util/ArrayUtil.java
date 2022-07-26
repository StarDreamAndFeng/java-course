package arrays.util;
/*
 * 这里数组工具类
 */
public class ArrayUtil {
	 
		//求数组的最大值
		/**
		 * 
		 * @param arr  数组
		 * @return       返回数组中的最大值
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
	
		//求数组的最小值
		/**
		 * 
		 * @param arr 数组
		 * @return      返回数组中的最小值
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
	
		//遍历数组元素
		/**
		 * 
		 * @param arr  数组
		 */
		public void printArray(int[] arr) {
			System.out.print("数组遍历[");
			for(int i = 0;i < arr.length;i++) {
				if(i == arr.length - 1) {
					//到达最后一个元素
					System.out.print(arr[i]);
				}else {
					System.out.print(arr[i] + "\t");
				}			
			}
			System.out.println("]");
		}
		
		//求数组元素总和
		/**
		 * 
		 * @param arr 数组
		 * @return     返回数组的总和
		 */
		public int getSum(int[] arr) {
			int sum = 0;
			for(int i = 0;i < arr.length;i++) {
				sum += arr[i];
			}
			return sum;
		}
	
		//求数组的平均值
		/**
		 * 
		 * @param arr 数组
		 * @return    返回数组的平均值
		 */
		public int getAvg(int[] arr) {
			
			int sum = getSum(arr);
			return sum/arr.length;
		}
		
		//实现数组反转
		/**
		 * 
		 * @param arr  数组
		 * @return  返回一个反转的数组（在本身的基础上）
		 */
		public int[] reverse(int[] arr) {
			for(int x = 0,y = arr.length - 1; x < y;x++ , y--) {
				int temp = arr[x];
				arr[x] = arr[y];
				arr[y] = temp;
			}		
			return arr;
		}
		
		//实现数组的复制
		/**
		 * 
		 * @param arr   数组
		 * @return   返回一个新数组
		 */
		public int[] copy(int[] arr) {
			int[] arrNew = new int[arr.length];
			for(int i = 0;i < arr.length;i++) {
				arrNew[i] = arr[i];
			}
			return arrNew;
		}
		
		//对数组进行排序
		/**
		 * 
		 * @param arr   数组
		 * @param upAndDown   排序方式
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
				System.out.println("参数有误！");
			}
		}
		
		//交换数组中指定位置的两个元素
		public void swap(int[] arr,int i,int j) {
			
			//判断索引值i，j未出界
			if(i < 0 && i >= arr.length || j < 0 && j >= arr.length) {
				System.out.println("参数i,j有误，存在数组越界的可能！");//不会输出，因为编辑器会自动报错！
			}else {
				//无误
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}		
		}
}
