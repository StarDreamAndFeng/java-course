package fly;
/*
 * �ɱ�������β�
 */
public class TestArgs {
	public static void main(String[] args) {
		TestArgs t = new TestArgs();
		t.say(1,2,3,4,5,6);
		t.say("�ҽ���Ҫȥ������","Who are you?");
	}
	
	
	
	public void say(int ... args) {
		for(int i = 0;i < args.length;i++) {
			System.out.println(args[i]);
		}
	}
	
	public void say(String...args) {
		for(int i = 0;i < args.length;i++) {
			System.out.println(args[i]);
		}
	}
}
