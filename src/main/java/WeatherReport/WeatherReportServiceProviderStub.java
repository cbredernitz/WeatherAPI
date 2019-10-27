package WeatherReport;

import org.springframework.stereotype.Service;

@Service
public class WeatherReportServiceProviderStub {

    public WeatherReportWeatherModel getWeather(WeatherReportLocationModel location) {
        WeatherReportWeatherModel weatherReportWeatherModel = new WeatherReportWeatherModel();
        weatherReportWeatherModel.setSummary("Rain Today");
        return weatherReportWeatherModel;
    }
}
