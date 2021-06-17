package OOP.Aspirant.Student;


public class Runner extends Aspirant {
    public static void main(String[] args) {


        Student st1=new Student ("ivan", "ivanov", "three",5);
        Student st2=new Student ("i", "i", "t",4);

        Aspirant as1= new Aspirant("a","a","four",5,true);
        Aspirant as2= new Aspirant("b","b","four",4,true);

        Student[] clas =  {st1,st2,as1,as2};
  //      System.out.println(st1.getScholarship(st1.getAverageMark()));
  //      System.out.println(st2.getScholarship(st2.getAverageMark()));

        for (Student i:clas) {
            System.out.println(i.getFirstName()+" "+i.getLastName()+" "+i.getAverageMark()+" " + i.getScholarship(i.getAverageMark()));
        }

    }
}
