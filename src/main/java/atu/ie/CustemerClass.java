package atu.ie;

import java.util.Objects;

public class CustemerClass extends PersonClass {
    private int customerNumber;
    private boolean mailingList;

    //Default Constructor
    public CustemerClass() {
        super();
        this.customerNumber = 0;
        this.mailingList = false;
    }
    //Constructor with initialized parameters
    public CustemerClass(int customerNumber, boolean mailingList) {
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }
    //Calling the parent constructor from PersonClass
    public CustemerClass(String name, String address, String phoneNumber, int customerNumber, boolean mailingList) {
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "person=" + super.toString() +
                ", customerNumber=" + customerNumber +
                ", mailingList=" + mailingList +
                '}';
    }
}
