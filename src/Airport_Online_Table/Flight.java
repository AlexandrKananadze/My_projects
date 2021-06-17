package Airport_Online_Table;

import java.util.Date;

public class Flight {
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Aircraft getModel() {
        return model;
    }

    public void setModel(Aircraft model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    private  String  code;
    private Date date;
    private Aircraft model;
    private  Type type;


    Flight (String code, Date date, Aircraft model, Type type) {
        this.code = code;
        this.date=date;
        this.model=model;
        this.type = type;


    }

    @Override
    public String toString() {
        return " Flight " +
                "code='" + code + '\'' +
                ", date=" + date +
                ", model='" + model + '\'' +
                ", type=" + type +
                '\n';
    }
}
