package DAY5.MultiLevel;

public class State extends Country {

    // Data members
    private String stateName;
    private String language;

    // Getters and Setters
    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "State [stateName=" + stateName + ", language=" + language +
                ", countryName=" + getCountryname() +
                ", capital=" + getCapital() + "]";
    }
}
