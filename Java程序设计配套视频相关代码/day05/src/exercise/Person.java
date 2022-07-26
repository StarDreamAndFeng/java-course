package exercise;

public class Person {

	// Ù–‘
	String name;
	int age;
	int sex;
	
	//∑Ω∑®
	public void study() {
		System.out.println("studing");
	}
	
	public void showAge() {
		System.out.println(age);
	}
	
	public void addAge(int i) {
		age += i;
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		p1.study();
		System.out.print("P1's age:");
		p1.showAge();
		p1.addAge(2);
		System.out.print("P1's age:");
		p1.showAge();
		
		Person p2 = new Person();
		p2.study();
		System.out.print("P2's age:");
		p2.showAge();
		p2.addAge(3);
		System.out.print("P2's age:");
		p2.showAge();
		
	}
}
