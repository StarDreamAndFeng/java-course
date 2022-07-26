package exer;

import java.util.Map;
import java.util.TreeMap;

/*
 * 题目：
 * 		输入学生名与学生分数写进Map中，并按分数显示前三名成绩学员的名字
 */
public class Exercise2 {
	public static void main(String[] args) {
		
		TreeMap map = new TreeMap();
		
		//添加学生信息
		map.put(new Student("张三",89),1);
		map.put(new Student("李四",67),2);
		map.put(new Student("王五",90),3);
		map.put(new Student("张麻",87),4);
		map.put(new Student("李虎",85),5);

		System.out.println("前三名成绩学员:");
		System.out.println(map.keySet());
		
	}
}
