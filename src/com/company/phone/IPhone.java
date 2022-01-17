package com.company.phone;

import java.util.ArrayList;

public interface IPhone {
    void PowerOn();
    void Dial(int phoneNumber);
    void Answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
