package fly2;

public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestPritimive d = new TestPritimive();//����TestPritimive����
		
		//���boolean��������Ԫ��ֵ
		for(int i = 0;i < d.t.length;i++) {
			System.out.println(d.t[i]);
		}
		
		System.out.println("�޸ĺ�");
		
		//��ֵt������Ԫ��ֵΪtrue
		for(int i = 0;i < d.t.length;i++) {
			d.t[i] = true;
		}
		//���boolean��������Ԫ��ֵ
		for(int i = 0;i < d.t.length;i++) {
			System.out.println(d.t[i]);
		}
		
	}

}
