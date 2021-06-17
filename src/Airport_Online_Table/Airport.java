package Airport_Online_Table;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Airport {
    private String name;
    private ArrayList<Terminal> terminalList = new ArrayList<Terminal>();

public Airport(){}
    public Airport(String name, ArrayList<Terminal> terminalList) {
        this.name = name;
        this.terminalList = terminalList;
    }

// генерация кода рейса
    public String flightCode () {
        String[] air = {"HH", "DD", "CC", "JJ"};
        return air[(int) (Math.random()*4)] +(int)(Math.random()*10000);
    }
    //генерация самолета на котором полетит рейс
    public Aircraft genAirplane() {
        String [] models = {"Boing", "Aerobus", "TU"};
        return new Aircraft(models[(int)(Math.random()*3)]);
    }
    //генерация время вылета или прилета
    public Date  genDate (){
        String dateFormate = "dd.MM.yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormate);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_WEEK,2);

        Date randomDate = new Date(ThreadLocalRandom.current()
                .nextLong(new Date().getTime(), calendar.getTime().getTime()));
        return randomDate;
    }

    // сборка данных рейса на табло

   public  Flight flight (Type type) {
       return new Flight(flightCode(), genDate(), genAirplane(), type);
   }
//генерация рейсов под термирал
   public void genFlight() {
       String[] name = {"A", "B", "C", "D", "E"};
       ArrayList<Flight> flights=new ArrayList<Flight>();
       for (int i = 0; i < 50; i++) {
           flights.add(flight(Type.Prilet));
       }
       for (int i = 0; i < 50; i++) {
           flights.add(flight(Type.Vilet));
       }
       ArrayList<Aircraft> b = new ArrayList<Aircraft>();
       for(int i = 0; i < 50; i++) {
           b.add(genAirplane());
       }
       for (int i = 0; i < 5; i++){
           Terminal t = new Terminal(name[i], flights, b);
           terminalList.add(t);
       }
      }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Terminal> getTerminalList() {
        return terminalList;
    }

    public void setTerminalList(ArrayList<Terminal> terminalList) {
        this.terminalList = terminalList;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + name + '\n' +
                " terminalList=" + terminalList +
                '}';
    }


}
