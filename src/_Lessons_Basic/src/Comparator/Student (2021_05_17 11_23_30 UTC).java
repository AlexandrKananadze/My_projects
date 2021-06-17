package Comparator;

public class Student {
    private String fio;
    private double rate;
    private int age;

  public   Student (String fio, double rate, int age) {
      this.fio = fio;
      this. age = age;
      this.rate  = rate;
  }


    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fio='" + fio + '\'' +
                ", rate=" + rate +
                ", age=" + age +
                '}'+'\n';
    }
}
