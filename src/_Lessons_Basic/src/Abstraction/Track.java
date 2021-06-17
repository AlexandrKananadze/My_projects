package Abstraction;

public class Track extends Car implements Car1{

    @Override
    public void speed(String volume) {
        System.out.println("Speed");
    }

    Track(String color, String volume) {
        super(color,volume);
    }

    @Override
    public void a(int v) {
        System.out.println();
    }

    @Override
    public void b(int b) {

    }
}
