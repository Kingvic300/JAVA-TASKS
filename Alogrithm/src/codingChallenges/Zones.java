package codingChallenges;

public enum Zones {
    NORTHCENTRAL("Benue","FCT","Kogi","Kwara","Nasarawa","Niger","Plateau"),
    NORTHEAST("Adamawa","Bauchi","Borno","Gombe","Taraba","Yobe"),
    NORTHWEST("Kaduna","Katsina","Kano","Kebbi","Sokoto","Jigawa","Zamfara"),
    SOUTHEAST("Abia","Anambra","Ebonyi","Enugu"),
    SOUTHSOUTH("Akwa-ibom","Bayelsa","Cross-River","Delta","Edo","Rivers"),
    SOUTHWEST("Ekiti","Lagos","Osun","Ondo","Ogun","Oyo"),;

    private String[] zones;
    Zones(String... zones) {
        this.zones = zones;
    }
    public String[] getZones() {
        return zones;
    }
    public void setZones(String... zones) {
        this.zones = zones;
    }
    public static String findZone(String state){
        String answer = "";
        for(var zones : Zones.values()) {
            for(var states : zones.getZones()){
                if(states.equals(state)){
                    answer = zones.name();
                    break;
                }
            }
        }
        return answer;
    }
}
