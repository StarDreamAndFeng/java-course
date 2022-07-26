package static_proxy;

import java.util.Objects;

public class Student {

	private String name;//����
	private String sex;//�Ա�
	private int id;//ѧ��
	private double score;//����
	private static int count;//ѧ������
	
	/**
	 * ����һ��ѧ��
	 * @param name ����
	 * @param sex     �Ա�
	 * @param score  ����
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
		return "ѧ��[id=" + id + ",name=" + name + ", sex=" + sex +", score=" + score + "]";
	}
	
}
