
import java.util.ArrayList;

public class Airport {

    public Weather air;
    public String weather;

    public Airport(Weather weather) {
        this.air = weather;
    }

    ArrayList<Plane> planes = new ArrayList<>();


    public ArrayList getPlanes() {
        return planes;
    }


    public void land() {
       Plane plane = new Plane();
       planes.add(plane);
    }

    public void checkWeather() {
        weather = air.me();
    }
}
