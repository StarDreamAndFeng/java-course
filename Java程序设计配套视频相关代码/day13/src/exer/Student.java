package exer;

import java.util.Objects;

/*
 * 学生类
 */

public class Student implements Comparable{
	
	private String name;//学员名
	private int score;//学员成绩
	
	public Student() {
		super();
	}
	
	public Student(String name) {
		super();
		this.name = name;
	}

	public Student(int score) {
		super();
		this.score = score;
	}
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
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
		return Objects.equals(name, other.name);
	}
	
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student stu = (Student)o;
			int i = stu.getScore() - this.getScore();
			if(i == 0) {
				//成绩相等
				return stu.getName().compareTo(this.name);
			}
			return i;
		}
		return 0;
	}
	
}
