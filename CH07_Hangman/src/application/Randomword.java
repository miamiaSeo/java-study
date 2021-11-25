package application;

public class Randomword {
	// �����̽��ٷ� ����� �ܾ���� ���ڿ��� str�� ����
	private String str = "independence passenger opportunity revolution customer suggestion explanation community president personality engineering appointment protection selection consequence literature conversation promotion instance insurance tradition performance description organization proposal teaching definition enthusiasm awareness operation elevator assignment entertainment possession apartment secretary temperature resource competition relation combination chocolate perception complaint establishment contribution computer initiative Click to save this word! atmosphere examination";
	private String[] words;

	private String selectWord; // �������� ���� �� �ܾ�
	private char[] characters; // ���� �迭 ����(ö�ڸ� ���߸� ����)
	//private Randomword random = new Randomword();

	public Randomword() { // �����ڿ� ���� �ܾ ����
		words = str.split(" "); // ���ڿ��� �����̽��� �߶� �迭�� �ܾ�� �Է�
		selectWord = words[this.nextInt(words.length)]; // �� �ִ� �������� ���� 1
		characters = new char[selectWord.length()];
		// ���� �ܾ��� ���� ��ŭ ���ڹ迭 ũ��� ����
	}
	
	public int nextInt(int length) {
		double rnd = Math.random();
		
		return (int) (length *rnd);
	}

	public void getWords() { // ���� words�迭�� �ִ� ��ü �ܾ ���
		for (String w : words) {
			System.out.println(w);
		}
	}

	public String toString() {
		// �ܾ _�� ����Ѵ�.
		String text = "";
		StringBuilder sb = new StringBuilder();
		//characters[3] = 'X'; //�׽�Ʈ

		for (char c : characters) {
			if (c == '\u0000') { // ����('')�� �ʱⰪ�̸� ���� ������ ���� ����
				text += '_';
				sb.append('_');
			} else {
				sb.append(c);
				//text += c; // ���� ������ ���
			}
			sb.append(c=='\u0000' ? '_' :c); //�� ������ _ ������ C
			sb.append(' ');
//			text += ' '; // ö�ڸ� �� ĭ�� �����̽���
		}
//		System.out.println(selectWord); // �������(�׽�Ʈ��)
		return sb.toString(); // ���� �� ���� �ܾ ������
	}
	
	public void addGuess(char c) {
		//�Ѿ�� ���ڸ� �˻��ؼ� ���� �ܾ ������ characters �迭�� ����
		for(int i=0; i < selectWord.length(); i++) { //�ܾ� ���̸�ŭ �ݺ�
			if(c ==selectWord.charAt(i)){
				characters[i] = c; 
			}
		}
	}
	public boolean isCompleted() {
		// ö�ڸ� �� �������� üũ�ؼ� true or false�� ����
		for (char c : characters) { // �ܾ� ��ü ö�� �ݺ� �˻�
			if(c=='\u0000') {
				return false; //���� ������ �� ���ڰ� ����
			}
		}	
		return true; // �� ������ 
	}
}
