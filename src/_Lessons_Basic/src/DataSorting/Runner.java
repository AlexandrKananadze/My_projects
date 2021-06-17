package DataSorting;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Runner {

    public  static Date generator (){
        Random  rnd;
        Date    dt;
        long    ms;

// Get a new random instance, seeded from the clock
        rnd = new Random();

// Get an Epoch value roughly between 1940 and 2010
// -946771200000L = January 1, 1940
// Add up to 70 years to it (using modulus on the next long)
        ms = -146771200000L + (Math.abs(rnd.nextLong()) % (25L * 365 * 24 * 60 * 60 * 1000));

// Construct a date
       return dt = new Date(ms);
    }
   public  static ArrayList<String> li (int a)  {
        ArrayList <String> list= new ArrayList<>(a);
       List <String> marks= List.of("Art","Citizenship","Geography","History","French", "German", "Spanish", "Literacy",
                        "Music"," Natural history");
       for (int i=0; i<a; i++){
           list.add(marks.get((int) (Math.random() * 10)));
       }
       return  list;
   }
  public static ArrayList<Student>  generate (int count){
      ArrayList <Student> st = new ArrayList<Student>();
      for (int i=0; i<count; i++) {
          char [] array = new char [3];
          for (int j =0; j< array.length; j++){
              array [j] = (char)((Math.random ()*25)+65);
          }
        String result = new String(array);
          Student student = new Student();
          student.setFio(result);
          student.setBd(generator());
          student.setRate(Math.random()*10);
          student.setList(li((int)(Math.random()*2)+4));
          st.add(student);
      }
      return st ;
  }
    public static void main(String[] args) {
  //      SimpleDateFormat a= new SimpleDateFormat("dd.MM.yyyy"); // dd mm yy
  //      System.out.println(a.format(generator()));

        List<Student> r= (generate(5));
        r.get(1).getList();
        System.out.println("сортировка по оценкам");
        for (int i=r.size()-1; i>=0; i-- ){

            for (int j=0; j<i;j++) {
                if(r.get(i).getRate() < r.get(j).getRate()){
    Student temp1=r.get(i);
    Student temp2=r.get(j);
    r.set(i,temp2);
    r.set(j,temp1);
                }
            }

        }
        System.out.println(r);
        System.out.println("сортировка по дате рождения");
        for (int i=r.size()-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if (r.get(i).getBd().getTime() < r.get(j).getBd().getTime()) { // сравнение времени data.geTime()
                    Student temp1=r.get(i);
                    Student temp2=r.get(j);
                    r.set(i,temp2);
                    r.set(j,temp1);
                }
            }

        }
        System.out.println(r);
        System.out.println("сортировка по количеству предметов");
        for (int i=r.size()-1; i>=0; i--) {
            for (int j = 0; j < i; j++) {
                if (r.get(i).getList().size() < r.get(j).getList().size()) {
                    Student temp1=r.get(i);
                    Student temp2=r.get(j);
                    r.set(i,temp2);
                    r.set(j,temp1);
                }
            }

        }
        System.out.println(r);
        System.out.println("сортировка по фио в алфавитном порядке");
        for (int i=r.size()-1; i>=0; i--) {
            for (int j = 0; j < i; j++) {
                char[] temp1 = r.get(i).getFio().toCharArray();
                char[] temp2 = r.get(j).getFio().toCharArray();
                if (temp1[0] < temp2[0]) {
                    Student temp11 = r.get(i);
                    Student temp22 = r.get(j);
                    r.set(i, temp22);
                    r.set(j, temp11);
                }
            }

        }
        System.out.println(r);
    }
}
