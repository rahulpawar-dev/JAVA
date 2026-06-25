package Day03.Task;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Book {


    private int bookid;
    private String bookName;
    private String autherName;



    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAutherName() {
        return autherName;
    }

    public void setAutherName(String autherName) {
        this.autherName = autherName;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Book b = new Book();

        b.setAutherName("Rahul");
        b.setBookid(12);
        b.setBookName("True FriendShip");

        System.out.println(b.getBookName());
        System.out.println(b.getBookid());
        System.out.println(b.getAutherName());




    }
}
