package testbanking;

import banking1.Account;

public class TestBanking1 {
	
	public static void main(String[] args) {
		
		//�����˻�
		Account a1 = new Account(100.00);
		
		//��ѯ���
		System.out.println("��ǰ��"+a1.getBalance()+"Ԫ");
		
		//���
		System.out.println("��Ǯ100.0Ԫ");
		a1.deposit(100.00);
		
		//ȡ��
		System.out.println("ȡǮ20.0Ԫ");
		a1.withdraw(20.00);
		
		//��ѯ���
		System.out.println("��ǰ��"+a1.getBalance()+"Ԫ");
		
	}
}
