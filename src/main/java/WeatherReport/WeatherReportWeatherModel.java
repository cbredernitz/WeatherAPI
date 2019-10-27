package WeatherReport;

public class WeatherReportWeatherModel {
    private String summary;
    private int nearestStorm;
    private double temperature;
    private double cloudCover;

    public void setSummary(String summary) { this.summary = summary; }

    public String getSummary() { return this.summary; }
}
