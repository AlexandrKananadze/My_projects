
package OOP.company.vehicles;

import OOP.company.details.Engine;
import OOP.company.professions.Drivers;



public class Car  {
   private String modelClass;
   private String marka;
   private Engine engine;
   private Drivers driver;



   public Car(){}

    public Car ( String modelClass, String marka,Engine engine, Drivers driver) {
        this.driver=driver;
        this.modelClass=modelClass;
        this.marka=marka;
        this.engine=engine;


    }


   public void start() {
       System.out.println("Poehali");
   }
  public   void stop() {
      System.out.println("Stop");
  }
   public void turnRight() {
       System.out.println("Povorot na pravo");
   }
   public void turnLeft() {
       System.out.println("Povorot nalevo");
   }
   public void printInfo()  {
       System.out.println(driver+" "+modelClass+" "+marka+" "+engine+" "+driver.getStage());
         }

    @Override
    public String toString() {
        return "Car{" +
                "modelClass='" + modelClass + '\'' +
                ", marka='" + marka + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }

    public String getModel() {
        return modelClass;
    }

    public void setModel(String model) {
        this.modelClass = model;
    }

    public String getKlass() {
        return marka;
    }

    public void setKlass(String klass) {
        this.marka = marka;
    }





    public Drivers getDriver() {
        return driver;
    }

    public void setDriver(Drivers driver) {
        this.driver = driver;
    }

    public String getModelClass() {
        return modelClass;
    }

    public void setModelClass(String modelClass) {
        this.modelClass = modelClass;
    }
}
