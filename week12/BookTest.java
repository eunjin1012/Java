package week12;

class Book{
	private String title;
	private int pages;
	private String writer;
	public Book(String title, int pages, String writer) {
		super();
		this.title = title;
		this.pages = pages;
		this.writer = writer;
	}
	
	}
	
class Magazine extends Book{
	private String date;

	public Magazine(String title, int pages, String writer, String date) {
		super(title, pages, writer);
		this.date = date;
		System.out.println("잡지명="+title);
		System.out.println("페이지 수="+pages);
		System.out.println("저자="+writer);
		System.out.println("발매일:"+date);
		
	}
	
}
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Magazine mA=new Magazine("잡지A",100,"이순신","2020년 6월 1일");
		Magazine mB=new Magazine("잡지B",200,"홍길동","2020년 7월 1일");
		
		System.out.println(mA);
		System.out.println("");
		System.out.println(mB);

	}

}
