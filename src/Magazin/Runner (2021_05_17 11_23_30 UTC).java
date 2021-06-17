package Magazin;

import java.util.*;

public class Runner {
    public static ArrayList<String> maps(String s) {

        String[] st = s.split(" ");
        Map<Integer, String> mapa = new HashMap<>();
        for (int i = 0; i < st.length; i++) {
            mapa.put(i, st[i]);
        }
        return new ArrayList<>(mapa.values());
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str1 = console.nextLine();
        Employee e1=new Employee("vasya",19,maps(str1));

        String str2 = console.nextLine();
        Employee e2=new Employee("petya", 20,maps(str2));

        String str3 = console.nextLine();
        Employee e3=new Employee("234234", 40,maps(str2));


        ArrayList <Employee> li= new ArrayList<>();
        li.add(e1);
        li.add(e2);
        System.out.println(li);

       // сортировка по возрасту
    Collections.sort(li, new Comparator<Employee>() {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAge()- o2.getAge();
    }
    });
        System.out.println(li);

        //сортировка по фио
Collections.sort(li, new Comparator<Employee>() {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getFio().compareTo(o2.getFio()) ;
    }
});
        System.out.println(li);

        // сортировка возраст одинаковый то по имени
    Collections.sort(li, new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            if (o1.getAge() == o2.getAge()) {
                return o1.getFio().compareTo(o2.getFio());
            } else return o1.getAge() - o2.getAge();
        }});
        System.out.println(li);
    Collections.sort(li, new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getM().size()-o2.getM().size();
        }
    });
        System.out.println(li);

}}
