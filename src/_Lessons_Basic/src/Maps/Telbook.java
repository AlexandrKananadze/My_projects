package Maps;

import javax.sound.midi.Soundbank;
import javax.swing.text.html.parser.Entity;
import java.sql.SQLOutput;
import java.util.*;

public class Telbook {
  static Map<String,String> book = new HashMap<>();
  static Scanner console= new Scanner(System.in);
  static public void show() {
      Set<Map.Entry<String,String>> st= book.entrySet();
      for(Map.Entry<String,String> a:st) {
          System.out.println(a.getKey() +" : " + a.getValue());
      }
  }
  static public void inputTel(String s){
     // String teltest = "\\ 0-9{10,12}";
      if (book.containsKey(s)) {
          System.out.println(book.get(s));
      }
      else {
          System.out.println("Новый контакт введите Имя абонента");
          String name = console.nextLine();
          book.put(s,name);
      }

  }
  static public void inputName (String s) {
   //   String nametest = "\\z-zA-z {3,10} + z-zA-z {3,10}+z-zA-z {3,10}";
      if (book.containsValue(s) ) {
          System.out.println(outputname(s));
      }
        else {
          System.out.println("Имени нет введите тел абонента" + s);
          String tel = console.nextLine();
          book.put(tel, s);
      }
  }
  static private String outputname (String s) {
      Set<Map.Entry<String, String>> st = book.entrySet();
      for (Map.Entry<String, String> a : st) {
          if (a.getValue().equals(s)) {
   //           System.out.println(a.getKey());
              return a.getKey();
          }
        }
    return null;
  }

    public static void main(String[] args) {
        System.out.println("введите телефон или имя абонента");
          while (true) {
            String str = console.nextLine();
              if(str.equals("LIST")) {
                show();
            }
            else if (str.matches("\\d+")) {
                inputTel(str);
            }

             else  {
                inputName(str);
            }


        }

    }
}
