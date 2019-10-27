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

    @Test
    public void givenWeatherNearestStormDistance_thenReturnNearestStormDistance() {
        weatherReportWeatherModel.setNearestStormDistance(100);
        assertEquals(weatherReportWeatherModel.getNearestStormDistance(), 100);
    }
}

