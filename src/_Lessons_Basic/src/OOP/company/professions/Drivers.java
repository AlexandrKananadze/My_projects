package OOP.company.professions;

public class Drivers {
    private String fio;
    private int stage;

   public Drivers(){}

    public Drivers (String fio,int stage){
    this.fio=fio;
    this.stage=stage;
}

    public Drivers(String fio) {
    this.fio=fio;
    }

    @Override
    public String toString() {
        return "Drivers{" +
                "fio='" + fio + '\'' +
                ", stage=" + stage +
                '}';
    }



    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }
}
