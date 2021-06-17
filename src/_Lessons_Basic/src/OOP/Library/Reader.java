package OOP.Library;

import javax.naming.RefAddr;
import java.awt.*;
import java.util.PrimitiveIterator;

public class Reader extends Book{
   // ФИО, номер читательского билета, факультет, дата рождения, телефон
    private String fio;
    private  int number;
    private String fac;
    private String bd; //birthday
    private String tel;


    public Reader(  String fio, int number, String fac, String bd, String tel) {
        this.fio=fio;
        this.number=number;
        this.fac=fac;
        this.bd=bd;
        this.tel=tel;
    }
    public Reader(){};

   public  String getFio(){
       return fio;
   }

   public void  setFio(String fio){
       this.fio=fio;
   }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFac() {
        return fac;
    }

    public void setFac(String fac) {
        this.fac = fac;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void takeBook(int number) {
        System.out.println(this.fio + " взял " + number + " книги.");
    }
    public void takeBook(String... books) {
        System.out.println(this.fio + " взял следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(this.fio + " взял следующие книги:");
        for (Book book : books) {
            System.out.println(book.getNameb() + ", автор - " + book.getNamea());
        }
        System.out.println();
    }

    public void returnBook(int number) {
        System.out.println(this.fio + " вернул " + number + " книги.");
    }

    public void returnBook(String... books) {
        System.out.println(this.fio + " вернул следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(this.fio + " вернул следующие книги:");
        for (Book book : books) {
            System.out.println(book.getNameb() + ", автор - " + book.getNamea());
        }
        System.out.println();
    }

    public String getInfo() {
        return "{" +
                "fio='" + fio + '\'' +
                ", number=" + number +
                ", faculty='" + fac + '\'' +
                ", dob='" + bd + '\'' +
                ", phone='" + tel + '\'' +
                '}';
    }



}
