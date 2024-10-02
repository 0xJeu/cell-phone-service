package com.plurasight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone( );

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

        //Update values using CellPhone Class setter methods for cellPhone1
        cellPhone1.setSerialNumber(serialNumber);
        cellPhone1.setModel(model);
        cellPhone1.setCarrier(carrier);
        cellPhone1.setPhoneNumber(phoneNumber);
        cellPhone1.setOwner(owner);

        System.out.println("------Phone 2 below--------");
        System.out.print("What is the serial number?");
        cellPhone2.setSerialNumber(Integer.parseInt(keyboard.nextLine()));
        System.out.print("What model is the phone?");
        cellPhone2.setModel(keyboard.nextLine());
        System.out.print("Who is the carrier?");
        cellPhone2.setCarrier(keyboard.nextLine());
        System.out.print("What is the phone number?");
        cellPhone2.setPhoneNumber(keyboard.nextLine());
        System.out.print("Who is the owner of the phone?");
        cellPhone2.setOwner(keyboard.nextLine());

        display(cellPhone1);
        display(cellPhone2);

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());

    }

    public static void display(CellPhone phone){
        System.out.println("-------------------------");
        System.out.println("Phone details below:");
        System.out.printf("Serial number: %d \n", phone.getSerialNumber());
        System.out.printf("Model: %s \n", phone.getModel());
        System.out.printf("Carrier: %s \n", phone.getCarrier());
        System.out.printf("Phone number: %s \n", phone.getPhoneNumber());
        System.out.printf("Owner: %s \n", phone.getOwner());
    }
}
