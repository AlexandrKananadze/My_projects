package OOP.Library;

public class Book {
    private String nameb;
    private String namea;


   public Book(){};

    public String getNameb() {
        return nameb;
    }

    public void setNameb(String nameb) {
        this.nameb = nameb;
    }

    public String getNamea() {
        return namea;
    }

    public void setNamea(String namea) {
        this.namea = namea;
    }
    public Book(String namea, String nameb) {
        this.namea=namea;
        this.nameb = nameb;

    }
public String info(){
        return namea+" " + nameb;
}
}
