
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class BookList 
{
	Connection con; // 1.�������
	Statement stmt;
	ResultSet rs;

	//1.����
//	int bookid;
//	String bookname;
//	String publisher;
//	int price;

	//2.�迭
//	int bookidArr[];
//	String booknameArr[] = new String[12];
//	String publisherArr[] = new String[12];
//	int priceArr[] = new int[12];

	//3.��ü
//	Book bookObj;

	//4.��ü �迭
	private Book bookArr[];


	//2.������
	BookList()
	{
		//2.�迭
//		bookidArr = new int[12]; //�迭�� �ʱ�ȭ�� �����ڿ��� �Ѵ�(���� ��������)
//		booknameArr = new String[12];
//		publisherArr = new String[12];
//		priceArr = new int[12];

//		bookObj = new Book();//���� �ƴ�!

		//4.��ü �迭 �ʱ�ȭ
		bookArr = new Book[10];
	}

	//3.�޼ҵ�
	void getConnection() {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "c##madang"; // c##�߰�
		String pwd = "c##madang"; // c##�߰�

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("�����ͺ��̽� ���� �غ� .....");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("�����ͺ��̽� ���� ����");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void getBook() { // ������
		String query = "SELECT bookid, bookname, publisher, price FROM book";
		try {
			stmt = con.createStatement(); // 2
			rs = stmt.executeQuery(query); // 3
			System.out.println("BOOK ID \tBOOK NAME \t\tPUBLISHER \t\t\tPRICE");

			int i = 0;	
			while (rs.next()) {
//				System.out.print("\t" + rs.getInt(1));
//				System.out.print("\t" + rs.getString(2));
//				System.out.print("\t\t\t" + rs.getString(3));
//				System.out.println("\t\t\t\t" + rs.getInt(4));

				//1.����
//				bookid    = rs.getInt(1);
//				bookname  = rs.getString(2);
//				publisher = rs.getString(3);
//				price     = rs.getInt(4);
//				
//				printBook(bookid, bookname, publisher, price);

				//2.�迭							
//				bookidArr[i]    = rs.getInt(1);
//				booknameArr[i]  = rs.getString(2);
//				publisherArr[i] = rs.getString(3);
//				priceArr[i]     = rs.getInt(4);
//				i++;

				//3.��ü
//				bookObj = new Book(rs.getInt(1),
//								   rs.getString(2),
//								   rs.getString(3),
//								   rs.getInt(4));
//				printObj(bookObj);
				
				//4.��ü �迭
				bookArr[i] = new Book(rs.getInt(1),
								      rs.getString(2),
								      rs.getString(3),
								      rs.getInt(4));
				i++;
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Book[] getBookArr() {
		return bookArr;
	}

//	public void setBookArr(Book[] bookArr) {
//		this.bookArr = bookArr;
//	}

	//1.������
//	void printBook(int bookid, String bookname, String publisher, int price)
//	{
//		System.out.print("\t" + bookid 
//						+"\t" + bookname 
//						+"\t" + publisher 
//						+"\t" + price
//						+"\n");
//	}
//	
//	//2.�迭 ��¿�
//	void printBookArr()
//	{
//		for(int i=0; i<bookidArr.length; ++i)
//			System.out.println("\t" + bookidArr[i]  
//							  +"\t" + booknameArr[i] 
//							  +"\t" + publisherArr[i] 
//							  +"\t" + priceArr[i]
//							  );
//	}

//	//3.��ü ��¿�
//	void printObj(Book book)
//	{
//		System.out.print("\t" + book.bookid 
//						+"\t" + book.bookname 
//						+"\t" + book.publisher 
//						+"\t" + book.price
//						+"\n");
//	}

	//4.��ü�迭 ��¿� -> �Ӹ��� Book Ŭ���� ����������
//	void printObjArr()
//	{
//		for(int i=0; i<bookArr.length; ++i)
//		{
//			//private���� �ٲٸ� �̰Ŵ� �ȵ�!
////			System.out.print("\t" + bookArr[i].bookid 
////							+"\t" + bookArr[i].bookname 
////							+"\t" + bookArr[i].publisher 
////							+"\t" + bookArr[i].price
////							+"\n");
//			System.out.print("\t" + bookArr[i].getBookid() 
//							+"\t" + bookArr[i].getBookname()
//							+"\t" + bookArr[i].getPublisher()
//							+"\t" + bookArr[i].getPrice()
//							+"\n");
//		}
//	}



//	public static void main(String args[]) { // �޼ҵ��̸鼭 ���α׷����࿡ ������
//		BookList so = new BookList();
//		so.sqlRun();
//	}
}