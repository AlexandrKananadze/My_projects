package Airport_Online_Table;

public class Aircraft {
    private String model;

    public Aircraft(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Aircraft" +
                "model= " + model;
    }
}
