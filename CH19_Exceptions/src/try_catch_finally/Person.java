package try_catch_finally;

public class Person {
	private String name;
	public void setName(String name) throws Exception {
		if(name == null) {
			throw new Exception("�̸��� �� ���� �Է��� �� �����ϴ�.");
		}
		this.name = name;
		System.out.println("�̸���" + name);
	}

}
