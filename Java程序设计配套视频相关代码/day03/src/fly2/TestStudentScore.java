package fly2;
/*
 * 从键盘读入学生成绩，并统计最高分，并输出学生成绩等级
 * 成绩 >= 最高分 - 10   等级为A
 * 成绩 >= 最高分 - 10   等级为B
 * 成绩 >= 最高分 - 10   等级为C
 * 其余                           等级为D
 * 
 * 提示：先输入学生个数，根据学生人数创建int数组，存放学生成绩
 */
import java.util.Scanner;

public class TestStudentScore {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入学生个数：");
		int num = scanner.nextInt();//输入学生个数
		int[] scores = new int[num];//存放学生成绩
		int max = 0;//最高分
		//输入学生成绩
		for(int i = 0;i < num;i++) {
			System.out.println("请输入第"+ (i+1) +"个学生的成绩:");
			scores[i] = scanner.nextInt();//输入学生成绩
		}
		//找出最高分
		for(int i = 0;i < scores.length;i++) {
			if(scores[i] > max) {
				//找到更高的分数，替换max
				max = scores[i];
			}
		}
		//评等级
		for(int i = 0;i < num;i++) {
			if(scores[i] >= max - 10) {
				System.out.println("学生" + (i+1) + "成绩：" + scores[i] + "\t等级：" + "A");
			}else if(scores[i] >= max - 20) {
				System.out.println("学生" + (i+1) + "成绩：" + scores[i] + "\t等级：" + "B");
			}else if(scores[i] >= max - 30) {
				System.out.println("学生" + (i+1) + "成绩：" + scores[i] + "\t等级：" + "C");
			}else{
				System.out.println("学生" + (i+1) + "成绩：" + scores[i] + "\t等级：" + "D");
			}
		}
		
		scanner.close();//关闭scanner
	}	
}
