package com.infy.SuperKeyword;

public class TeamEventRegistration extends EventRegistration{
    private int noOfParticipants;
    private int teamNo;

    public TeamEventRegistration(String name, String nameOfEvent, int noOfParticipants, int teamNo) {
        super(name, nameOfEvent);
        this.noOfParticipants = noOfParticipants;
        this.teamNo = teamNo;
    }

    public int getNoOfParticipants() {
        return noOfParticipants;
    }

    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }

    public int getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }
    int baseFee = 0;
    public void registerEvent(){
        //int baseFee = 0;
        if (getNameOfEvent().equals("ShakeALeg")){
            baseFee=50;
        }else if(getNameOfEvent().equals("Sing&Win)")){
            baseFee=60;
        }else if (getNameOfEvent().equals("PlayAway")){
            baseFee=80;
        }else if (getNameOfEvent().equals("PlayAway")) {
            baseFee=100;
        }else {
            System.out.println("please enter valid event");
        }
        int temp = 0;
        temp = baseFee * noOfParticipants;
        setRegistrationFee(temp);
        }

    @Override
    public String toString() {
        return "TeamEventRegistration{" +
                "noOfParticipants=" + noOfParticipants +
                ", teamNo=" + teamNo +
                ", baseFee=" + baseFee +
                '}';
    }
}


