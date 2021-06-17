package OOP.PHONE;

import jdk.jshell.PersistentSnippet;

import java.util.Scanner;

public class Phone {
    public  static void receiveCall(int a){
        System.out.println("Calling"+" "+a);
    }


    public  static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Basephone i = new Basephone();
        i.setModel("IGOR");
        i.setNumber(49874543);
        i.setWeight(150.2);

        receiveCall(i.getNumber());


        Basephone j = new Basephone(32435235, "Pasha", 110);
        receiveCall(j.getNumber());

        Basephone g = new Basephone(22424245, "Tony");
        g.setWeight(100.2);
        receiveCall(g.getNumber());

    j.recieveCall();
    j.incomingCall();
    Basephone.sendMessage(g.getNumber(),j.getNumber());

    Person as=new Person();
    as.setAge(20);
    as.setFullname("NIKE");
    }
    Person to=new Person("Tom",18);


}
