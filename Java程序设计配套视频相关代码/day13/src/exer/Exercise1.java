package exer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * ��Ŀ��
 * �Ӽ���������10���������浽list�У�����<���򡢴Ӵ�С>��˳����ʾ����
 */

public class Exercise1 {
	public static void main(String[] args) {
		
		//����10������������ӵ�list��
		Scanner scanner = new Scanner(System.in);
		List list = new ArrayList();
		for(int i = 0;i < 10;i++) {
			System.out.println("�������"+(i+1)+"�����֣�");
			list.add(scanner.nextInt());
		}
		
		//�������
		Collections.sort(list);
		Collections.reverse(list);
		
		//��ӡ���listԪ��
		System.out.println(list);
		
		scanner.close();
		
	}
}
