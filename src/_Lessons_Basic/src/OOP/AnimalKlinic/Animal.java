package OOP.AnimalKlinic;

import java.sql.SQLOutput;

abstract public class Animal extends Parametrs implements Animals {


public Animal(){};

public Animal(String food, String location) {
    this.food=food;
    this.location=location;
}
 //  public Cat (String food,String location){
 //  this.food=food;
 //  this.location=location; }

    @Override
    public void Cat() {
        System.out.println("May");
    }

    @Override
    public void Dog() {
        System.out.println("Gav");
    }

    @Override
    public void Horse() {
        System.out.println("Igogo");
    }

    public void makeNoise (Animal i){
        System.out.println(i);
    }
    public void eat(){}
    public void sleep(){}

    @Override
    public String toString() {
        return super.toString();
    }
}
