package WeatherReport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WeatherReportLocationModelTests {

    WeatherReportLocationModel weatherReportLocationModel = new WeatherReportLocationModel();

    @Test
    public void givenLocationLatitude_thenGetLocationLatitude() {
        weatherReportLocationModel.setLatitude(70.80);
        assertEquals(weatherReportLocationModel.getLatitude(), 70.80);
    }

    @Test
    public void givenLocationLongitude_thenGetLongitudeLatitude() {
        weatherReportLocationModel.setLongitude(70.80);
        assertEquals(weatherReportLocationModel.getLongitude(), 70.80);
    }
}
