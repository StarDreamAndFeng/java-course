package fly;
/*
 * 可变个数的形参
 */
public class TestArgs {
	public static void main(String[] args) {
		TestArgs t = new TestArgs();
		t.say(1,2,3,4,5,6);
		t.say("我今天要去。。。","Who are you?");
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
