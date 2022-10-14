package com.broidgelabz;

public class snakeAndLadder {
    public static void main(String[] args) {
        System.out.println("----------------Welcome to Snake and Ladder Problem-----------------");
        int startPosition = 0, position = 0,WINNING_POSTION=100;

        while (position < WINNING_POSTION) {

            System.out.println("Start position is: " + startPosition);
            int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("Dice Number is : " + diceNumber);

            int option = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println("Player option is : " + option);

            switch (option) {
                case 1:
                    position = diceNumber + position;
                    System.out.println("Ladder");
                    System.out.println("Position for the player after the ladder is : " + position);
                    break;

                case 2:
                    if (position - diceNumber <= 0)
                        position = 0;
                    else
                        position = position - diceNumber;
                    System.out.println("Snack");
                    System.out.println("Position for the player after the Snake is : " + position);
                    break;
                default:
                    System.out.println("No play");
            }
        }
    }
}