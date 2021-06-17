package Figurs;

public class Circle extends Abstr implements Figure {
    private double radius;

  public  Circle(double radius) {
      this.radius=radius;
  }

    @Override
    public double Ploshad() {
        return 2*3.14*radius*radius;
    }

    @Override
    public double Perimetr() {
        return 2*3.14*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Ploshad="+ Ploshad()+ " "+"Dlinna circle="+ Perimetr()+
                '}';
    }
}
