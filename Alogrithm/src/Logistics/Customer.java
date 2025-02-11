package Logistics;

import java.util.ArrayList;
import java.util.Random;

public class Customer {
    private int code;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String packageName;
    private ArrayList<Package> packages = new ArrayList<Package>();
    public Customer( String name, String address, String phone, String email,String packageName) {
        this.code = getCode();
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.packageName = packageName;
    }
    private int generateCode(){
        Random rand = new Random();
        return rand.nextInt(1000);

    }
    public int getCode() {
       return generateCode();
    }
    public void addPackage(String packageName){
        Package product = new Package(this.code,this.address,packageName);
        packages.add(product);
    }
}

