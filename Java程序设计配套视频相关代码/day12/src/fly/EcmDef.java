package fly;

import java.util.Scanner;

public class EcmDef {

	// 两数相除
	public static int ecm(int num1, int num2)
			throws NumberFormatException, ArrayIndexOutOfBoundsException, ArithmeticException,Ecdef{
		if(num1 < 0 || num2 < 0) {
			throw new Ecdef("被除数或除数小于0");
		}
		return num1 / num2;
	}

	public static void main(String[] args) {

		int[] array = new int[2];
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入被除数（正数）");
		array[0] = scanner.nextInt();
		System.out.println("请输入除数（正数）");
		array[1] = scanner.nextInt();
		int quotient = 0;
		//计算两数相除
		try {
			quotient = ecm(array[0],array[1]);
			System.out.println(quotient);
		}catch(NumberFormatException e) {
			System.out.println("数据类型不一致");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("缺少参数");
		} catch (ArithmeticException e) {
			System.out.println("除数为0");
		} catch (Ecdef e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("出现异常");
		}finally {
			scanner.close();
		}		
	}
}
