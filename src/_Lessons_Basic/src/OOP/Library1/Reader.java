package OOP.Library1;

public class Reader {
    private String fio;
    private int bilet;
    private  String fac;
   private int databirthday;
   private        int tel;


  public Reader(){}
  public Reader (String fio, int bilet, String fac, int databirthday, int tel ){
      this.fio=fio;
      this.bilet=bilet;
      this.fac=fac;
      this.databirthday=databirthday;
      this.tel=tel;
  }


   public void returnbook(){}

   public void takebook() {}

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
}
