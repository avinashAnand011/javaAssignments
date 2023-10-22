package com.infy.SuperKeyword;

public class SingleEventRegistration extends EventRegistration {
    private int participateNo;

    public SingleEventRegistration(String name, String nameOfEvent, int participateNo) {
        super(name, nameOfEvent);
        this.participateNo = participateNo;
    }

    public int getParticipateNo() {
        return participateNo;
    }

    public void setParticipateNo(int participateNo) {
        this.participateNo = participateNo;
    }

    public void registerEvent(){
        int baseFee = 0;
        if (getNameOfEvent().equals("ShakeALeg")){
            baseFee=100;
        }else if(getNameOfEvent().equals("Sing&Win)")){
            baseFee=150;
        }else if (getNameOfEvent().equals("PlayAway")){
            baseFee=130;
        }else {
            System.out.println("please enter valid event");
        }
    }

    @Override
    public String toString() {
        return "SingleEventRegistration{" +
                "participateNo=" + participateNo +
                '}';
    }
}
