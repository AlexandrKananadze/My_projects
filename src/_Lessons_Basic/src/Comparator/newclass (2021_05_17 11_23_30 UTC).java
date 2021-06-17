package Comparator;

import javax.swing.text.html.parser.Entity;
import java.util.*;
import java.util.Map.Entry;

public class newclass {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String [] st = str.split(" ");
        Map<String, Integer > s = new HashMap<>();
        for (int i = 0; i < st.length; i++){
            s.put(st[i], st[i].length());
        }
        String rot = console.nextLine();
        System.out.println(ma(s, rot));

        }
        public static Map<String,Integer> ma(Map<String,Integer> i, String rot) {
        Set<Entry<String,Integer>> k = i.entrySet();
        List<Entry<String,Integer>> t= new ArrayList<>(k);
        if (rot.equals("left")) {
            t.sort(new Comparator<Entry<String, Integer>>() {
                @Override
                public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                    return o1.getValue()-o2.getValue();
                }
            });

        }
        else if (rot.equals("right")) {
            t.sort(new Comparator<Entry<String, Integer>>() {
                @Override
                public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                    return o2.getValue()-o1.getValue();
                }
            });
        }
        Map<String,Integer> g = new LinkedHashMap<String,Integer>();
            for (Entry <String, Integer> y: t  ) {
                g.put(y.getKey(), y.getValue());
            }
        return g;
        }
    }

