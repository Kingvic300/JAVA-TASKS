package data.models;

public class TrackingInfo {
    private int id;
    private int itemId;
    private String info;

    public TrackingInfo(int itemId, String info) {
        this.itemId = itemId;
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getTrackingInfoId() {
        return id;
    }

    public void setTrackingInfoId(int id) {
        this.id = id;
    }
}

