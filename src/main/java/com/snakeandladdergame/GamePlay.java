package com.snakeandladdergame;

public class GamePlay {
	
	public int RepeatOnCondition(int playerNumber ,int playerPosition,  int[] NumberOfTimesDiceRolled, int WINNING_POSITION, Player... player) {
		
		int diceNumber = player[playerNumber].getDiceNumber(); 
        String nextStatus = player[playerNumber].getNextPositionStatus();
    	
        NumberOfTimesDiceRolled[playerNumber]++;
        
        playerPosition = player[playerNumber].getPlayerPosition();
        
        if(playerPosition >= WINNING_POSITION)
        	return playerPosition;
        
    	
        if(nextStatus.equals("ladder")) {
        	playerPosition = playerPosition + diceNumber;
        	
        	if(playerPosition <= 100)
        		player[playerNumber].setPlayerPosition(playerPosition);
        	
        	playerPosition = player[playerNumber].getPlayerPosition();
        	
        	System.out.println("Current position of player " + playerNumber + " : " + playerPosition);
        	
            this.RepeatOnCondition(playerNumber, playerPosition, NumberOfTimesDiceRolled, WINNING_POSITION, player);
        }
        
        
        else if(nextStatus.equals("snake")) {
        	
        	playerPosition = playerPosition - diceNumber;
        	
        	if(playerPosition < 0)
        		player[playerNumber].setPlayerPosition(0);
        	else
        		player[playerNumber].setPlayerPosition(playerPosition);
        	playerPosition = player[playerNumber].getPlayerPosition();
        	System.out.println("Current position of player " + playerNumber + " : " + playerPosition);
        }
        
        else {
        	player[playerNumber].setPlayerPosition(playerPosition);
        	playerPosition = player[playerNumber].getPlayerPosition();
        	System.out.println("Current position of player " + playerNumber + " : " + playerPosition);
        }
        
        
        playerPosition = player[playerNumber].getPlayerPosition();
           
        return playerPosition;
        
	}
	
	
	public void gamePlay(SnakeAndLadder snakeLadderObj, Player... player) {
		
        int WINNING_POSITION = snakeLadderObj.getWinningPosition();
        int playerPosition = 0;
        int NumberOfTimesDiceRolled[] = new int[player.length] ;
        int playerNumber=0;
        int winnerPlayer=0;
        
        
        while( playerPosition < WINNING_POSITION && playerNumber <= player.length) {
        	try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}   	
        	
        	playerPosition = this.RepeatOnCondition(playerNumber, playerPosition,  NumberOfTimesDiceRolled, WINNING_POSITION,  player);
        	
            winnerPlayer=playerNumber;
            
            playerNumber++;
            
            if(playerNumber>=player.length)
            	playerNumber=0;
        }
        System.out.println("Winner is player " + winnerPlayer);
        System.out.println("Number of time the dice is rolled to win the game is: " + NumberOfTimesDiceRolled[winnerPlayer]);
        
		
	}
	
	public static void main( String[] args )
    {
		SnakeAndLadder snakeLadderObj = new SnakeAndLadder();
        Player p1 = new Player(snakeLadderObj);
        Player p2 = new Player(snakeLadderObj);
        
        
        GamePlay gamePlayObj = new GamePlay();
        
        gamePlayObj.gamePlay(snakeLadderObj, p1, p2);
        
        
        
    }
}
