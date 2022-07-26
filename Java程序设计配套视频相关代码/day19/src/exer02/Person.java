package exer02;

public class Person implements java.io.Serializable{
	
	public static final long serialVersionUID = 1346518391879302182L;
	
	private String name;

	public Person() {
		super();
	
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void show() {
		System.out.println("Œ“ «Person¿‡");
	}

	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}
