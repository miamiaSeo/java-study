package application;

public class ForEachArray {

	public static void main(String[] args) {
		
		// �迭�� ����� �� �ִ� �ݺ��� for each
		// ������ �迭�� �ݺ����� for each���� ����ϰ� �ε��� ��ȣ�� �ʿ��� ��� for���� ���
		
		String[] fruits = {"Banana","Apple","Watermelon"};
		
		int[]n = {1,2,3};
		boolean[]b= {true, false, true};
		double[]d = {1.1, 2.2, 3.3, 4.4};
		
		for(String x : fruits) {  // for each���� (���� : �迭)
			System.out.println(x + "  ");
		}
		System.out.println();
		
		for(int x : n) {
			System.out.println(x +"  ");
		}
		System.out.println();
		
		for(boolean x : b) {
			System.out.println(x + "  ");
		}
		System.out.println();
		
		for(double x : d) {
			System.out.println(x +"  ");
		}
		System.out.println();
		


		
	}

}
