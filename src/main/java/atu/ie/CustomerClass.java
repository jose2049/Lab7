package atu.ie;

public class CustomerClass extends PersonClass {
    private int customerNumber;
    private boolean mailingList;

    //Parameterized constructor from PersonClass
    public CustomerClass(String name, String address, String phoneNumber, int customerNumber, boolean mailingList) {
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }
    //Parameterized constructor for CustomerClass + calling the parent constructor using super
    public CustomerClass(int customerNumber, boolean mailingList) {
        super();
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }
    //No argument constructor
    public CustomerClass() {
        super();
        this.customerNumber = 0;
        this.mailingList = false;
    }

    //setting sets and getters
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

    //Returning a readable representation
    @Override
    public String toString() {
        return "Customer{" +
                "person=" + super.toString() +
                ", customerNumber=" + customerNumber +
                ", mailingList=" + mailingList +
                '}';
    }
}
