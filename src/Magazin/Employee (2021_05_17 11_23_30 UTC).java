package Magazin;

import java.util.*;

public class Employee {
    private String fio;
    private int age;
    private ArrayList<String> m;


public Employee(String fio, int age) {
    this.fio = fio;
    this.age = age;
}
    public Employee(String fio, int age,ArrayList<String> m) {
        this.fio = fio;
        this.age = age;
        this.m=m;

    }





    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", m=" + m +
                '}'+'\n';
    }

    public ArrayList<String> getM() {
        return m;
    }

    public void setM(ArrayList<String> m) {
        this.m = m;
    }
}


