package exer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * 题目：
 * 从键盘上输入10个整数保存到list中，并按<倒序、从大到小>的顺序显示出来
 */

public class Exercise1 {
	public static void main(String[] args) {
		
		//输入10个整数，并添加到list中
		Scanner scanner = new Scanner(System.in);
		List list = new ArrayList();
		for(int i = 0;i < 10;i++) {
			System.out.println("请输入第"+(i+1)+"个数字：");
			list.add(scanner.nextInt());
		}
		
		//排序规则
		Collections.sort(list);
		Collections.reverse(list);
		
		//打印输出list元素
		System.out.println(list);
		
		scanner.close();
		
	}
}
