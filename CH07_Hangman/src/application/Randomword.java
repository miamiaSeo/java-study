package application;

public class Randomword {
	// 스페이스바로 띄어진 단어들을 문자열로 str에 저장
	private String str = "independence passenger opportunity revolution customer suggestion explanation community president personality engineering appointment protection selection consequence literature conversation promotion instance insurance tradition performance description organization proposal teaching definition enthusiasm awareness operation elevator assignment entertainment possession apartment secretary temperature resource competition relation combination chocolate perception complaint establishment contribution computer initiative Click to save this word! atmosphere examination";
	private String[] words;

	private String selectWord; // 랜덤으로 선택 된 단어
	private char[] characters; // 문자 배열 선언(철자를 맞추면 저장)
	//private Randomword random = new Randomword();

	public Randomword() { // 생성자에 랜덤 단어를 선택
		words = str.split(" "); // 문자열을 스페이스로 잘라서 배열에 단어로 입력
		selectWord = words[this.nextInt(words.length)]; // 좀 있다 랜덤으로 수정 1
		characters = new char[selectWord.length()];
		// 선택 단어의 길이 만큼 문자배열 크기로 생성
	}
	
	public int nextInt(int length) {
		double rnd = Math.random();
		
		return (int) (length *rnd);
	}

	public void getWords() { // 현재 words배열에 있는 전체 단어를 출력
		for (String w : words) {
			System.out.println(w);
		}
	}

	public String toString() {
		// 단어를 _로 출력한다.
		String text = "";
		StringBuilder sb = new StringBuilder();
		//characters[3] = 'X'; //테스트

		for (char c : characters) {
			if (c == '\u0000') { // 문자('')의 초기값이면 아직 맞히지 못한 문자
				text += '_';
				sb.append('_');
			} else {
				sb.append(c);
				//text += c; // 맞힌 문자일 경우
			}
			sb.append(c=='\u0000' ? '_' :c); //못 맞히면 _ 맞히면 C
			sb.append(' ');
//			text += ' '; // 철자를 한 칸씩 스페이스바
		}
//		System.out.println(selectWord); // 정답출력(테스트용)
		return sb.toString(); // 선택 된 랜덤 단어를 가져옴
	}
	
	public void addGuess(char c) {
		//넘어온 문자를 검사해서 선택 단어에 있으면 characters 배열에 저장
		for(int i=0; i < selectWord.length(); i++) { //단어 길이만큼 반복
			if(c ==selectWord.charAt(i)){
				characters[i] = c; 
			}
		}
	}
	public boolean isCompleted() {
		// 철자를 다 맞혔는지 체크해서 true or false로 리턴
		for (char c : characters) { // 단어 전체 철자 반복 검사
			if(c=='\u0000') {
				return false; //아직 맞혀야 할 문자가 있음
			}
		}	
		return true; // 다 맞혔음 
	}
}
