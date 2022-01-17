package com.company.phone;

public class Mobile implements IPhone {
    private int myNumber;
    private boolean isRing=false;

    public void setMyNumber(int myNumber){
        this.myNumber = myNumber;
        System.out.println("your number set to: "+ this.myNumber);
    }

    @Override
    public void PowerOn() {
        System.out.println("Mobile is on.");
    }

    @Override
    public void Dial(int phoneNumber) {
        System.out.println("Diling "+phoneNumber+"....");
    }

    @Override
    public void Answer() {
        if (isRing) {System.out.println("Answering call..");
        isRing=false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRing=true;
            System.out.println("Ringing.....");
        }else isRing=false;
        return isRing;
    }

    @Override
    public boolean isRinging() {
        return isRing;
    }
}
