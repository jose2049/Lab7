package atu.ie;

import java.util.Objects;

//Here I create a class
public class PersonClass {

    private String name;
    private String address;
    private String phoneNumber;


    //Default constructor
    public PersonClass() {

        this.name = "";
        this.address = "";
        this.phoneNumber = "";
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PersonClass{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
