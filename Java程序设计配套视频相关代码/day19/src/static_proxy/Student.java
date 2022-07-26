package static_proxy;

import java.util.Objects;

public class Student {

	private String name;//姓名
	private String sex;//性别
	private int id;//学号
	private double score;//分数
	private static int count;//学生个数
	
	/**
	 * 创建一个学生
	 * @param name 姓名
	 * @param sex     性别
	 * @param score  分数
	 */
	public Student(String name, String sex, double score) {
		super();
		count++;
		this.id = count;
		this.name = name;
		this.sex = sex;
		this.score = score;
	}
	
	public Student() {
		super();
		count++;
		this.id = count;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name, score, sex);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name) && score == other.score
				&& Objects.equals(sex, other.sex);
	}
	
	@Override
	public String toString() {
		return "学生[id=" + id + ",name=" + name + ", sex=" + sex +", score=" + score + "]";
	}
	
}
