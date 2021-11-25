package application;

import java.util.Scanner;

public class Hangman {

	private boolean running = true; // 게임을 계속 진행?
	private Randomword word = new Randomword();
	private Scanner scanner = new Scanner(System.in);

	// 프로그램을 실행하는 런 메소드
	public void run() {
		do {
			displayWord(); // 화면에 단어표시
			getUserInput(); // 입력받음
			checkUserInput(); // 맞는지 체크 (전부 맞으면 running = false)
		} while (running); // running이 false가 되면 반복종료
	}

	private void displayWord() {
		//System.out.println("화면에 단어 표시");
		// 2. 랜덤 워드 객체를 생성해 랜덤으로 한 단어를 출력
		System.out.println(word.toString());
	} 

	private void getUserInput() {
		//유저에게 한 문자 입력 요구
		//입력받은 문자열에서 한 문자를 뽑아서
		//RandomWord 객체에 전달 (addGuess(문자) 메소드를 만들자)
		System.out.println("한 문자 입력: ");
		String guess = scanner.nextLine(); //입력받 문자열을 guess에 출력
		word.addGuess(guess.charAt(0));//첫번째 문자
	}

	private void checkUserInput() {
		// 유저가 단어를 다 맞췄는지 체크해서 게임을 종료
		// 게임종료 확이늘 하는 메소드 isCompleted를 RandomWord 클래스에 만들기
		if(word.isCompleted()) {
			System.out.println("잘 맟혔어요!");
			System.out.println("정답은 : " + word.toString());
			running = false; // 반복문 빠져나옴 => 종료
		}
		//System.out.println("맞는지 체크");
	}
	
	/**
	 * 스캐너를 닫는 메소드
	 */
	public	void close() {
		scanner.close();
	}
}
