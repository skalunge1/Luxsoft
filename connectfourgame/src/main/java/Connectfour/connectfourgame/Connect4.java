package Connectfour.connectfourgame;
import java.util.Scanner;

public class Connect4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		char[][] grid = new char[6][7];  //Establishing a playing board
		
		//initialize array to create grid
		for (int row = 0; row < grid.length; row++){
			for (int col = 0; col < grid[0].length; col++){
				grid[row][col] = ' ';
			}
		}
		
		int turn = 1;
		char player = 'R';
		boolean winner = false;		
		
		//play a turn
		while (winner == false && turn <= 42){
			boolean validPlay;
			int play;
			do {
				Board1.display(grid);
				
				System.out.print("Player " + player + ", choose a column: ");
				play = in.nextInt();
				
				//validate play
				validPlay = Board1.validate(play,grid);
				
			}while (validPlay == false);
			
			//drop the checker
			for (int row = grid.length-1; row >= 0; row--){
				if(grid[row][play] == ' '){
					grid[row][play] = player;
					break;
				}
			}
			
			//determine if there is a winner
			winner = Board1.isWinner(player,grid);
			
			//switch players
			if (player == 'R'){
				player = 'Y';
			}else{
				player = 'R';
			}
			
			turn++;			
		}
		Board1.display(grid);
		
		if (winner){
			if (player=='R'){
				System.out.println("Yellow won");
			}else{
				System.out.println("Red won");
			}
		}else{
			System.out.println("Tie game");
		}
		
	}
	
}