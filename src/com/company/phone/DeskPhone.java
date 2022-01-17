package com.company.phone;

public class DeskPhone implements IPhone{
    private int myNumber=555555;
    private String color;
    private int local;
    private boolean isRinging=false;
    private boolean isMute=false;

    public void setMyNumber(int number){
        myNumber=number;
        System.out.println("your number set to "+myNumber);
    }
    public void setColor(String color){
        this.color = color;
        System.out.println("Telephone color set to: "+ this.color);
    }
    public void setMute(){
        if (isMute) isMute=false;
        else isMute=true;
        String status = isMute ? "Mute":"unMute";
        System.out.println("the phone status is :" + status);
    }

    @Override
    public void PowerOn() {
        System.out.println("Invalid method..");
    }

    @Override
    public void Dial(int phoneNumber) {
        System.out.println("dialing number " + phoneNumber + ".....");
    }

    @Override
    public void Answer() {
        if (isRinging){
            System.out.println("Sound is on \n Answering the phone");
            isRinging=false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if ((phoneNumber == myNumber)&&!isMute){
            System.out.println("Ring Ring....");
            isRinging=true;
        }else if (phoneNumber != myNumber)  {
            System.out.println("the call is not to me");
            isRinging=false;
        }else if (phoneNumber==myNumber && isMute) {
            isRinging = true;
            System.out.println("vibration..vibration");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {

        return isRinging;
    }

}
