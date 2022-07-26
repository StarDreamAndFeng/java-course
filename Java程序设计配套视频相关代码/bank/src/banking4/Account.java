package banking4;

public class Account {
	
	private double balance;//余额
	
	public Account(double init_balance) {
		balance = init_balance;
	}
	
	//获取余额
	public double getBalance() {
		return balance;
	}
	
	//存款
	public boolean deposit(double amt) {
		if(amt <= 20000.0) {
			balance += amt;
			return true;
		}else {
			System.out.println("金额较大，请转人工服务或多次存放！");
			return false;
		}
		 
	}
	
	//取款
	public boolean withdraw(double amt) {
		if(amt <= balance) {
			balance -= amt;
			return true;
		}else {
			System.out.println("暂无余额可取，零钱："+balance+"元");
			return false;
		}
		
	}
	
}
