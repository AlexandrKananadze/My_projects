package Jornal_Uspevaemosti_Studentov;
import java.util.List;

public class Student {

    private String group;
    private String fio;
    private List<Integer> grades;
    private  double overrage;

    Student ( String group, String fio, List<Integer> grades)  {
        this.grades = grades;
        this.fio = fio;
        this.group= group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                ", fio='" + fio + '\'' +
                ", grades=" + grades +
                '}';
    }

    public double getOverrage() {
        return overrage;
    }

    public void setOverrage(double overrage) {
        this.overrage = overrage;
    }
}
