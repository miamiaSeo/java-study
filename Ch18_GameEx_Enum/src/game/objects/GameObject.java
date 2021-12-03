package game.objects;

public enum GameObject {
	//name , id
	����, ����, ��;

	private int[][] comparison = {
						// ���� ���� ��
			/* ����(0) */ { 0, -1,  1 }, 
			/* ����(1) */ { 1,  0, -1 }, 
			/* �� (2) */ { -1, 1,  0 } 
			};

	// ����� (����,����,��)�� ���ؼ� ��� ����
	public int compare(GameObject ob) {
		return comparison[this.ordinal()][ob.ordinal()]; //enum ���� ���ؼ� �ε�����ȣ�� ��
	}

}

