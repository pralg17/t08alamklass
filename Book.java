class Book extends BookAuthor{
 	String book, genre;
 	public Book(String authorName, String book, String genre){
 		super(authorName);
 		this.book = book;
 		this.genre = genre;
 	}

 	public void changeBook(String newBook){
 		this.book = newBook;
 	}
 }
