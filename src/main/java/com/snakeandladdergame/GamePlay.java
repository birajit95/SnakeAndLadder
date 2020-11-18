package com.snakeandladdergame;

public class GamePlay {
	
	public void gamePlay(SnakeAndLadder snakeLadderObj, Player p1) {
		
        int WINNING_POSITION = snakeLadderObj.getWinningPosition();
        
        int playerPosition = p1.getPlayerPosition();
        
        while( playerPosition < WINNING_POSITION ) {
        	
        	int diceNumber = p1.getDiceNumber();
            String nextStatus = p1.getNextPositionStatus();
            
            if(nextStatus.equals("ladder")) {
            	
            	playerPosition = playerPosition + diceNumber;
            	p1.setPlayerPosition(playerPosition);
            }
            
            else if(nextStatus.equals("snake")) {
            	
            	playerPosition = playerPosition - diceNumber;
            	
            	if(playerPosition<0)
                	p1.setPlayerPosition(0);
            	else
            	    p1.setPlayerPosition(playerPosition);
            }
            
            
            else {
            	p1.setPlayerPosition(playerPosition);
            }
            
            
            playerPosition = p1.getPlayerPosition();
            
            System.out.println(playerPosition);
        }
		
	}
	
	public static void main( String[] args )
    {
		SnakeAndLadder snakeLadderObj = new SnakeAndLadder();
        Player p1 = new Player(snakeLadderObj);
        
        GamePlay gamePlayObj = new GamePlay();
        
        gamePlayObj.gamePlay(snakeLadderObj, p1);
        
        
        
    }
}
