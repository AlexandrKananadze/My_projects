package OOP.AnimalKlinic;

public class Runner {
    public static void main(String[] args) {
        Animal cat=new Animal() {
            @Override
            public void Cat() {
                super.Cat();
            }
        };
        System.out.println(cat);
        cat.makeNoise(cat);
    }
}
