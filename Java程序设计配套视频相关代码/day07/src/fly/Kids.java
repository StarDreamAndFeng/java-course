package fly;

public class Kids extends ManKind{
	private int yearsOld;
	
	public Kids() {
		
	}

	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}
	
	public void printAge() {
		System.out.println("���䣺"+yearsOld+"��");
	}
	
	@Override
	public void employeed(int salary) {//�Ը��������д������
		System.out.println("ѧ��Ӧ�úú�ѧϰ�������ǹ�����");
	}
	
	public static void main(String[] args) {
		Kids someKid = new Kids();
		System.out.println("�����Ա������" + someKid.getSex() + someKid.getSalary() );
		System.out.println("����ķ���:");
		someKid.manOrWomen(0);
		someKid.employeed(100);
		
		ManKind man = new ManKind();
		man.employeed(12);
		
	}
}
