package Test;

public class TernaryCondition { // ���� ���� ������

	public static void main(String[] args) {
		// ���� ? A : B (������ ���̸� A �ƴϸ� B�̴�.)
		System.out.println(true ? "��" : "�ƴ�");
		System.out.println(false ? "��" : "�ƴ�");

		int n = 99;
		n = n > 100 ? 100 : n; // 100���� ũ�� 100��� �ƴϸ� n
		System.out.println(n);
		
		int[] values = { 6, 3, 92, 64, 17};
		int max = 0; // �ִ밪
	
	for(int val : values) {
//		if(val > max) {
//			max = val; //�ƽ������� val�� ũ�� val���� �ƽ��� �ִ´�.
//			}
		max = val > max ? val : max;
	}
	System.out.println(max);
}
}