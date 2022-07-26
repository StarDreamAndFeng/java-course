package exer04;

import java.text.SimpleDateFormat;
import java.util.Date;


import org.junit.Test;

public class JdbcTest {

	@Test
	public void test1() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

//		String[] name = { "刘旎娜", "刘唯芳", "刘玥妘", "刘欣儿", "刘浚雯", "刘丁菡", "刘音颖", "刘静晓", "刘锦姣", "刘昭萱", "刘书云", "刘丹钰", "刘涵瑶",
//				"刘晨薪", "刘羽童", "刘芮悠", "刘嫣晨", "刘槿萁", "刘朝英", "刘扬琴", "刘柠涛", "刘卉一", "刘菁妤", "刘昀蓉", "刘楚洪", "刘菡婌", "刘薇涵", "刘洪宸",
//				"刘玉芹", "刘姝梓", "刘尚薇", "刘燚圭", "刘妘嫣", "刘施嘉", "刘慧赣", "刘琴心", "刘蕾雪", "刘绎涵", "刘音梦", "刘忆嘉", "刘誉函", "刘依月", "刘璐欣",
//				"刘琳蕾", "刘轲文", "刘伊嵘", "刘冬珺", "刘煜凡", "刘丽枝", "刘荷冉", "刘梦茜", "刘荣娜", "刘俐昪", "刘瑜然", "刘若敏", "刘慕熙", "刘晴月", "刘晨微",
//				"刘玉如", "刘韶婷" };

//		// 添加学生
//		Student student = null;
//		for (int i = 1006; i < 1020; i++) {
//			
//			student = createStudent(i, name[i-1006], "女", sdf.parse("2000-12-23 12:00:42"), "19218229802", "重庆市沙坪坝区都市花园中路111号");
//			addStudent(student);
//		}
		
		//添加学生
//		Student student = createStudent(1020, "黎丙赣", "男",sdf.parse("2003-3-17 8:23:9"), "15210762300", "成都市武侯区郭家桥正街7号");
//
//		addStudent(student);
		
		// 查询学生
//		searchStudent(1001);
//		searchStudent(1002);
//		searchStudent(1003);
//		searchStudent(1004);
//		searchStudent(1005);
//		searchStudent(1006);
//		searchStudent(1007);

		// 删除学生
		deleteStudent(1019);
		deleteStudent(1020);

	}

	/**
	 * 创建一个学生
	 * 
	 * @param id       学号
	 * @param stuname  姓名
	 * @param sex      性别
	 * @param birth    生日
	 * @param telphone 电话
	 * @param addr     地址
	 * @return 返回一个学生
	 */
	public Student createStudent(int id, String stuname, String sex, Date birth, String telphone, String addr) {

		// 创建学生
		Student student = new Student(id, stuname, sex, birth, telphone, addr);

		return student;
	}

	/**
	 * 添加一个新学生
	 * 
	 * @param student 学生
	 */
	public void addStudent(Student student) {

		// 1.准备SQL语句
		String sql = "INSERT INTO student VALUES(?,?,?,?,?,?);";

		// 2.调用JdbcTools里面的执行工具
		JdbcTools.update(sql,student.getId(),student.getStuname(),student.getSex(),
				student.getBirth(),student.getTelphone(),student.getAddr());
		
		System.out.println("添加学生成功！");
	}

	/**
	 * 删除一个学生
	 * 
	 * @param student 学生
	 */
	public void deleteStudent(int id) {

		// 1.准备SQL语句
		String sql = "DELETE FROM student WHERE id = ?;";

		// 2.调用JdbcTools里面的执行工具
		JdbcTools.update(sql,id);
		System.out.println("删除学生成功！");
	}

	/**
	 * 查找学生【通过学号】
	 * 
	 * @param id
	 */
	public void searchStudent(int id) {

		// 1.准备SQL语句
		String sql = "SELECT id,stuname,sex,birth,telphone,addr FROM student  WHERE id = ?;";

		// 2.通过SQL语句获取学生
		Student student = JdbcTools.getStudent(sql,id);

		// 3.打印学生基本信息
		printStudent(student);

	}

	/**
	 * 打印学生信息
	 * 
	 * @param student
	 */
	private void printStudent(Student student) {

		if (student != null) {

			// 当student 不为空时，打印输出
			System.out.println("==学生基本信息==");
			System.out.println("学号：" + "\t" + student.getId());
			System.out.println("姓名：" + "\t" + student.getStuname());
			System.out.println("性别：" + "\t" + student.getSex());
			System.out.println("生日：" + "\t" + student.getBirth());
			System.out.println("电话：" + "\t" + student.getTelphone());
			System.out.println("地址：" + "\t" + student.getAddr());
		} else {
			System.out.println("未找到该学生,请换一个学号或者姓名试试");
		}

	}

	/**
	 * 查找学生【通过姓名】
	 * 
	 * @param name
	 */
	public void searchStudent(String name) {
		// 1.准备SQL语句
		String sql = "SELECT id,stuname,sex,birth,telphone,addr FROM student  WHERE name = ?;";

		// 2.通过SQL语句获取学生
		Student student = JdbcTools.getStudent(sql,name);

		// 3.打印学生基本信息
		printStudent(student);
	}

}
