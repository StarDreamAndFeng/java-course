package fly;

public class Student {

	private String name;
	private Integer age;
	
	public Student() {
		
	}

	public Student(Integer age) {
		super();
		this.age = age;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void show() {
		System.out.println("----------------------------");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
