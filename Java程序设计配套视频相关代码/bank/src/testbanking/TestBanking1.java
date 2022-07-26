package testbanking;

import banking1.Account;

public class TestBanking1 {
	
	public static void main(String[] args) {
		
		//创建账户
		Account a1 = new Account(100.00);
		
		//查询余额
		System.out.println("当前余额："+a1.getBalance()+"元");
		
		//存款
		System.out.println("存钱100.0元");
		a1.deposit(100.00);
		
		//取款
		System.out.println("取钱20.0元");
		a1.withdraw(20.00);
		
		//查询余额
		System.out.println("当前余额："+a1.getBalance()+"元");
		
	}
}
