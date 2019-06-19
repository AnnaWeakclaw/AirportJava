
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
        if (!checkWeather()) {
            throw new RuntimeException("Weather is stormy");
        }
       Plane plane = new Plane();
       planes.add(plane);
    }

    public boolean checkWeather() {

        weather = air.me();
        return weather == "sunny";
    }
}
