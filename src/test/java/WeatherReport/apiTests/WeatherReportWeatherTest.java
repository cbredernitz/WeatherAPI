package WeatherReport.apiTests;

import WeatherReport.api.models.Weather;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherReportWeatherTest {

    Weather weather = new Weather();

    @Test
    public void givenWeatherSummary_thenReturnWeatherSummary() {
        weather.setSummary("Rain");
        assertEquals(weather.getSummary(), "Rain");
    }

    @Test
    public void givenWeatherNearestStorm_thenReturnWeatherNearestStorm() {
        weather.setNearestStorm(100);
        assertEquals(weather.getNearestStorm(), 100);
    }

    @Test
    public void givenWeatherTemperature_thenReturnWeatherTemperature() {
        weather.setTemperature(100.3);
        assertEquals(weather.getTemperature(), 100.3);
    }

    @Test
    public void givenWeatherCloudCover_thenReturnWeatherCloudCover() {
        weather.setCloudCover(0.8);
        assertEquals(weather.getCloudCover(), 0.8);
    }

}

