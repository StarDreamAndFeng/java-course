package exer03;

@MyAnnotation(value = "class Person")
public class Person extends Creature<String> implements Comparable<Object>,MyInterface{
	
	private static final long serialVersionUID = 1345334665432L;
	
	public String name;
	int age;
	protected String sex;
	private String address;
	
	public Person() {
		super();
	
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@MyAnnotation(value = "I am Person")
	public void show() {
		System.out.println("我是Person类");
	}

	public void sum(int a, int b) throws Exception{
		System.out.println(a + b);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	private void shadow() {
		System.out.println("私有方法");
	}

	@Override
	public int compareTo(Object o) {
	
		return 0;
	}
}
