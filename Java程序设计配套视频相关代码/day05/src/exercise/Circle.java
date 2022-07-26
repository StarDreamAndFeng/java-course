package exercise;

import java.math.BigDecimal;

/*
 * ����Բ�����
 */

public class Circle {

	final double PI = 3.1415926;
	double r;//�뾶
	
	public void setRadius(double r) {
		this.r = r;
	}
	
	public double getRadius() {
		return this.r;
	}
	
	public double circleArea(double r) {
		double area = 0.0;
		
		area = PI * r * r;
		
		return area;
		
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Circle  c1 = new Circle();
		
		c1.setRadius(2.5);//����Բ�İ뾶
		
		double r1 = c1.getRadius();//��ȡԲ�İ뾶
		
		double circleArea1 = c1.circleArea(r1);//��Բ�����
		
		BigDecimal circleArea1_bd = new BigDecimal(circleArea1);
		circleArea1_bd = circleArea1_bd.setScale(2,BigDecimal.ROUND_HALF_UP);
		
		System.out.println("�뾶Ϊ"+c1.getRadius()+"��Բ�����Ϊ��"+circleArea1_bd);
		
		Circle  c2 = new Circle();
		
		c2.setRadius(5);//����Բ�İ뾶
		
		double r2 = c2.getRadius();//��ȡԲ�İ뾶
		
		double circleArea2 = c2.circleArea(r2);//��Բ�����
		
		BigDecimal circleArea2_bd = new BigDecimal(circleArea2);
		circleArea2_bd = circleArea2_bd.setScale(2,BigDecimal.ROUND_HALF_UP);
		
		System.out.println("�뾶Ϊ"+c2.getRadius()+"��Բ�����Ϊ��"+circleArea2_bd);
			
	}
	
}
