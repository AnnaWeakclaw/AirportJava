import java.util.Random;

public class Weather {

    public String me() {
        String[] conditions = {"sunny", "sunny", "sunny", "sunny", "stormy"};
        int rand = new Random().nextInt(conditions.length);
        return conditions[rand];
    }
}
