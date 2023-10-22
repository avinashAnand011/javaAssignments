package com.infy.SuperKeyword;

public class ShowYourTalentRegistration {
    public static void main(String[] args) {
        EventRegistration participant1 = new SingleEventRegistration("jenny","Sing&Win", 1);
        participant1.registerEvent();
        System.out.println(participant1);
        EventRegistration team1 = new TeamEventRegistration("Aura", "ShakeALeg", 5,1);
        team1.registerEvent();
        System.out.println(team1);
        EventRegistration participant2 = new SingleEventRegistration("hudson", "PlayAway", 2);
        participant2.registerEvent();
        System.out.println(participant2);
    }
}
