package fly;

public class TestOrder {

	public static void main(String[] args) {
		Order o1 = new Order("小明",20);
		Order o2 = new Order("小明",20);
		Order o3 = o1;
		
		System.out.println(o1 == o2);//f
		System.out.println(o1 == o3);//t
		System.out.println(o1.equals(o2));//t
		
	}
}
