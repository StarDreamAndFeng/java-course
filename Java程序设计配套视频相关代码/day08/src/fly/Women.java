package fly;

public class Women extends Person{

	private boolean beauty;

	public Women(String name, int age, boolean beauty) {
		super(name, age);
		this.beauty = beauty;
	}

	public Women(String name, int age) {
		super(name, age);
	}
	
	public Women() {
		super();
	}

	public boolean isBeauty() {
		return beauty;
	}

	public void setBeauty(boolean beauty) {
		this.beauty = beauty;
	}
	
	public void walk() {
		System.out.println("女人走路");
	}
	
	public void sleep() {
		System.out.println("女人睡觉");
	}
}
