package fly;

public class Man extends Person{
	private boolean smoking;

	public Man(String name, int age, boolean smoking) {
		super(name, age);
		this.smoking = smoking;
	}

	public Man(String name, int age) {
		super(name, age);
	}
	
	public Man() {
		super();
	}

	public boolean isSmoking() {
		return smoking;
	}

	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}
	
	public void walk() {
		System.out.println("男人走路");
	}
	
	public void sleep() {
		System.out.println("男人睡觉");
	}
}
