package WeatherReport;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WeatherReportServiceProviderStubTests {

    @Autowired
    WeatherReportServiceProviderStub weatherReportServiceProviderStub;

    @Autowired
    private Mockito mockito;

    @Test
    public void givenLocation_whenGetWeatherCalled_thenReturnWeatherModelWithSummaryRainToday() {
        WeatherReportLocationModel weatherReportLocationModel = new WeatherReportLocationModel();
        weatherReportLocationModel.setLatitude(70.55);
        weatherReportLocationModel.setLongitude(110.38);

        WeatherReportWeatherModel expectedWeather = new WeatherReportWeatherModel();
        expectedWeather.setSummary("Rain Today");

        WeatherReportServiceProviderStub weatherReportServiceProviderStub = new WeatherReportServiceProviderStub();

        WeatherReportWeatherModel returnWeather = weatherReportServiceProviderStub.getWeather(weatherReportLocationModel);
        assertEquals(expectedWeather.getSummary(), returnWeather.getSummary());
    }

    @Test
    public void givenLocation_whenGetWeatherCalled_thenReturnWeatherModelWithNearestStormDistance150() {
        WeatherReportLocationModel weatherReportLocationModel = new WeatherReportLocationModel();
        weatherReportLocationModel.setLatitude(70.55);
        weatherReportLocationModel.setLongitude(110.38);

        WeatherReportWeatherModel expectedWeather = new WeatherReportWeatherModel();
        expectedWeather.setNearestStormDistance(150);

        WeatherReportServiceProviderStub weatherReportServiceProviderStub = new WeatherReportServiceProviderStub();

        WeatherReportWeatherModel returnWeather = weatherReportServiceProviderStub.getWeather(weatherReportLocationModel);
        assertEquals(expectedWeather.getNearestStormDistance(), returnWeather.getNearestStormDistance());
    }
    @Test()
    public void givenLocation_whenGetWeatherCalled_thenReturnWeatherModelWithTemperature50() {
        WeatherReportLocationModel weatherReportLocationModel = new WeatherReportLocationModel();
        weatherReportLocationModel.setLatitude(70.55);
        weatherReportLocationModel.setLongitude(110.38);

        WeatherReportWeatherModel expectedWeather = new WeatherReportWeatherModel();
        expectedWeather.setTemperature(50);

        WeatherReportServiceProviderStub weatherReportServiceProviderStub = new WeatherReportServiceProviderStub();

        WeatherReportWeatherModel returnWeather = weatherReportServiceProviderStub.getWeather(weatherReportLocationModel);
        assertEquals(expectedWeather.getTemperature(), returnWeather.getTemperature());
    }

    @Test()
    public void givenLocation9999and9999_whenGetWeatherCalled_thenThrowServicePrivoderDeadExeption() throws WeatherReportServiceProviderDeadException{
        WeatherReportLocationModel weatherReportLocationModel = new WeatherReportLocationModel();
        weatherReportLocationModel.setLatitude(99.99);
        weatherReportLocationModel.setLongitude(99.99);

        WeatherReportWeatherModel expectedWeather = new WeatherReportWeatherModel();

        WeatherReportServiceProviderStub weatherReportServiceProviderStub = new WeatherReportServiceProviderStub();

        assertThrows(WeatherReportServiceProviderDeadException.class, () -> {
            weatherReportServiceProviderStub.getWeather(weatherReportLocationModel);
        });
    }
}
