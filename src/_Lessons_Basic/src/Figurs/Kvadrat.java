package Figurs;

public class Kvadrat extends Abstr implements Figure {
    private double side;
    @Override
    public double Ploshad() {
        this.square= side*side;
        return  square;
    }

    @Override
    public double Perimetr() {
        this.perimetr = 4*side;
        return  perimetr;
    }
    public Kvadrat(double side){
        this.side=side;
    }

    @Override
    public String toString() {
        return "Kvadrat{" +
                "Ploshad=" + Ploshad()+" "
                +"Perimeter="+ Perimetr()+ '}';

    }

}
