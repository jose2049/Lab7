package atu.ie;

import java.util.Objects;

/*Creating a class PreferredCustomerClass that extends CustomerClass
loyaltyPoints represent the total points earned
discountLevel represents the discount as a fraction
*/
/* PreferredCustomer is now a specialised type of customer. It reuses all the Customer and Person fields and adds
only what's unique: loyalty points and discount. */
public class PreferredCustomerClass extends CustomerClass {
    private int loyaltyPoints;
    private double discountLevel;

    //Private helper method to PreferredCustomer
    //Here I implement discountLevel based on loyaltyPoints
    private void updateDiscountLevel() {
        if (loyaltyPoints < 500) {
            discountLevel = 0;
        } else if (loyaltyPoints <= 999) {
            discountLevel = 0.05;
        } else if (loyaltyPoints <= 1499) {
            discountLevel = 0.06;
        } else if (loyaltyPoints <= 1999) {
            discountLevel = 0.07;
        } else {
            discountLevel = 0.10;
        }
    }

    //Adding a parameterized constructor that accepts all relevant data from CustomerClass
    public PreferredCustomerClass(String name, String address, String phoneNumber, int customerNumber, boolean mailingList, int loyaltyPoints, double discountLevel) {
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        //ensure correct discount when object is created by checking the range
        updateDiscountLevel();
    }

    //No-argument constructor
    public PreferredCustomerClass() {
        super();
        this.loyaltyPoints = 0;
        this.discountLevel = 0;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
        updateDiscountLevel();
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    private void setDiscountLevel(double discountLevel) {
        this.discountLevel = discountLevel;
    }

    //Public Method
    public void addLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
        updateDiscountLevel();
    }

    @Override
    public String toString() {
        return "PreferredCustomer{" +
                "customer=" + super.toString() +
                ", loyaltyPoints=" + loyaltyPoints +
                ", discountLevel=" + discountLevel +
                '}';


    }
}


