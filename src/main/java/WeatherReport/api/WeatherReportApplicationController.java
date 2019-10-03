package WeatherReport.api;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@Api(value = "Something should show up here")
public class WeatherReportApplicationController {
    
    @RequestMapping("/")
    @GetMapping
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/WeatherReport")
    public String hello() { return "Greetings from Spring Boot!";}
    
}
