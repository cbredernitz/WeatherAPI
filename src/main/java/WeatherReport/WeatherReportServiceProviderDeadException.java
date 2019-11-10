package WeatherReport;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.SERVICE_UNAVAILABLE, code = HttpStatus.SERVICE_UNAVAILABLE, reason = "Dead")
public class WeatherReportServiceProviderDeadException extends RuntimeException{
}
