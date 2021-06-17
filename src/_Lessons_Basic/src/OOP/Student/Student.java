package OOP.Student;

public class Student {
   private int age;
   private   String name;
   private int  length;
   private  int weight;

public  Student(Integer age, String name, Integer length, Integer weight){
    this.name=name;
    this.age =age;
    this.length= length;
    this.weight= weight;
}
public  Student(){};

public  Student (Integer age, String name) {
    this.name=name;
    this.age = age;

}
public void Say(){
    System.out.println("Ya sdal!");
};

   public  String getname(){
       return name;
   }
   public void setname (String n){
       this.name=n;
   }
   public  Integer getage(){
       return age;
   }
   public void setage(int a){
       this.age=a;
   }
    public  Integer getlength(){
        return length;
    }
    public void setlength (int n){
        this.length=n;
    }
    public  Integer getweigth(){
        return weight;
    }
    public void setweight (int n){
        this.weight=n;
    }


    @Override
    public String toString() {
       return name+" "+age+" "+length+" "+weight;
    }
}
