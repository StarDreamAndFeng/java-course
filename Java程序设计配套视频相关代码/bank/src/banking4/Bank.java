package banking4;

/*
 * 银行
 */

public class Bank {

	private Customer[] customers;//用于存放客户的数组
	private int numberOfCustomers;//客户个数
	
	public Bank(int init_maxCustomer) {
		customers = new Customer[init_maxCustomer];
	}
	
	//添加一个客户到数组中
	public void addCustomer(String f,String l) {
		Customer cust = new Customer(f,l);//创建一个客户
		Account account = new Account(100.0);//创建客户时，同时绑定账户，初始余额为100.0元
		cust.setAccount(account);
		customers[numberOfCustomers] = cust;
		numberOfCustomers++;//增加一个客户后，客户总个数加一
	}
	
	//获取客户的个数
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	
	//返回指定索引位置的客户
	public Customer getCustomer(int index) {
		return customers[index];
	}
}
