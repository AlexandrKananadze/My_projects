package OOP.PHONE;

public class Person {
  private String fullname;
   private int age;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void move(){
        System.out.println("Talking"+" "+fullname);
    }
    public void talk(){
        System.out.println("Talking"+ " "+ fullname);
    }
   public Person(){};
    public Person(String fullname,int age){
        this.fullname=fullname;
        this.age=age;
    }
}
