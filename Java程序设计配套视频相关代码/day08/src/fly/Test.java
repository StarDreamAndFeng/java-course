package fly;

public class Test {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.walk();
		System.out.println();
		
		Man m = new Man();
		m.eat();
		m.walk();
		m.sleep();
		System.out.println();
		
		Person p2 = new Man();
		p2.eat();
		p2.walk();
		//p2.sleep();
		
		//instanceof
		if(p2 instanceof Women) {
			Women w = (Women)p2;
			w.sleep();
		}
		if(p2 instanceof Man) {
			Man m1 = (Man)p2;
			m1.sleep();
		}
		
	}
}
