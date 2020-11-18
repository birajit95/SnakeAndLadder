package com.snakeandladdergame;

public class Player{
		
   private int playerPosition=0;
   
   private SnakeAndLadder snakeAndLadder;
   
   public Player(SnakeAndLadder snakeAndLadder)
   {
	   this.snakeAndLadder = snakeAndLadder;
	   
   }
   
   public int getDiceNumber() {
	   return this.snakeAndLadder.getDiceNumber();
   }
   
   public String getNextPositionStatus() {
	   return this.snakeAndLadder.getNextPositionStatus();
   }
   
   public void setPlayerPosition(int newPosition) {
	   this.playerPosition = newPosition;
   }
   
   public int getPlayerPosition() {
	   return this.playerPosition;
   }
   
   
}
