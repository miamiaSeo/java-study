package collections;

//import heirarchy.Cat;

// ���׸� Ÿ�� Ŭ���� Wrapper
// Ÿ���� ��Ÿ�ӿ� ����
public class Wrapper<E> {
	private E object;
	
	public void set(E object) {
		this.object = object;
	}
	
	public E get() {
		return object;
	}

}
