package Abstraction;

abstract public class Car {
    private String color;
    private String volume;

    Car(String color, String volume) {
        this.color=color;
        this.volume=volume;
    }

    public void info( String c, String v) {
        System.out.println(c+" "+v);
    }

    abstract  public  void speed(String volume );



}
