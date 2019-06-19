import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherTest {

    @Test
    void me() {
        Weather weather = new Weather();
        assertEquals("sunny", weather.me());
    }
}