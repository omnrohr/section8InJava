package com.company.section9;

public class Main {
    public static void main(String[] args) {
        ITelephone myPhone= new DeskPhone(12345678);
        myPhone.powerOn();
        myPhone.callPhone(12345678);
        myPhone.answer();
    }
}
