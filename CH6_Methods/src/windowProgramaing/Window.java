package windowProgramaing;

public class Window {
	private int width; // ����
	private int height; // ����
	private boolean isVisible; // ���� ���̴°�?
	private int top; // ��ġ
	private int left; // ��ġ
	
	// get set �޼ҵ� �����
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setIsvisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	
	public void setTop(int top) {
		this.top = top;
	}
	
	public void setLeft(int left) {
		this.left = left;
	}

	//
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public boolean getIsvisible() {
		return isVisible;
	}
	
	public int getTop() {
		return top;
	}
	
	public int getLeft() {
		return left;
	}
	


}
