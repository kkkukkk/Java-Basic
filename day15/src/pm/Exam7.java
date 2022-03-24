package pm;

import java.util.ArrayList;
import java.util.LinkedList;

public class Exam7 {
	public static void main(String[] args) {
		// ArrayList와 LinkedList 성능 비교(추가/삭제/검색)
		
		ArrayList aList = new ArrayList();
		LinkedList linkedList = new LinkedList();
		
		long startTime = 0;
		long endTime = 0;
		
		startTime = System.nanoTime();
		for(int i = 0; i<100000; i++) {
			linkedList.add(0,i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 시간 = " + (endTime-startTime)/100000);
		
		startTime = System.nanoTime();
		for(int i = 0; i<100000; i++) {
			linkedList.add(0,i);
		}
		endTime = System.nanoTime();
		System.out.println("LinKedList 시간 = " + (endTime-startTime)/100000);
		

	}
}
