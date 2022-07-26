package fly;

import java.util.Scanner;

public class EcmDef {

	// �������
	public static int ecm(int num1, int num2)
			throws NumberFormatException, ArrayIndexOutOfBoundsException, ArithmeticException,Ecdef{
		if(num1 < 0 || num2 < 0) {
			throw new Ecdef("�����������С��0");
		}
		return num1 / num2;
	}

	public static void main(String[] args) {

		int[] array = new int[2];
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����뱻������������");
		array[0] = scanner.nextInt();
		System.out.println("�����������������");
		array[1] = scanner.nextInt();
		int quotient = 0;
		//�����������
		try {
			quotient = ecm(array[0],array[1]);
			System.out.println(quotient);
		}catch(NumberFormatException e) {
			System.out.println("�������Ͳ�һ��");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ȱ�ٲ���");
		} catch (ArithmeticException e) {
			System.out.println("����Ϊ0");
		} catch (Ecdef e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("�����쳣");
		}finally {
			scanner.close();
		}		
	}
}
