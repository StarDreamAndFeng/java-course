package testbanking;

import banking4.*;

public class TestBanking4 {

	public static void main(String[] args) {
		
		Bank bank = new Bank(5);//建一个银行,最大存放5个客户
		
		//新增客户
		bank.addCustomer("三", "张");
		bank.addCustomer("四", "李");
		bank.addCustomer("五", "王");
		
		//打印客户信息
		for(int i = 0;i < bank.getNumberOfCustomers();i++) {
			Customer customer = bank.getCustomer(i);//指定一个客户
			System.out.println("客户[编号000"+(i+1)+"]:"+customer.getLastName()+customer.getFisrtName());
		}
		
		//测试
		Customer customer = bank.getCustomer(0);
		System.out.println("客户["+customer.getLastName()+customer.getFisrtName()+"]"+"当前余额："+customer.getAccount().getBalance()+"元");
		System.out.println("客户["+customer.getLastName()+customer.getFisrtName()+"]"+"存入金额：100.0元"+"\t操作："+customer.getAccount().deposit(100.0));
		System.out.println("客户["+customer.getLastName()+customer.getFisrtName()+"]"+"当前余额："+customer.getAccount().getBalance()+"元");
	}
}
