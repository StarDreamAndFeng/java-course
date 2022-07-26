package fly;

import java.util.Objects;

public class TestGeometricObject {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		//判断颜色是否相等
		if(c1.getColor().equals(c2.getColor())) {
			System.out.println("两个圆的颜色相等"+"，颜色为："+c1.getColor());
		}else {
			System.out.println("两个圆的颜色不相等"+",c1颜色为："+c1.getColor()+";c2颜色为："+c2.getColor());
		}
		
		//利用equals判断半径是否相等
		if(c1.equals(c2)) {
			System.out.println("两个圆的半径相等"+",半径为："+c1.getRadius());
		}else {
			System.out.println("两个圆的半径不相等"+",c1半径为："+c1.getRadius() + ";c2半径为：" + c2.getRadius());
		}
		
		//打印圆的信息，使用toString
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}

class GeometricObject {
	protected String color;
	protected double weight;

	public GeometricObject() {
		super();
		color = "white";
		weight = 1.0;
	}

	public GeometricObject(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeometricObject other = (GeometricObject) obj;
		return Objects.equals(color, other.color)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	@Override
	public String toString() {
		return "GeometricObject [color=" + color + ", weight=" + weight + "]" + "@" + Integer.toHexString(hashCode());
	}

}

class Circle extends GeometricObject {
	private double radius;

	public Circle() {
		super();
		color = "white";
		weight = 1.0;
		radius = 1.0;
	}

	public Circle(double radius) {
		super("white",1.0);
		this.radius = radius;
	}
	
	public Circle(double radius,String color,double weight) {
		super(color,weight);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//计算圆的面积
	public double findArea() {
		return Math.PI*radius*radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj instanceof Circle) {
			Circle otherObj = (Circle)obj;
			return otherObj.radius == this.radius;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Circle" + "[radius=" + radius + "]";
	}
}
