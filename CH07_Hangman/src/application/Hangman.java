package application;

import java.util.Scanner;

public class Hangman {

	private boolean running = true; // ������ ��� ����?
	private Randomword word = new Randomword();
	private Scanner scanner = new Scanner(System.in);

	// ���α׷��� �����ϴ� �� �޼ҵ�
	public void run() {
		do {
			displayWord(); // ȭ�鿡 �ܾ�ǥ��
			getUserInput(); // �Է¹���
			checkUserInput(); // �´��� üũ (���� ������ running = false)
		} while (running); // running�� false�� �Ǹ� �ݺ�����
	}

	private void displayWord() {
		//System.out.println("ȭ�鿡 �ܾ� ǥ��");
		// 2. ���� ���� ��ü�� ������ �������� �� �ܾ ���
		System.out.println(word.toString());
	} 

	private void getUserInput() {
		//�������� �� ���� �Է� �䱸
		//�Է¹��� ���ڿ����� �� ���ڸ� �̾Ƽ�
		//RandomWord ��ü�� ���� (addGuess(����) �޼ҵ带 ������)
		System.out.println("�� ���� �Է�: ");
		String guess = scanner.nextLine(); //�Է¹� ���ڿ��� guess�� ���
		word.addGuess(guess.charAt(0));//ù��° ����
	}

	private void checkUserInput() {
		// ������ �ܾ �� ������� üũ�ؼ� ������ ����
		// �������� Ȯ�̴� �ϴ� �޼ҵ� isCompleted�� RandomWord Ŭ������ �����
		if(word.isCompleted()) {
			System.out.println("�� �������!");
			System.out.println("������ : " + word.toString());
			running = false; // �ݺ��� �������� => ����
		}
		//System.out.println("�´��� üũ");
	}
	
	/**
	 * ��ĳ�ʸ� �ݴ� �޼ҵ�
	 */
	public	void close() {
		scanner.close();
	}
}
