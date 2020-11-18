package com.snakeandladdergame;


public class SnakeAndLadder 
{   
	private static int WINNING_POSITION=100;
	
    public int getDiceNumber() {
    	
    	return (int)Math.round((Math.random()*5)+1);
    	
    }
    
    public String getNextPositionStatus(){
    	
    	int nextStatus = (int)Math.round(Math.random()*10);
    	
    	if (nextStatus >= 1 && nextStatus < 5)
    		return "ladder";
    	else if(nextStatus >= 5 && nextStatus < 8)
    		return "snake";
    	else
    		return "noPlay";
    }
    
    public int getWinningPosition() {
    	return WINNING_POSITION;
    }
}
