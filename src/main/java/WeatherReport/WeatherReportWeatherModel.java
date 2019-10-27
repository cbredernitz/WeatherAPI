package WeatherReport;

public class WeatherReportWeatherModel {
    private String summary;
    private int nearestStormDistance;

    public void setSummary(String summary) { this.summary = summary; }

    public String getSummary() { return this.summary; }

    public void setNearestStormDistance(int nearestStormDistance) {
        this.nearestStormDistance = nearestStormDistance;
    }

    public int getNearestStormDistance() {
        return nearestStormDistance;
    }
}
