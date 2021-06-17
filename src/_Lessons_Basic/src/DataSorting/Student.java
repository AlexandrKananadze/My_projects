package DataSorting;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String fio;
    private Date bd;
    private  double rate;
    private ArrayList<String> list;

 public    Student (){}
    public  Student( String fio, Date bd, double rate, ArrayList<String> list){
     this.bd=bd;
     this.rate=rate;
     this.fio=fio;
     this.list=list;
   }

    @Override
    public String toString() {
        SimpleDateFormat a= new SimpleDateFormat("dd.MM.yyyy");
        String s= String.format("%.1f",rate); // количество десятичных знаков

        return "Student{" +
                "fio='" + fio + '\'' +
                ", bd=" + a.format(bd) + //форматирование даты для вывода dd.mm.yyyy
                ", rate=" + s +
                ", list=" + list +
                '}'+"\n";
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Date getBd() {
        return bd;
    }

    public void setBd(Date bd) {
        this.bd = bd;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }
}
