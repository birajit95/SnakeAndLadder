package com.snakeandladdergame;


public class SnakeAndLadder 
{   
	
	
    public int getDiceNumber() {
    	
    	return (int)Math.round((Math.random()*5)+1);
    	
    }
    
    public String getNextPositionStatus(){
    	
    	int nextStatus = (int)Math.round((Math.random()*2)+1);
    	
    	if (nextStatus==1)
    		return "ladder";
    	else if(nextStatus==2)
    		return "snake";
    	else
    		return "noPlay";
    }
}
