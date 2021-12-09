package list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// 리스트 인터페이스
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();
		// 어레이리스트
		list1.add(5);
		list1.add(7);
		list1.add(8);
		
		//링크드리스트
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		displyList(list1); // 콘솔에 입력된 리스트 타입 객체의 아이템들을 출력
		System.out.println();
		displyList(list2); // 콘솔에 입력된 리스트 타입 객체의 아이템들을 출력
	
		
		List<Integer> list3 = new ArrayList<>();
		list3.addAll(list1);
		list3.addAll(list2);
		displyList(list3);
	}
	/**
	 * 입력 된 리스트 타입 객체의 아이템들을 출력
	 * @param list
	 */

	private static void displyList(List<Integer> list) {
		// 입력 된 리스트 타입 객체의 아이템들을 출력
		// list.forEach(System.out::println);
		for(int i : list) {
			System.out.println(i);
			
			
		}
		
	}

}
