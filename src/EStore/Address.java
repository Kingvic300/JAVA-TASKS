package EStore;

public class Address {
   private String cityName ;
   private String countryName ;
    private int houseNumber;
    private String streetName;
    private  String stateName;

    public Address(String cityName, String countryName, int houseNumber, String streetName, String stateName) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.stateName = stateName;
    }
}
