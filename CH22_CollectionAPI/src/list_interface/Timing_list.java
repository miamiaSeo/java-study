package list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timing_list {

	public static void main(String[] args) {
		// 어레이리스트와 링크드리스트의 실행 시간
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		long duration = timeOperations(linkedList);
		System.out.println("측정시간 : " + duration);
		//일반적인 순서대로 입력은 어레이리스트가 2배 더 빠름
		//특정 인덱스 번호에 입력이나 제거는 링크드 리스트가 훨씬 빠름
			
	}
	
	public static long timeOperations(List<Integer>list) {
		long start = System.currentTimeMillis(); // 시간측정
		
		for(int i=0; i< 100000; i++) {
			list.add(i); //0부터 10만 -1까지 리스트에 하나씩 입력
		}
		
		return System.currentTimeMillis() - start; // 실행시간 리턴
	}

}


////시간체크 하는 법
//long time1 = System.currentTimeMillis(); // 현재 시간을 1/1000초로
//System.out.println(time1);
//
//// 리스트 실행하고
//for(int i=0; i<10000; i++) {
//	System.out.println(i);
//}
//long time2 = System.currentTimeMillis();
//System.out.println(time2 - time1); // 걸린시간
