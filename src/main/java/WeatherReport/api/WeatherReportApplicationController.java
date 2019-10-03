package WeatherReport.api;

import WeatherReport.api.models.Location;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "Something should show up here")
public class WeatherReportApplicationController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping(name = "Weather Get", path = "/WeatherReport/{location}")
    public String weather(@PathVariable String location) {
        return location;
    }
}
