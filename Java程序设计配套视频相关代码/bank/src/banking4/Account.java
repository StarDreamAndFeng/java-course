package banking4;

public class Account {
	
	private double balance;//���
	
	public Account(double init_balance) {
		balance = init_balance;
	}
	
	//��ȡ���
	public double getBalance() {
		return balance;
	}
	
	//���
	public boolean deposit(double amt) {
		if(amt <= 20000.0) {
			balance += amt;
			return true;
		}else {
			System.out.println("���ϴ���ת�˹�������δ�ţ�");
			return false;
		}
		 
	}
	
	//ȡ��
	public boolean withdraw(double amt) {
		if(amt <= balance) {
			balance -= amt;
			return true;
		}else {
			System.out.println("��������ȡ����Ǯ��"+balance+"Ԫ");
			return false;
		}
		
	}
	
}
