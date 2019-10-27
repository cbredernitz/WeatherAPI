package WeatherReport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherReportWeatherModelTests {

    WeatherReportWeatherModel weatherReportWeatherModel = new WeatherReportWeatherModel();

    @Test
    public void givenWeatherSummary_thenReturnWeatherSummary() {
        weatherReportWeatherModel.setSummary("Rain");
        assertEquals(weatherReportWeatherModel.getSummary(), "Rain");
    }
}

