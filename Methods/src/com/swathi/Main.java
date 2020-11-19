package com.swathi;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 500;
	    int bonus = 100;

	    int highScore = calculateScore(gameOver,score,bonus);
        System.out.println("your final score is " + highScore);
 
        displayHighScorePosition("Jack", calculateHighScorePosition(1000));
        displayHighScorePosition("Diya", calculateHighScorePosition(500));
        displayHighScorePosition("Rose", calculateHighScorePosition(400));
        displayHighScorePosition("Adam", calculateHighScorePosition(10));
    }
    public static int calculateScore(boolean gameOver, int score, int bonus){
        if(gameOver) {
            int finalScore = score + bonus;
            return finalScore;
        }else{

            return (-1);
        }
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " manage to get into position "+"'"+ position +"'"+" on the high score table.");
    }
    public static int calculateHighScorePosition(int score){
        if(score>=1000){
            return 1;
        }else if(score>=500){
            return 2;
        }else if(score>=100){
            return 3;
        }
           return 4;
    }
}
