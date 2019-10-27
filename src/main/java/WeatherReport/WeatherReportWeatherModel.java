package WeatherReport;

public class WeatherReportWeatherModel {
    private String summary;
    private int nearestStormDistance;
    private int temperature;

    public void setSummary(String summary) { this.summary = summary; }

    public String getSummary() { return this.summary; }

    public void setNearestStormDistance(int nearestStormDistance) {
        this.nearestStormDistance = nearestStormDistance;
    }

    public int getNearestStormDistance() {
        return nearestStormDistance;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
