package com.infy.Polymorphism;

public class PlayerRatingTester {
    public static void main(String[] args) {
        PlayerRating playerRating = new PlayerRating(2, "ramesh");
        playerRating.calculateAverageRating(9.0f,9.9f);
        playerRating.calculateCategory();
        playerRating.display();
        playerRating.calculateAverageRating(8.0f,8.8f,7.6f);
        playerRating.calculateCategory();
        playerRating.display();

    }
}
