package prob02;

public class Book {
	
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;	// 0 = 재고 있음, 1 = 대여 중
	
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	public void rent() {
		System.out.println(String.format("%s이(가) 대여 됐습니다.", this.title));
		this.stateCode = 0;
	}

	@Override
	public String toString() {
		return String.format("책 제목:%s, 작가:%s, 대여 유무: %s", 
				this.title, this.author,
				(this.stateCode == 0)?"재고있음":"대여중");
	}

	
}