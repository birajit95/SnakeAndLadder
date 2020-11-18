package com.snakeandladdergame;

public class GamePlay {
	
	public static void main( String[] args )
    {
		SnakeAndLadder snakeLadderObj = new SnakeAndLadder();
        Player p1 = new Player(snakeLadderObj);
        
        int diceNumber = p1.getDiceNumber();
        System.out.println(diceNumber);
        
        String nextStatus = p1.getNextPositionStatus();
        System.out.print(nextStatus);
    }
}
