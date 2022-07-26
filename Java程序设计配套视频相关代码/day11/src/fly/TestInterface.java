package fly;

//������������Բ���Ĵ�С�Ƚ�
public class TestInterface {

	public static void main(String[] args) {
		
		//��������comparableCircle���󣬵���compareTo�����Ƚϴ�С
		ComparableCircle c1 = new ComparableCircle(18);
		ComparableCircle c2 = new ComparableCircle(18);
		
		int ret = c1.compareTo(c2);
		
		if(ret == 0) {
			System.out.println("����Բ��С���");
		}else if(ret > 0) {
			System.out.println("c1����ϴ�");
		}else {
			System.out.println("c1�����С��");
		}
		
	}
}

//�ӿ� --> �Ƚ���������Ĵ�С
interface CompareObject{
	
	public int compareTo(Object o);//������ֵ����0��������ȣ���Ϊ����������ǰ�������Ϊ��������ǰ����С
	
}

//�ӿ�ʵ����
class ComparableCircle extends Circle implements CompareObject{

	public ComparableCircle(int radius) {
		super(radius);
	}
	
	@Override
	public int compareTo(Object o) {
		if(this == o) {
			return 0;
		}else if(o instanceof ComparableCircle) {
			ComparableCircle c = (ComparableCircle)o;
			if(this.getRadius() > c.getRadius()) {
				return 1;
			}else if(this.getRadius() < c.getRadius()) {
				return -1;
			}else {
				return 0;
			}
		}else {
			throw new RuntimeException("�����������ComparableCircle����");
		}
	}
	
}


//Բ
class Circle{
	private int radius;
	
	public Circle() {
		super();
	}
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}