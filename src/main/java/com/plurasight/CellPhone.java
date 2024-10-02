package com.plurasight;

public class CellPhone {

    private int serialNumber;
    private String model;
    private String carrier;
    private String  phoneNumber;
    private String owner;

    // Constructor
    public CellPhone (){
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    // Getters
    public int getSerialNumber(){
        return this.serialNumber;
    }
    public String getModel(){
        return this.model;
    }
    public String getCarrier(){
        return this.carrier;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String getOwner(){
        return this.owner;
    }

    // Setters
    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }

    public void dial(String phoneNumber){
        System.out.printf("%s's phone is calling %s. \n",this.owner, this.phoneNumber);
    }

}
