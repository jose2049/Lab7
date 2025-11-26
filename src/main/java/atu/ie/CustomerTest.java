package atu.ie;

import java.util.Scanner;

public class CustomerTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PersonClass person = new PersonClass( "José", "Galway" ,"1234");
        System.out.println(person);

        CustemerClass customer = new CustemerClass("José", "Galway" ,"1234",5678, true);
        System.out.println(customer);


        CustemerClass part1Customer = new CustemerClass(
                "Alice Smith",
                "1 High Street",
                "0851234567",
                1001,
                true
        );

        CustemerClass part2Customer = new CustemerClass();
        part2Customer.setName("Bob Jones");
        part2Customer.setAddress("2 Low Street");
        part2Customer.setPhoneNumber("0867654321");
        part2Customer.setCustomerNumber(1002);
        part2Customer.setMailingList(false);

    }

}