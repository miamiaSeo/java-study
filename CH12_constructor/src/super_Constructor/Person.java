package super_Constructor;

public class Person {

	private String name;

	public Person(String name) {
		System.out.println("person »ý¼ºÀÚ");
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
	this.name=name;
	}
	
	public String toString() {
		return name;
	}
}
