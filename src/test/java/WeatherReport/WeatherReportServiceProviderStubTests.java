package WeatherReport;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherReportServiceProviderStubTests {

    @Autowired
    WeatherReportServiceProviderStub weatherReportServiceProviderStub;

    @Autowired
    private Mockito mockito;

    @Test
    public void givenLocation_whenGetWeatherCalled_thenReturnWeatherModelWithSummary() {
        WeatherReportLocationModel weatherReportLocationModel = new WeatherReportLocationModel();
        weatherReportLocationModel.setLatitude(70.55);
        weatherReportLocationModel.setLongitude(110.38);

        WeatherReportWeatherModel expectedWeather = new WeatherReportWeatherModel();
        expectedWeather.setSummary("Rain Today");

        WeatherReportServiceProviderStub weatherReportServiceProviderStub = new WeatherReportServiceProviderStub();

        WeatherReportWeatherModel returnWeather = weatherReportServiceProviderStub.getWeather(weatherReportLocationModel);
        assertEquals(expectedWeather.getSummary(), returnWeather.getSummary());
    }
}
