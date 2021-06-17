package OOP.company.vehicles;

public class Sportcar extends  Car{
    private int speedlimit;

    public Sportcar(){}
    public Sportcar(int speedlimit){
       this.speedlimit=speedlimit;
    }

    public int getSpeedlimit() {
        return speedlimit;
    }

    @Override
    public String toString() {
        return "Sportcar{" +
                "speedlimit=" + speedlimit +
                '}';
    }
}
