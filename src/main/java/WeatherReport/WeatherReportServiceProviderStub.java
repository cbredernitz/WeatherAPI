package WeatherReport;

import org.springframework.stereotype.Service;

@Service
public class WeatherReportServiceProviderStub {

    public WeatherReportWeatherModel getWeather(WeatherReportLocationModel location) {
        if (location.getLatitude() != 99.99) {
            WeatherReportWeatherModel weatherReportWeatherModel = new WeatherReportWeatherModel();
            weatherReportWeatherModel.setSummary("Rain Today");
            weatherReportWeatherModel.setNearestStormDistance(150);
            weatherReportWeatherModel.setTemperature(50);

            return weatherReportWeatherModel;
        } else {
            throw new WeatherReportServiceProviderDeadException();
        }
    }
}
