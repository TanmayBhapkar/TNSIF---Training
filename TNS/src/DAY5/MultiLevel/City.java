package DAY5.MultiLevel;

public class City extends State {

    private String cityName;
    private float area;

    // Getters and Setters
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "City [cityName=" + cityName + ", area=" + area +
                ", stateName=" + getStateName() +
                ", language=" + getLanguage() +
                ", countryName=" + getCountryname() +
                ", capital=" + getCapital() + "]";
    }
}
