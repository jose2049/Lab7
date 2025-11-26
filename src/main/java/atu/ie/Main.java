package atu.ie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PersonClass person = new PersonClass( "José", "Galway" ,"1234");
        System.out.println(person);

        CustemerClass customer = new CustemerClass("José", "Galway" ,"1234",5678, true);
        System.out.println(customer);


    }

}