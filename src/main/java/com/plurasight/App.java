package com.plurasight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        CellPhone cellPhone = new CellPhone();

        // User input
        System.out.print("What is the serial number?");
        int serialNumber = Integer.parseInt(keyboard.nextLine());
        System.out.print("What model is the phone?");
        String model = keyboard.nextLine();
        System.out.print("Who is the carrier?");
        String carrier = keyboard.nextLine();
        System.out.print("What is the phone number?");
        String phoneNumber = keyboard.nextLine();
        System.out.print("Who is the owner of the phone?");
        String owner = keyboard.nextLine();

        //update values using CellPhone Class setter methods
        cellPhone.setSerialNumber(serialNumber);
        cellPhone.setModel(model);
        cellPhone.setCarrier(carrier);
        cellPhone.setPhoneNumber(phoneNumber);
        cellPhone.setOwner(owner);

        // Display results
        System.out.println("-------------------------");
        System.out.println("Phone details below:");
        System.out.printf("Serial number: %d \n", cellPhone.getSerialNumber());
        System.out.printf("Model: %s \n", cellPhone.getModel());
        System.out.printf("Carrier: %s \n", cellPhone.getCarrier());
        System.out.printf("Phone number: %s \n", cellPhone.getPhoneNumber());
        System.out.printf("Owner: %s", cellPhone.getOwner());



    }
}
