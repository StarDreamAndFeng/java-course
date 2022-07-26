package exer01;

import java.text.DecimalFormat;
import java.util.Random;

import org.junit.Test;

public class JdbcTest {

	public static void main(String[] args) {
		
		JdbcTools.query();
		
	}

	public void test1() {
		String fruits[] = { "ɳ��", "����", "Ұӣݮ", "����", "ŷ�", "ɽ�", "��", "ӣ��", "��", "����", "÷��", "����", "ɰ�ǽ�", "����", "����",
				"����", "����", "���", "������", "����", "����", "ָ��", "��Ƥ��", "���ܹ�", "���", "������", "�̽ǹ�", "������", "��ݮ", "����ݮ", "��ݮ",
				"������", "��ݮ", "�޸�ݮ", "����Ҷݮ", "����", "����", "����", "�ڴ���", "�����", "��ݮ", "��Խݮ", "Խ��", "�ڷ���", "����", "����", "�㽶",
				"��", "�������", "�޻���", "������", "������ʵ", "ţ�̹�", "ɣ��", "������", "������", "���Ļ�����", "�����ƹ�", "��֦", "����", "��ë��", "����",
				"�������", "����", "������", "Ҭ��", "����", "����", "��Ƥ��", "����", "�α���", "��ʯ��", "���͹�", "�����Ͽ�ӣ��", "���", "�����", "������",
				"ʥŮ��", "â��", "ɽ��", "����", "����" };

		// ����JdbcTools����ķ���ֱ�Ӳٿ����ݿ�
		for (int i = 1; i < 21; i++) {
			JdbcTools.insert(i, fruits[i - 1], getPrice(), 100);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("=====���ݿ�������=====");
	}

	public static float getPrice() {

		float price = 0f;

		price = new Random().nextInt(10) + new Random().nextFloat() + 1.0f;

		// ���������ݱ�����λС��
		DecimalFormat decimalFormat = new DecimalFormat("#.00");

		// ���ַ�������ʽ������2λС���ĸ��������ݱ�������
		String s = decimalFormat.format(price);

		// ����ת������������Ϊfloat������
		float f = Float.parseFloat(s);

		return f;

	}
}
