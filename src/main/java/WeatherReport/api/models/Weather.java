package WeatherReport.api.models;

public class Weather {
    private String summary;
    private int nearestStorm;
    private double temperature;
    private double cloudCover;

    public void setSummary(String summary) { this.summary = summary; }

    public String getSummary() { return this.summary; }

    public void setNearestStorm(int nearestStorm) { this.nearestStorm = nearestStorm; }

    public int getNearestStorm() { return nearestStorm; }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setCloudCover(double cloudCover) {
        this.cloudCover = cloudCover;
    }

    public double getCloudCover() {
        return cloudCover;
    }
}
