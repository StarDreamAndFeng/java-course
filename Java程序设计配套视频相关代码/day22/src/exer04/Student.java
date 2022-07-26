package exer04;

import java.util.Date;

public class Student {
	
	int id;//学号
	String stuname;//姓名
	String sex;//性别
	Date birth;//生日
	String telphone;//电话
	String addr;//地址
	
	public Student() {

	}

	public Student(int id, String stuname, String sex, Date birth, String telphone, String addr) {
		super();
		this.id = id;
		this.stuname = stuname;
		this.sex = sex;
		this.birth = birth;
		this.telphone = telphone;
		this.addr = addr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", stuname=" + stuname + ", sex=" + sex + ", birth=" + birth + ", telphone="
				+ telphone + ", addr=" + addr + "]";
	}

}
