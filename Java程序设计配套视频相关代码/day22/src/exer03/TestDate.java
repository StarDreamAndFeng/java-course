package exer03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class TestDate {

	@Test
	public void test() {

		String name = "������ȡ���Ψ�������h�u�����������������������ա�����ӱ��������������毡������桤�����ơ������ڡ�������������н������ͯ�������ơ����̳�������ݽ������Ӣ�������١������Ρ�����һ����ݼ楡������ء������顤���Պ졤��ޱ��������巡������ۡ������������ޱ�����D�硤���u�̡���ʩ�Ρ����۸ӡ������ġ�����ѩ�����ﺭ�������Ρ�����Ρ��������������¡�������������١������ġ������ɡ������B�����Ϸ�������֦������Ƚ�������硤�����ȡ������c�����Ȼ������������Ľ���������¡�����΢�������硤������";

		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == '��') {
				System.out.print("\",");
				System.out.println();
				System.out.print("\"");
				continue;
			}
			System.out.print(name.charAt(i));
		}
		System.out.println("\"");

	}

	public static void main(String[] args) {

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String time = "1983-9-23 23:34:12";

		try {
			date = sdf.parse(time);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println(sdf.format(date));
	}
}
