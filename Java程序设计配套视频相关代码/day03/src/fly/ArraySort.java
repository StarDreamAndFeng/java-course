package fly;

import java.util.Arrays;

/*
 * 数组排序
 */

public class ArraySort {

	public static void main(String[] args) {
		
		
		int[] arr = new int[] {12,-9,8,34,78,45,7,20};
		
		System.out.println("数组长度："+arr.length);
		
		//遍历
		System.out.println("排序前：");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
		
		Arrays.sort(arr);//自带的排序算法
		
		//遍历
		System.out.println("\n排序后：");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
		
	}
}
