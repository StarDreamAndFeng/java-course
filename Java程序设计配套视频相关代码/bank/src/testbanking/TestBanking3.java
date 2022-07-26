package testbanking;

import banking3.*;

public class TestBanking3 {
	
	public static void main(String[] args) {
		
		//创建账户和客户
		Account a1 = new Account(100.00);
		Customer c1 = new Customer("先生","李");
		
		//绑定账户
		c1.setAccount(a1);
		
		//查询余额
		System.out.println("客户["+c1.getLastName()+c1.getFisrtName()+"]"+"当前余额："+c1.getAccount().getBalance()+"元");
		
		//存款
		System.out.println("客户["+c1.getLastName()+c1.getFisrtName()+"]"+"存钱100.0元" + "\t操作："+c1.getAccount().deposit(100.0));
		//c1.getAccount().deposit(100.0);
		
		//取款
		System.out.println("客户["+c1.getLastName()+c1.getFisrtName()+"]"+"取钱20.0元" + "\t操作："+c1.getAccount().withdraw(20.0));
		//c1.getAccount().withdraw(20.0);
		
		//查询余额
		System.out.println("客户["+c1.getLastName()+c1.getFisrtName()+"]"+"当前余额："+c1.getAccount().getBalance()+"元");
		
	}
}
