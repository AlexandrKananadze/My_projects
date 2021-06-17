package LIST;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Calendar {
   static ArrayList <String> st= new ArrayList<>();

public static void list () {
   int  count = 0;
            for(String i:st) {
                count++;
               if (i!=null) System.out.println(count + " "+ i);

            }
}
public static void delete(String s) {
    int a= Integer.parseInt(s);
    if((st.get(a)).equals("---")) {
        return;
    }
    st.remove(a-1);

}
public static void add (String [] s) {
    String str1 = s[1];

        if (s.length>=3  && Character.isDigit(s[1].charAt(0))) {
        int a = Integer.parseInt(s[1]);
        int d=st.size();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 2; i < s.length; i++) {
            stringBuilder.append(s[i]).append(" ");
        }
        String str = stringBuilder + "";
            if (a  == st.size()+1) {
                st.add(str);
            }
        else if (a  > st.size()+1) {
            while (a!=d+1){
            st.add("---");
            d++;
            }
            st.add(a-1,str);
        }
      else {
          if(st.get(a-1).equals("---") ){
              st.set(a-1,str);
          }
                st.add(a-1,str);
            }

    }
        else  {
            if(!(Character.isDigit(s[1].charAt(0)))) {
                int count = 0;
                StringBuilder stringBuilder = new StringBuilder();
                for (String value : s) {
                    stringBuilder.append(value).append(" ");
                }
                String str = stringBuilder + "";
                st.add(0, str1); //

            }

        }
}

public static void edit(String [] s){
    StringBuilder stringBuilder = new StringBuilder();
    int a=Integer.parseInt(s[1]);
    if((!(st.get(a)).equals("---"))) {


        for (int i = 2; i < s.length; i++) {
            stringBuilder.append(s[i]).append(" ");
        }
        st.set(a - 1, stringBuilder + "");
}

}

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        while (true) {
            String str = console.nextLine();
            String[] slova = str.split(" ");
            switch (slova[0]) {
                case ("EDIT") -> edit(slova);
                case ("DELETE") -> delete(slova[1]);
                case ("LIST") -> list();
                case ("ADD") -> add(slova);
            }

        }
    }
}
