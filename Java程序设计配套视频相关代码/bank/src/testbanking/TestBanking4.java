package testbanking;

import banking4.*;

public class TestBanking4 {

	public static void main(String[] args) {
		
		Bank bank = new Bank(5);//��һ������,�����5���ͻ�
		
		//�����ͻ�
		bank.addCustomer("��", "��");
		bank.addCustomer("��", "��");
		bank.addCustomer("��", "��");
		
		//��ӡ�ͻ���Ϣ
		for(int i = 0;i < bank.getNumberOfCustomers();i++) {
			Customer customer = bank.getCustomer(i);//ָ��һ���ͻ�
			System.out.println("�ͻ�[���000"+(i+1)+"]:"+customer.getLastName()+customer.getFisrtName());
		}
		
		//����
		Customer customer = bank.getCustomer(0);
		System.out.println("�ͻ�["+customer.getLastName()+customer.getFisrtName()+"]"+"��ǰ��"+customer.getAccount().getBalance()+"Ԫ");
		System.out.println("�ͻ�["+customer.getLastName()+customer.getFisrtName()+"]"+"�����100.0Ԫ"+"\t������"+customer.getAccount().deposit(100.0));
		System.out.println("�ͻ�["+customer.getLastName()+customer.getFisrtName()+"]"+"��ǰ��"+customer.getAccount().getBalance()+"Ԫ");
	}
}
