package interface_inheritance;

//인터페이스끼리 상속가능
public class DefaultRunnable extends Runnable {
	default void displayDetails() {
		System.out.println("표시할 디테일 없음");
	} //추상메소드

}
