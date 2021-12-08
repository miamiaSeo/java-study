package sorting_list;
// ������ �Ҽ��ְ� Comparable �񱳰����� �������̽� ����
public class Person implements Comparable<Person>{
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person o) {
		// ��ü���� ���ؼ� ���� ū�� �ڵ� �ۼ�
		return name.compareTo(o.name);
		// ���ڿ����� ���ϴ� �޼ҵ� compareTo ����Ͽ� �̸����� ��
	}
}
