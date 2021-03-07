package Connectfour.connectfourgame;

public class Board1 extends Connect4{
	
	public static void display(char[][] grid){
		System.out.println(" 0 1 2 3 4 5 6");
		System.out.println("---------------");
		for (int row = 0; row < grid.length; row++){
			System.out.print("|");
			for (int col = 0; col < grid[0].length; col++){
				System.out.print(grid[row][col]);
				System.out.print("|");
			}
			System.out.println();
			System.out.println("---------------");
		}
		System.out.println(" 0 1 2 3 4 5 6");
		System.out.println();
	}
	
	public static boolean validate(int column, char[][] grid){
		//valid column?
		if (column < 0 || column > grid[0].length){
			return false;
		}
		
		//full column?
		if (grid[0][column] != ' '){
			return false;
		}
		
		return true;
	}
	
	public static boolean isWinner(char player, char[][] grid){
		//check for 4 across
		for(int row = 0; row<grid.length; row++){
			for (int col = 0;col < grid[0].length - 3;col++){
				if (grid[row][col] == player   && 
					grid[row][col+1] == player &&
					grid[row][col+2] == player &&
					grid[row][col+3] == player){
					return true;
				}
			}			
		}
		//check for 4 up and down
		for(int row = 0; row < grid.length - 3; row++){
			for(int col = 0; col < grid[0].length; col++){
				if (grid[row][col] == player   && 
					grid[row+1][col] == player &&
					grid[row+2][col] == player &&
					grid[row+3][col] == player){
					return true;
				}
			}
		}
		//check upward diagonal
		for(int row = 3; row < grid.length; row++){
			for(int col = 0; col < grid[0].length - 3; col++){
				if (grid[row][col] == player   && 
					grid[row-1][col+1] == player &&
					grid[row-2][col+2] == player &&
					grid[row-3][col+3] == player){
					return true;
				}
			}
		}
		//check downward diagonal
		for(int row = 0; row < grid.length - 3; row++){
			for(int col = 0; col < grid[0].length - 3; col++){
				if (grid[row][col] == player   && 
					grid[row+1][col+1] == player &&
					grid[row+2][col+2] == player &&
					grid[row+3][col+3] == player){
					return true;
				}
			}
		}
		return false;
	}

}
