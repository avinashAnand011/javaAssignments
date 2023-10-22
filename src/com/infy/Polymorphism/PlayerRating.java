package com.infy.Polymorphism;

import javax.management.AttributeValueExp;

public class PlayerRating {
    public int playerPosition;
    public String playerName;

    public  float criticoneRating;



    public float criticTwoRating;
    public float criticThreeRating;
    public  float averageRating;
    public char category;


    public PlayerRating(){

    }
    public PlayerRating(int playerPosition, String playerName) {
        this.playerPosition = playerPosition;
        this.playerName = playerName;
    }

    public void calculateAverageRating(float criticoneRating , float criticTwoRating){
        averageRating = (criticoneRating+criticTwoRating)/2;
    }

    public void calculateAverageRating( float criticOneRating , float criticTwoRating , float criticThreeRating ){
        averageRating = (criticoneRating+criticTwoRating + criticThreeRating)/3;
    }

    public void calculateCategory(){

        if (averageRating>8){
                category ='A';
        }else if(averageRating>5 && averageRating<= 8){
            category ='B';
        }else if(averageRating>0 && averageRating<= 5)
        {
            category ='C';
        }
        else {
            System.out.println("No rating availabe");
        }

    }

    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "PlayerRating{" +
                "playerPosition=" + playerPosition +
                ", playerName='" + playerName + '\'' +

                ", averageRating=" + averageRating +
                ", category=" + category +
                '}';
    }
}
