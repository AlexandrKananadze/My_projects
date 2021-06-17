package OOP.Library1;

public class Runner extends Reader {
    public static void main(String[] args) {
        Reader st1 = new Reader("ivan",12,"fgh",180908,123525); // создание копии обьекта экземпляра
        Reader st2 = new Reader("asdf",34,"sdsf",2345,234543);
     Reader[] st= new Reader[2];
      st[0] = st1;
      st[1]=st2;

    Runner s= new Runner(); // создаем обьект текущего класса (потому что не статические методы). Только через обьект
    s.setFio("DFAF");
        System.out.println();
    s.takebook(1);
        System.out.println();
    s.takebook( "Cnheufwrbt","asdfadfas","sadfadfas");
        System.out.println();
    s.takebook(new Book("asdfa","asdfadf"));

    }

    public void takebook(int bookcount) {
        System.out.println(getFio()+" "+"take"+" "+bookcount);
    }

    public void takebook (String... bookname) { // передаем неограниченное количетво bookname
        for (String i:bookname){
            System.out.print(getFio()+""+"take"+" "+":"+i);
        }

    }
    public void  takebook (Book... list) { // передаем обьекты (созданные по методу Book)
        for (Book i: list) {
            System.out.print(getFio()+""+"take"+" "+i.getBookname()); // забираем из обьекта Book=list=i название
        }

    }

}
