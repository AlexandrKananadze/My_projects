package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<>();
        a.add(10);
        a.add(6);
        a.add(7);

        a.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-(o2);
            }
        });
        System.out.println(a);
        ArrayList<String> b=new ArrayList<>();
        b.add( "SDF");
        b.add("zhfghfh");
        b.add("gxvzx");
        Collections.sort(b, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(b);

        Student Petr= new Student("Petr", 5.9, 41);
        ArrayList <Student> stud= new ArrayList();
        stud.add(Petr);
        Student ietr = new Student("ietr", 3.9, 40);
        Student retr = new Student("retr", 2.9, 41);
        Student wetr = new Student("wetr", 4.9, 40);
        Student netr = new Student("netr", 0.9, 41);
        Student  qwer = new Student("aa", 0.1,41);
        stud.add(ietr);
        stud.add(wetr);
        stud.add(retr);
        stud.add(netr);
        stud.add(qwer);
        stud.sort(Comparator.comparing(o -> o.getFio()));
        System.out.println(stud);
        Collections.sort(stud, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()- o2.getAge();
            }
        });
        System.out.println((stud));
        Collections.sort(stud, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
    //            if((o1.getAge()-o2.getAge())==0){
   //                 return (int)(o1.getRate() - o2.getRate());
    //            }
                return o1.getAge()-o2.getAge();

            }
        });
    }



}
