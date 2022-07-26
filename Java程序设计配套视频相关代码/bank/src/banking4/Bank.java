package banking4;

/*
 * ����
 */

public class Bank {

	private Customer[] customers;//���ڴ�ſͻ�������
	private int numberOfCustomers;//�ͻ�����
	
	public Bank(int init_maxCustomer) {
		customers = new Customer[init_maxCustomer];
	}
	
	//���һ���ͻ���������
	public void addCustomer(String f,String l) {
		Customer cust = new Customer(f,l);//����һ���ͻ�
		Account account = new Account(100.0);//�����ͻ�ʱ��ͬʱ���˻�����ʼ���Ϊ100.0Ԫ
		cust.setAccount(account);
		customers[numberOfCustomers] = cust;
		numberOfCustomers++;//����һ���ͻ��󣬿ͻ��ܸ�����һ
	}
	
	//��ȡ�ͻ��ĸ���
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	
	//����ָ������λ�õĿͻ�
	public Customer getCustomer(int index) {
		return customers[index];
	}
}
