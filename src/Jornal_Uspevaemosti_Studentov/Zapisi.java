package Jornal_Uspevaemosti_Studentov;

import java.io.*;
import java.util.*;

public class Zapisi {

    public void input () throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Data/input.txt", true));
        Scanner console = new Scanner(System.in);
        System.out.println("Input id");
        String id = console.nextLine();
        System.out.println("Input Group");
        String group = console.nextLine();
        System.out.println("Input fio");
        String fio = console.nextLine();
        System.out.println("Input mathematic grade");
        String math = console.nextLine();
        System.out.println("Input programming grade");
        String prog= console.nextLine();
        System.out.println("Input engineer grade");
        String engineer = console.nextLine();

        bufferedWriter.write(id + " " + group + " " + fio + " " + math + " " + prog + " " + engineer + " ");
        bufferedWriter.newLine();
        bufferedWriter.flush();
    }
    public void output() throws IOException {
        String str;
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Data/input.txt"));
        while ((str = bufferedReader.readLine()) != null) {
            String[] s = str.split(" ");
            System.out.println("id= " + s[0] + " " + "group= " + s[1] + " Fio " + s[2] + " "
                    + "math " + s[3] + " " + "prog " + s[4] + " " + "eng " + s[5]);
        }
        bufferedReader.close();
    }
    public void findById () throws  IOException {
        Scanner con = new Scanner(System.in);
        String in;
        String str;
        System.out.println("Input Id");
        in = con.nextLine();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Data/input.txt"));
        while ((str = bufferedReader.readLine()) != null) {
            String [] s = str.split(" ");
           if (s[0].equalsIgnoreCase(in)) {
               System.out.println("id= " + s[0] + " " + "group= " + s[1] + "Fio " + s[2] + " " + "math " + s[3] + " " + "prog " + s[4] + " " + "eng " + s[5]);
            }
        }
    }
    public void delete() throws IOException {
        File base = new File("Data/input.txt");
        File temp = new File("Data/input1.txt");
        String str;
        String in;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(base));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(temp));
        Scanner con = new Scanner(System.in);
        System.out.println("Input Id");
        in = con.nextLine();
        while ((str = bufferedReader.readLine()) != null) {
            String [] s = str.split(" ");
            if (!(s[0].equalsIgnoreCase(in))) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        }
        bufferedReader.close();
        bufferedWriter.close();
        base.delete();
        temp.renameTo(base);
    }
    public void renewZapis()throws IOException {
        String str;
        String in;
        File base = new File("Data/input.txt");
        File temp = new File("Data/input1.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(base));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(temp));
        Scanner con = new Scanner(System.in);
        System.out.println("Input Id for Rewrite");
        in = con.nextLine();
        System.out.println("Input Group");
        String group = con.nextLine();
        System.out.println("Input fio");
        String fio = con.nextLine();
        System.out.println("Input mathematic grade");
        String math = con.nextLine();
        System.out.println("Input programming grade");
        String prog = con.nextLine();
        System.out.println("Input engineer grade");
        String engineer = con.nextLine();

        while ((str = bufferedReader.readLine()) != null) {
            String [] s = str.split(" ");
            if (!(s[0].equals(in))) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            } else {
            bufferedWriter.write(in + " " + group+ " " + fio + " " + math + " " + prog + " " + engineer + " ");
            bufferedWriter.newLine();
            bufferedWriter.flush();
            }
        }
        bufferedReader.close();
        bufferedWriter.close();
        base.delete();
        temp.renameTo(base);
    }
    public  void studentList () throws IOException {
        Scanner co = new Scanner(System.in);
        System.out.println(" Input group name");
        String groupSelection = co.nextLine();
        File base = new File("Data/input.txt");
        String str;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(base));
        Map<String, Student> stud = new HashMap<String, Student>();
        while ((str = bufferedReader.readLine()) != null) {
            String[] s = str.split(" ");
            if (s[1].equals(groupSelection)) {
            Student st = new Student( s[1] , s[2], List.of(Integer.parseInt(s[3]), Integer.parseInt(s[4]), Integer.parseInt(s[5])));
            stud.put(s[0], st); }
        }
// группа - средний бал 7 и выше - в алфавитом порядке из файла input.txt
       stud.entrySet().forEach(x -> {
         double aver = x.getValue().getGrades().stream().mapToDouble(y -> Integer.parseInt(String.valueOf(y))).average().orElse(Double.NaN);
                 x.getValue().setOverrage(aver); });

        stud.entrySet().stream().filter(x -> x.getValue().getOverrage() > 7)
                .sorted((x, y) -> x.getValue().getFio().compareTo(y.getValue().getFio()))
                .forEach(x-> System.out.println(x.getValue()));
    }
}
