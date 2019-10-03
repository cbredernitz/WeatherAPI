package WeatherReport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WeatherReportApplication {
    
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(WeatherReportApplication.class, args);
    }
}

