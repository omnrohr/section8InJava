package com.company.phone;

public class Main {
    public static void main(String args[]){
        var deskPhone = new DeskPhone();
        deskPhone.setMyNumber(555555);
        deskPhone.setColor("white");
        deskPhone.setMute();
        deskPhone.callPhone(5000000);
        deskPhone.callPhone(555555);
        deskPhone.Dial(5656565);
        deskPhone.PowerOn();
        deskPhone.setMute();
        deskPhone.callPhone(555555);


    }
}
