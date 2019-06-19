import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AirportTest {

    Airport airport;
    Weather fakeWeather;
    @BeforeEach
    void setup() {
        fakeWeather = mock(Weather.class);
        airport = new Airport(fakeWeather);
    }

    @Test
    void landsPlanes() {
        when(fakeWeather.me()).thenReturn("sunny");
        airport.land();
        Assertions.assertEquals(1, airport.getPlanes().size());
    }

    @Test
    void doesNotlandPlanes() {
        when(fakeWeather.me()).thenReturn("stormy");
        Assertions.assertThrows(RuntimeException.class, () -> {
            airport.land();
        });
    }

    @Test
    void checksWeather() {
        when(fakeWeather.me()).thenReturn("sunny");
        airport.checkWeather();
        Assertions.assertEquals("sunny", airport.weather);
    }
    @Test
    void makeTheWeatherStormy() {
        when(fakeWeather.me()).thenReturn("stormy");
        airport.checkWeather();


        Assertions.assertEquals("stormy", airport.weather);
    }
}
