package exem1;

public class Menu {

	String[] options = {"������ ����", "������ �߰�","������ ����", "����"};
	
	void display() {
		for(int i=0; i<options.length; i++) {
			System.out.printf("%d. %s \n", i, options[i]);
		}

	}

}
