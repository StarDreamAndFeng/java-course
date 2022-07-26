package fly;

//测试两个对象（圆）的大小比较
public class TestInterface {

	public static void main(String[] args) {
		
		//创建两个comparableCircle对象，调用compareTo方法比较大小
		ComparableCircle c1 = new ComparableCircle(18);
		ComparableCircle c2 = new ComparableCircle(18);
		
		int ret = c1.compareTo(c2);
		
		if(ret == 0) {
			System.out.println("两个圆大小相等");
		}else if(ret > 0) {
			System.out.println("c1对象较大！");
		}else {
			System.out.println("c1对象较小！");
		}
		
	}
}

//接口 --> 比较两个对象的大小
interface CompareObject{
	
	public int compareTo(Object o);//若返回值等于0，代表相等；若为正数，代表当前对象大；若为负数，当前对象小
	
}

//接口实现类
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
			throw new RuntimeException("传入参数，非ComparableCircle类型");
		}
	}
	
}


//圆
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