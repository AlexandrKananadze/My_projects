package OOP.Student;

public class Runner {
    public static void main(String[] args) {
       Student st= new Student();
       st.setname("Alex");
       st.setage(20);
       st.setweight(90);
       st.setlength(188);

       Student st2 = new Student(13, "Alex2", 180,90);


      Student st3 = new Student(13,"Alex3");
              st3.setlength(189);
              st3.setweight(81);


       System.out.println(st);
       System.out.println(st2);
       System.out.println(st3);

       Pervokurs per=new Pervokurs(3);
       per.Say();


    }
  }
