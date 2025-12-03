package atu.ie;
//I'm constructing Customer objects in 2 different ways
//1 all values at once via the constructor
//2 Step by step via setters
//In both cases, the Person part is still initialised because of inheritance and super

public class CustomerTest {

    public static void main(String[] args) {
        //Creating a parameterized constructor
        PersonClass person = new PersonClass( "José", "Galway" ,"1234");
        System.out.println(person);

        CustomerClass part1Customer = new CustomerClass(
                "José",
                "Galway" ,"1234",
                5678,
                true
        );

        System.out.println(part1Customer);

        //No-argument constructor. Using setters to assign values
        CustomerClass part2Customer = new CustomerClass();
        part2Customer.setName("Bob Jones");
        part2Customer.setAddress("2 Low Street");
        part2Customer.setPhoneNumber("0867654321");
        part2Customer.setCustomerNumber(1002);
        part2Customer.setMailingList(false);

        System.out.println(part2Customer);
    }
}