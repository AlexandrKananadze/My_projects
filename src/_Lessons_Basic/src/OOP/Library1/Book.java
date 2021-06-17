package OOP.Library1; // модель данных  -   никакого исполнения

public class Book {
  private String  author; // поля (филды) которые есть в этом классе
  private String bookname;

  Book(){}
  Book(String author,String bookname){
      this.author=author;
      this.bookname=bookname;
  }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", bookname='" + bookname + '\'' +
                '}';
    }



}
