package WeatherReport.api.models;

public class Location {

    public Location() {}

    private double latitude;
    private double longitude;

    public double getLatitude() { return this.latitude; }

    public void setLatitude(double latitude) { this.latitude = latitude; }

    public double getLongitude() { return this.longitude; }

    public void setLongitude(double longitude) {this.longitude = longitude;}
}
