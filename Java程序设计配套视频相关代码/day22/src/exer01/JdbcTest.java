package exer01;

import java.text.DecimalFormat;
import java.util.Random;

import org.junit.Test;

public class JdbcTest {

	public static void main(String[] args) {
		
		JdbcTools.query();
		
	}

	public void test1() {
		String fruits[] = { "沙果", "海棠", "野樱莓", "枇杷", "欧楂", "山楂", "杏", "樱桃", "桃", "李子", "梅子", "橘子", "砂糖桔", "橙子", "柠檬",
				"青柠", "柚子", "金桔", "葡萄柚", "香橼", "佛手", "指橙", "黄皮果", "哈密瓜", "香瓜", "白兰瓜", "刺角瓜", "金铃子", "草莓", "菠萝莓", "黑莓",
				"覆盆子", "云莓", "罗甘莓", "白里叶莓", "葡萄", "提子", "醋栗", "黑醋栗", "红醋栗", "蓝莓", "蔓越莓", "越橘", "乌饭果", "柿子", "黑枣", "香蕉",
				"大蕉", "南洋红香", "无花果", "菠萝蜜", "构树果实", "牛奶果", "桑葚", "火龙果", "黄龙果", "红心火龙果", "仙人掌果", "荔枝", "龙眼", "红毛丹", "榴莲",
				"猴面包果", "阳桃", "三敛果", "椰子", "槟榔", "海枣", "蛇皮果", "莲雾", "嘉宝果", "番石榴", "菲油果", "苏里南苦樱桃", "枸杞", "香瓜茄", "灯笼果",
				"圣女果", "芒果", "山竹", "柑橘", "莲子" };

		// 调用JdbcTools里面的方法直接操控数据库
		for (int i = 1; i < 21; i++) {
			JdbcTools.insert(i, fruits[i - 1], getPrice(), 100);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("=====数据库操作完成=====");
	}

	public static float getPrice() {

		float price = 0f;

		price = new Random().nextInt(10) + new Random().nextFloat() + 1.0f;

		// 浮点型数据保留两位小数
		DecimalFormat decimalFormat = new DecimalFormat("#.00");

		// 以字符串的形式将保留2位小数的浮点型数据保留下来
		String s = decimalFormat.format(price);

		// 将其转换回来，还是为float型数据
		float f = Float.parseFloat(s);

		return f;

	}
}
