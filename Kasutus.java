public class Kasutus{
 	public static void main(String[] args){
 		Book b1 = new Book("J.K Rowling, ","Harry Potter and the Sorcere's Stone, ", "fantasy");
 		Book b2 = new Book("J.K Rowling, ", "Harry Potter and the Prisoner of Azkaban, ", "fantasy");
 		Book b3 = new Book("J.R.R Tolkieni,  ","Lord of the Rings, ","fantasy");

 		Book[] Books = new Book[3];
 		Books[0] = b1;
 		Books[1] = b2;
 		Books[2] = b3;

 		for (Book b: Books){
 			System.out.println(b.authorName + b.book + b.genre);
 		}
 		b2.changeBook("Harry Potter and the Goblet of Fire, ");
 		System.out.println("\n\n");
 		for (Book b: Books){
 			System.out.println(b.authorName + b.book + b.genre);
 		}
 	}
 }
