package WeatherReport;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class WeatherReportControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    @DirtiesContext
    public void givenWHelloEndpoint_thenReturnOk() throws Exception {
        mockMvc.perform(get("/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    @DirtiesContext
    public void givenLocation_whenWeatherReportEndpointCalled_thenReturnOk() throws Exception {
        WeatherReportLocationModel weatherReportLocationModel = new WeatherReportLocationModel();
        weatherReportLocationModel.setLatitude(80.89);
        weatherReportLocationModel.setLongitude(157.89);

        mockMvc.perform(get("/WeatherReport/location").contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(weatherReportLocationModel)))
                .andExpect(status().isOk());
    }

}