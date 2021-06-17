package OOP.company;

import OOP.company.details.Engine;
import OOP.company.professions.Drivers;
import OOP.company.vehicles.Car;
import OOP.company.vehicles.Lorry;

public class Runner {
    public static void main(String[] args) {
        Engine engine = new Engine(2000, "ivanov");
        Drivers driver = new Drivers("ivanov");
        Car volvo= new Car("xc90","volovo",engine, driver);
        volvo.start();
        volvo.stop();
        volvo.turnLeft();
        volvo.turnRight();
        volvo.printInfo();

        Lorry lor=new Lorry("mers", "gt",engine,driver,1500);
        System.out.println();
        System.out.println(lor);
    }
}
