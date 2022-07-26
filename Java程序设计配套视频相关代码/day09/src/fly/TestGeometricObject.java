package fly;

import java.util.Objects;

public class TestGeometricObject {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		//�ж���ɫ�Ƿ����
		if(c1.getColor().equals(c2.getColor())) {
			System.out.println("����Բ����ɫ���"+"����ɫΪ��"+c1.getColor());
		}else {
			System.out.println("����Բ����ɫ�����"+",c1��ɫΪ��"+c1.getColor()+";c2��ɫΪ��"+c2.getColor());
		}
		
		//����equals�жϰ뾶�Ƿ����
		if(c1.equals(c2)) {
			System.out.println("����Բ�İ뾶���"+",�뾶Ϊ��"+c1.getRadius());
		}else {
			System.out.println("����Բ�İ뾶�����"+",c1�뾶Ϊ��"+c1.getRadius() + ";c2�뾶Ϊ��" + c2.getRadius());
		}
		
		//��ӡԲ����Ϣ��ʹ��toString
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
	
	//����Բ�����
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
