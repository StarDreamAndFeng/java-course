package testbanking;

import banking3.*;

public class TestBanking3 {
	
	public static void main(String[] args) {
		
		//�����˻��Ϳͻ�
		Account a1 = new Account(100.00);
		Customer c1 = new Customer("����","��");
		
		//���˻�
		c1.setAccount(a1);
		
		//��ѯ���
		System.out.println("�ͻ�["+c1.getLastName()+c1.getFisrtName()+"]"+"��ǰ��"+c1.getAccount().getBalance()+"Ԫ");
		
		//���
		System.out.println("�ͻ�["+c1.getLastName()+c1.getFisrtName()+"]"+"��Ǯ100.0Ԫ" + "\t������"+c1.getAccount().deposit(100.0));
		//c1.getAccount().deposit(100.0);
		
		//ȡ��
		System.out.println("�ͻ�["+c1.getLastName()+c1.getFisrtName()+"]"+"ȡǮ20.0Ԫ" + "\t������"+c1.getAccount().withdraw(20.0));
		//c1.getAccount().withdraw(20.0);
		
		//��ѯ���
		System.out.println("�ͻ�["+c1.getLastName()+c1.getFisrtName()+"]"+"��ǰ��"+c1.getAccount().getBalance()+"Ԫ");
		
	}
}
