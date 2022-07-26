package arrays.util;

public class TestArray {
	public static void main(String[] args) {
		
		int[] arr1 = new int[] {12,23,56,5,-67,-23,8,34};
		
		System.out.println("数组长度："+arr1.length);
		
		ArrayUtil arrayUtil = new ArrayUtil();//创建一个数组工具对象
		
		//求数组最大值
		int arr1Max = arrayUtil.getMax(arr1);
		System.out.println("arr1中最大值："+arr1Max);
		
		//求数组最小值
		int arr1Min = arrayUtil.getMin(arr1);
		System.out.println("arr1中最小值："+arr1Min);
		
		//遍历数组
		arrayUtil.printArray(arr1);
		
		//求数组总和
		int arr1Sum = arrayUtil.getSum(arr1);
		System.out.println("arr1总和："+arr1Sum);
		
		//求数组平均值
		int arr1Avg = arrayUtil.getAvg(arr1);
		System.out.println("arr1总和："+arr1Avg);
		
		//数组复制
		int[] arr2 = arrayUtil.copy(arr1);
		arrayUtil.printArray(arr2);
		
		//数组反转
		arrayUtil.reverse(arr2);
		arrayUtil.printArray(arr1);
		arrayUtil.printArray(arr2);
		
		//数组排序
		System.out.println("数组从小到大：");
		arrayUtil.sort(arr1,"from_min_to_max");
		arrayUtil.printArray(arr1);
		System.out.println("数组从大到小：");
		arrayUtil.sort(arr1,"from_max_to_min");
		arrayUtil.printArray(arr1);
		
		//数组交换
		arrayUtil.swap(arr1, 0, 7);
		arrayUtil.printArray(arr1);
 	}
}
