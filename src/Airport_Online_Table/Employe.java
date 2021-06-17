package Airport_Online_Table;

public class Employe {
    private  int id;
    private  int age;
    private String  fio;
    private  int salary;

   Employe(){}

    Employe (int id, int age, String fio, int salary) {
    this.id= id;
    this.age = age;
    this.fio = fio;
    this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", age=" + age +
                ", fio='" + fio + '\'' +
                ", salary=" + salary +
                '}';
    }
}
