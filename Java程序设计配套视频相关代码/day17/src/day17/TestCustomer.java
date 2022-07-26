package day17;

/*
 * ���������ֱ���ͬһ���˺Ŵ洢3000Ԫ��һ�δ�1000Ԫ����3�Ρ�ÿ�δ����ӡ�˺���
 */

public class TestCustomer {

	public static void main(String[] args) {

		Account account = new Account();
		Customer customer = new Customer(account);
		
		Thread t1 = new Thread(customer);
		Thread t2 = new Thread(customer);
		Thread t3 = new Thread(customer);
		Thread t4 = new Thread(customer);

		t1.setName("�˿�1");
		t2.setName("�˿�2");
		t3.setName("�˿�3");
		t4.setName("�˿�4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}

class Account {
	double money;

	public Account() {
		super();
	}

	// ���
	@SuppressWarnings("static-access")
	public synchronized void deposit(double amt) {
		money += amt;
		try {
			Thread.currentThread().sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ":" + money);
	}
}

class Customer implements Runnable {

	Account account;
	
	public Customer(Account account) {
		this.account = account;
	}
	
	@Override
	public void run() {

		for (int i = 0; i < 3; i++) {
			account.deposit(1000);
		}
	}

}
