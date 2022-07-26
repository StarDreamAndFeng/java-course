package exercise;

import java.util.Random;

public class RandomExer {

	public static void main(String[] args) {
		
		Random ran1 = new Random();
		
		for(int i = 0;i < 10;i++) {
			System.out.println("Ëæ»úÊý:"+(ran1.nextInt(10)+1));
		}
		
	}
}
