
public class Basic 
{
	public static void main(String args[])// �޼ҵ��̸鼭 ���α׷����࿡ ������ 
	{ 
		BookList bookList = new BookList();
		bookList.getConnection();
		bookList.getBook();
//		b.printBookArr();//2.�迭 ��� 
//		b.printObjArr();//4.��ü�迭 ��� - �̸޼ҵ尡 BookList�ȿ� �������!


//		for(int i=0; i<b.bookArr.length;++i) //private�� �ϸ� �̰� ���� ����!
//			b.bookArr[i].printBook();
		
		//bookList.getBookArr()[10].printBook();
		
		for(int i=0; i<bookList.getBookArr().length;++i) {
			bookList.getBookArr()[i].printBook();
		}
	}
}