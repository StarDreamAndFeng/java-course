package fly;

public class Kids extends ManKind{
	private int yearsOld;
	
	public Kids() {
		
	}

	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}
	
	public void printAge() {
		System.out.println("年龄："+yearsOld+"岁");
	}
	
	@Override
	public void employeed(int salary) {//对父类进行重写、覆盖
		System.out.println("学生应该好好学习，而不是工作！");
	}
	
	public static void main(String[] args) {
		Kids someKid = new Kids();
		System.out.println("父类成员变量：" + someKid.getSex() + someKid.getSalary() );
		System.out.println("父类的方法:");
		someKid.manOrWomen(0);
		someKid.employeed(100);
		
		ManKind man = new ManKind();
		man.employeed(12);
		
	}
}
