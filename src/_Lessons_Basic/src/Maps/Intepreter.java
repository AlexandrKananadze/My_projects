package Maps;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Intepreter {




public static void main(String[]args) {
    Map<String, String> mp = new HashMap<>();
    mp.put("Яблоко", "Apple");
    mp.put("Пирог", "Pie");
    mp.put("Дорога", "Road");
    mp.put("Карандаш", "Pensil");
    mp.put("Апельсин", "Orange");
    /// for (int i=0; i< mp.size();i++){
    /// System.out.println(mp);
    /// }
    Set<Map.Entry<String, String>> st = mp.entrySet();
    System.out.println(" Выберите язык ввода 1 - англ 2 - русский");
    Scanner console = new Scanner(System.in);
    int lan= console.nextInt();
    String s = console.nextLine();
    String[] str = s.split(" ");
    StringBuilder stringbuilder = new StringBuilder();

    for (String a : str) {
        for (Entry<String, String> b : st) {
            if (a.equals(b.getKey()) && lan== 2) {
                stringbuilder.append(b.getValue()).append(" ");
            }
            if (a.equals(b.getValue()) && lan==1) {
                stringbuilder.append(b.getKey()).append(" ");
            }
        }
        System.out.println(stringbuilder);
    }

}}
