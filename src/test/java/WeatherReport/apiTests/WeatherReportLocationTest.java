package WeatherReport.apiTests;

import WeatherReport.api.models.Location;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WeatherReportLocationTest {

    Location location = new Location();

    @Test
    public void givenLocationLatitude_thenGetLocationLatitude() {
        location.setLatitude(70.80);
        assertEquals(location.getLatitude(), 70.80);
    }

    @Test
    public void givenLocationLongitude_thenGetLongitudeLatitude() {
        location.setLongitude(70.80);
        assertEquals(location.getLongitude(), 70.80);
    }
}
