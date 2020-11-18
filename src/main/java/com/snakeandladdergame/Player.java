package com.snakeandladdergame;

public class Player{
	
   private int playerPossition=0;
   
   private SnakeAndLadder snakeAndLadder;
   
   public Player(SnakeAndLadder snakeAndLadder)
   {
	   this.snakeAndLadder = snakeAndLadder;
	   
   }
   
   public int getDiceNumber() {
	   return this.snakeAndLadder.getDiceNumber();
   }
   
}
