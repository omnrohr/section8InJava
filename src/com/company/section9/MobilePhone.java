package com.company.section9;

public class MobilePhone implements ITelephone{
    private boolean isRinging;
    private int myNumber;
    private boolean isOn=false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn=true;
        System.out.println("Mobile phone is starting on.");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn)
        System.out.println("its ringing " + phoneNumber + " on mobile phone");
        else System.out.println("the phone is off.");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("answering the mobile phone.");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber==myNumber&& isOn){
            isRinging=true;
            System.out.println("Ringing ring");
        }else {
            System.out.println("the phone is switched off");
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
