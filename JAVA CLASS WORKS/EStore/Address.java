package EStore;

public class Address {
    String cityName ;
    String countryName ;
    int houseNumber;
    String streetName;
    String stateName;

    public Address(String cityName, String countryName, int houseNumber, String streetName, String stateName) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.stateName = stateName;
    }
}
