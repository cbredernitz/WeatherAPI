package WeatherReport;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@Api(value = "Something should show up here")
public class WeatherReportController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping(name = "Weather Get", path = "/WeatherReport/location")
    public ResponseEntity<WeatherReportWeatherModel> getWeather(@RequestBody WeatherReportLocationModel location) {

            WeatherReportServiceProviderStub service = new WeatherReportServiceProviderStub();

            WeatherReportWeatherModel responseWeather = service.getWeather(location);
            return ResponseEntity.ok(responseWeather);
    }
}
