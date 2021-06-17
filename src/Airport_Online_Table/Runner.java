package Airport_Online_Table;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {

        Airport sharik = new Airport();
        sharik.genFlight();
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd.MM hh.mm");
        //   System.out.println(sharik.genDate());

        //  System.out.println(sharik.getTerminalList());

        // Вывод всех рейсов терминала А
        sharik.getTerminalList().stream()
        .filter(x->x.getTerminalName().equals("A")).forEach(x-> System.out.println(x));

        // список рейсов в ближайшие 2 часа
       List<Terminal> termlist = sharik.getTerminalList();
       Calendar calendar = Calendar.getInstance();

       Date date = calendar.getTime(); // текущая дата
       Calendar calendar1 = Calendar.getInstance();
       calendar1.add(Calendar.HOUR_OF_DAY,2); //дата плюс два часа
       Date date1 = calendar1.getTime();

         termlist.stream()
         .flatMap(x->x.getFlightList().stream()
         .filter(y->y.getDate().after(date) && y.getDate().before(date1) ))
         .forEach(System.out::println);

        // рейсы которые прилетели от 3 до 5 часов назад
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(Calendar.HOUR_OF_DAY, -3);
        Date date3H = calendar2.getTime();
        calendar2.add(Calendar.HOUR_OF_DAY, -2);
        Date date5H = calendar2.getTime();
      //  System.out.println(simpleDateFormat.format(date5H)); проверка даты
      //  System.out.println(simpleDateFormat.format(date3H)); проверка даты

        termlist.stream()
        .flatMap(x->x.getFlightList().stream()
        .filter(y->y.getDate().after(date5H) && y.getDate().before(date3H)));

    // с парковки вывести самый частый самолет и его количество повторений  парковке
        termlist.stream().filter(x->x.getTerminalName().equals("A"))
        .flatMap(x->x.getAircraftList().stream())
        .collect(Collectors.groupingBy(u->u.getModel(),Collectors.counting())).entrySet().stream()
        .sorted((x,y) -> x.getKey().compareTo(y.getKey())).findFirst().stream()
        .forEach(x-> System.out.println(x));

       //  for (Map.Entry<String, Long> s: rr.entrySet()) { вывод мапы на всякий случай для проверки
       //        System.out.println(s);
       //    }
     // вывести ближайший рейс у которого код состоит из 5 ти символов
        Calendar calendar3 =Calendar.getInstance();
        Date dateNearest = calendar3.getTime();
        System.out.println(simpleDateFormat.format(dateNearest));

        System.out.println(termlist.stream().flatMap(x -> x.getFlightList().stream())
              .filter (z->z.getCode().length() == 5)
              .filter(y -> y.getDate().after(dateNearest))
              .sorted((x,y)->x.getDate().compareTo(y.getDate())).findFirst());

    // вывести количество рейсов которые улетают через 12 часов (сколько рейсов в табло)
        calendar3.add(Calendar.HOUR_OF_DAY, 12);
        Date date12h=calendar3.getTime();
        System.out.println(termlist.stream().flatMap(x->x.getFlightList().stream()
        .filter(y->y.getDate().before(date12h) && y.getDate().after(dateNearest))));

     // сколько сегодня прилетело аэробусов 12 вперед 12 назад часов.
        calendar3.add(Calendar.HOUR_OF_DAY, -24);
        Date dateminus12 = calendar3.getTime();

        termlist. stream().flatMap(x->x.getFlightList().stream())
        .filter(x-> x.getDate().after(dateminus12) && x.getDate().before(date12h))
        .filter(x->x.getModel().getModel().equals("Aerobus"))
        .forEach(x-> System.out.println(x));

    }
}
