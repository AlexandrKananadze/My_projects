package Airport_Online_Table;

import java.util.ArrayList;

public class Terminal {
    private String terminalName;
    private ArrayList<Flight>  FlightList;
    private  ArrayList<Aircraft> AircraftList;

    public Terminal(String terminalName, ArrayList<Flight> flightList, ArrayList<Aircraft> aircraftList) {
        this.terminalName = terminalName;
        FlightList = flightList;
        AircraftList = aircraftList;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    public ArrayList<Flight> getFlightList() {
        return FlightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        FlightList = flightList;
    }

    public ArrayList<Aircraft> getAircraftList() {
        return AircraftList;
    }

    public void setAircraftList(ArrayList<Aircraft> aircraftList) {
        AircraftList = aircraftList;
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "terminalName='" + terminalName + '\n' +
                ", FlightList=" + FlightList +
                ", AircraftList=" + AircraftList +
                '}';
    }
}
