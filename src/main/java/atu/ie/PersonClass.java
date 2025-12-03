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
    //Parameterized constructor
    public PersonClass(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    //Setting setters and getters
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

    //Returning a readable representation for name, address, adn phone number
    @Override
    public String toString() {
        return "PersonClass{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
