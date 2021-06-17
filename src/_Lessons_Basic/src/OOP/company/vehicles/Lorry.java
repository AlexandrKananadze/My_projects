package OOP.company.vehicles;

import OOP.company.details.Engine;
import OOP.company.professions.Drivers;

public class Lorry extends Car {
    public int gruz;

  public   Lorry() {}
  public   Lorry(String modelClass, String klass, Engine engine, Drivers drivers, int gruz){
        super( modelClass, klass, engine, drivers);
        this.gruz=gruz;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                super.getKlass()+" "+super.getModelClass()+" "+ super.getDriver().getFio()+" "+
                "gruz=" + gruz +
                '}';
    }
}
