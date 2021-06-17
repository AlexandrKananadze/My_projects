package OOP.Student;

public class Pervokurs extends Student{
    private int nesdano;

    public Pervokurs(int nesdano,int age,String name, int length, int weight){
        super(age,name,length,weight);
        this.nesdano=nesdano;
    }
    public Pervokurs(int nesdano){
        this.nesdano=nesdano;
    }
}
