package exer04;

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
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", address=" + address + "]";
	}

	private void shadow() {
		System.out.println("私有方法");
	}
	
	public static void output() {
		System.out.println("静态方法");
	}

	@Override
	public int compareTo(Object o) {
	
		return 0;
	}
}
