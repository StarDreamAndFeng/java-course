package dynamic_proxy;

/*
 * �ٴ���һ����������
 */

//ʵ�ֽӿ�Homework
public class Machine implements Homework{

	@Override
	public void assignHomework(Student student,String content) {
		
		System.out.println("������" + student.getName() + "���õ���ҵΪ��" + content);
		
	}
}