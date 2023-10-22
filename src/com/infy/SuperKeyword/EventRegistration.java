package com.infy.SuperKeyword;

public class EventRegistration {
    private String name;
    private String nameOfEvent;
    private double registrationFee;

    public EventRegistration() {
    }

    public EventRegistration(String name, String nameOfEvent) {
        this.name = name;
        this.nameOfEvent = nameOfEvent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfEvent() {
        return nameOfEvent;
    }

    public void setNameOfEvent(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }

    public double getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }

    public void registerEvent(){
         int baseFee = 0;
        if (getNameOfEvent().equals("ShakeALeg")){
            baseFee=100;
        }else if(getNameOfEvent().equals("Sing&Win)")){
            baseFee=150;
        }else if (getNameOfEvent().equals("Acathon")){
            baseFee=70;
        }else if (getNameOfEvent().equals("PlayAway")){
            baseFee=130;
        }else{
            System.out.println("Please give correct event name");
        }

    }

    @Override
    public String toString() {
        return "EventRegistration{" +
                "name='" + name + '\'' +
                ", nameOfEvent='" + nameOfEvent + '\'' +
                ", registrationFee=" + registrationFee +
                '}';
    }
}
