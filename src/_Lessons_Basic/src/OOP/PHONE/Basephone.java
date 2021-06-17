package OOP.PHONE;

public class Basephone {

    private int number;
   private String model;
   private    double   weight;


  // public Basephone(int number, String model, double weight) {
  //    this.number=number;
  //    this.model = model;
  //    this.weight=weight;
  //}
    public Basephone(int number, String model){
       this.number=number;
       this.model=model;
   }
   public Basephone(){};

    public Basephone(int number, String model, double weight) {
        this(number,model);
        this.weight=weight;
    }

    public  int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public  void recieveCall () {
        System.out.println("Incoming Call" + " " + number);
    }
    public void incomingCall(){
        System.out.println("Incoming Call"+model+" "+"tel"+" "+number);
    }
    public static void sendMessage(int num1, int num2) {
    System.out.println("Сообщение отпралвено" + num1 +" "+ num2);
    }


    @Override
    public String toString() {
        return number+" "+model+" "+weight;
    }
}
