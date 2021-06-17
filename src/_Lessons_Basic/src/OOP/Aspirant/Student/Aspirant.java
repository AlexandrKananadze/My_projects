package OOP.Aspirant.Student;

public class Aspirant extends Student {
    private boolean rabota;
    Aspirant(){};
    public Aspirant( String firstName, String lastName,String group,double averageMark,boolean rabota) {
       super( firstName, lastName, group, averageMark);
       this.rabota=rabota;
    }

@Override
    public  int getScholarship(double averageMark) {
        if (averageMark==5 && rabota){
            return 200;
        }
        else return 180;
    }

    public boolean getRabota() {
        return rabota;
    }

    public void setRabota(boolean rabota) {
        this.rabota = rabota;
    }
}
