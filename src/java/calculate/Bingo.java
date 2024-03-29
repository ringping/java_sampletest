package java.calculate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bingo {
	static int MAX = 75;
	static int time = 10000;
	static List<Integer> numList = new ArrayList<Integer>();
	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i < MAX+1; i++) {
			numList.add(i);
		}

		Collections.shuffle(numList);

		for (int i = 1; i < MAX+1; i++) {
			System.out.println(numList.get(i));
			Thread.sleep(time);
		}


	}

}
