package exer;

import java.util.Map;
import java.util.TreeMap;

/*
 * ��Ŀ��
 * 		����ѧ������ѧ������д��Map�У�����������ʾǰ�����ɼ�ѧԱ������
 */
public class Exercise2 {
	public static void main(String[] args) {
		
		TreeMap map = new TreeMap();
		
		//���ѧ����Ϣ
		map.put(new Student("����",89),1);
		map.put(new Student("����",67),2);
		map.put(new Student("����",90),3);
		map.put(new Student("����",87),4);
		map.put(new Student("�",85),5);

		System.out.println("ǰ�����ɼ�ѧԱ:");
		System.out.println(map.keySet());
		
	}
}
