package Logistics;

public class Package {
    private int code;
    private String address;
    private String packageName;
    public Package(int code, String address, String packageName) {
        this.code = code;
        this.address = address;
        this.packageName = packageName;
    }
    public boolean verifyCode(int code) {
        if (this.code == code) {
            return true;
        }
        throw new IllegalArgumentException("wrong code");
    }
}
