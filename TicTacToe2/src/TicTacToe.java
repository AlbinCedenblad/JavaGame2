import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	
	static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

	public static void main(String[] args) {
		char [][] gameBoard = {
				{' ','|',' ','|',' ','|',' ','|',' '}, 
				{'-','+','-','+','-','+','-','+','-'},
				{' ','|',' ','|',' ','|',' ','|',' '},
				{'-','+','-','+','-','+','-','+','-'},
				{' ','|',' ','|',' ','|',' ','|',' '},
				{'-','+','-','+','-','+','-','+','-'},
				{' ','|',' ','|',' ','|',' ','|',' '},
				{'-','+','-','+','-','+','-','+','-'},
				{' ','|',' ','|',' ','|',' ','|',' '}};
		
		
		System.out.println("level 1 - 3");
		Scanner scan = new Scanner(System.in);
		int game = scan.nextInt(); 
		while (game > 3 || game < 0 ) {
			System.out.println("you can pic 1 - 3, try again");
			game = scan.nextInt();
		}
		
		switch(game){
		
		//ez
		case 1:
			printGameBoard(gameBoard);
			
			while(true) {
			
			System.out.println("Enter your placement 1-25:");
			int playerPos = scan.nextInt();
			while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)){
				System.out.println("Position taken");
				playerPos = scan.nextInt();
			}
			
			winCon WinCon = new winCon();
			String result = WinCon.checkWinner();
			if(result.length() > 0) {
				System.out.println(result);
				break;
			}
			
			
			placePiece(gameBoard, playerPos, "player");
			
			//cpu lvl 1
			Random rand = new Random();
			int cpuPos = rand.nextInt(25) + 1;
			
		
			
			while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)){
				cpuPos = rand.nextInt(25) + 1;
				
			}
			
			placePiece(gameBoard, cpuPos, "cpu");
			
			printGameBoard(gameBoard);
		
			
			 result = WinCon.checkWinner();
			if(result.length() > 0) {
				System.out.println(result);
				break;
			}
			


		}
			break;
			
			//normal
		case 2:
			
			
			printGameBoard(gameBoard);
			
			while(true) {
			
			System.out.println("Enter your placement 1-25:");
			int playerPos = scan.nextInt();
			
			while (playerPos > 25 || playerPos < 1 ) {
				System.out.println("you can pic 1 - 25, try again");
				playerPos = scan.nextInt();
			} 
			
			
			while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)){
				System.out.println("Position taken");
				playerPos = scan.nextInt();
			}
			
			winCon WinCon = new winCon();
			String result = WinCon.checkWinner();
			if(result.length() > 0) {
				System.out.println(result);
				break;
			}
			
			
			placePiece(gameBoard, playerPos, "player");
			
			//CPU lvl2
			
			Random rand = new Random();
			int cpuPos = rand.nextInt(25) + 1;
			
		
			if (playerPos == 1 || playerPos == 2 || playerPos == 3) {
				cpuPos = rand.nextInt(8 - 1) + 1;
				while (cpuPos == 5) {
					cpuPos = rand.nextInt(8 - 1) + 1;
				}
			}
			
			if (playerPos == 3 || playerPos == 4 || playerPos == 5) {
				cpuPos = rand.nextInt(10 - 1) + 1;
				while  (cpuPos == 1 || cpuPos == 6 || cpuPos == 7) {
					cpuPos = rand.nextInt(10 - 1) + 1;
				}
			}
			
			
		    if (playerPos == 6 || playerPos == 7 || playerPos == 8 ) {
				cpuPos = rand.nextInt(15 - 1) + 1;
				while  (cpuPos == 4 || cpuPos == 5 || cpuPos == 15 || cpuPos == 14 || cpuPos == 10) {
					cpuPos = rand.nextInt(15 - 1) + 1;
				}
			}
		    
		    if ( playerPos == 8 || playerPos == 9 || playerPos == 10) {
				cpuPos = rand.nextInt(15 - 1) + 1;
				while  (cpuPos == 1 || cpuPos == 6 || cpuPos == 11 || cpuPos == 2 || cpuPos == 12) {
					cpuPos = rand.nextInt(15 - 1) + 1;
				}
			}
			
			
		    if (playerPos == 11 || playerPos == 12|| playerPos == 13 ) {
				cpuPos = rand.nextInt(20 - 6) + 6;
				while  (cpuPos == 9 || cpuPos == 19 || cpuPos == 20 || cpuPos == 10 || cpuPos == 15) {
					cpuPos = rand.nextInt(20 - 6) + 6;
				}
		    }
		    if (playerPos == 13 || playerPos == 14 || playerPos == 15) {
				cpuPos = rand.nextInt(20 - 6) + 6;
				while  (cpuPos == 11 || cpuPos == 6 || cpuPos == 7 || cpuPos == 17 || cpuPos == 16) {
					cpuPos = rand.nextInt(20 - 6) + 6;
				}
			}
			
			if (playerPos == 16 || playerPos == 17 || playerPos == 18 ) {
				cpuPos = rand.nextInt(25 - 11) + 11;
				while  (cpuPos == 20 || cpuPos == 25 || cpuPos == 24 || cpuPos == 15 || cpuPos == 14) {
					cpuPos = rand.nextInt(25 - 11) + 11;
				}
			}
			if ( playerPos == 18 || playerPos == 19 || playerPos == 20) {
				cpuPos = rand.nextInt(25 - 11) + 11;
				while  (cpuPos == 16 || cpuPos == 11 || cpuPos == 12 || cpuPos == 21 || cpuPos == 22) {
					cpuPos = rand.nextInt(25 - 11) + 11;
				}
			}
			
			
			if (playerPos == 21 || playerPos == 22 || playerPos == 23) {
				cpuPos = rand.nextInt(25 - 16) + 16;
				while  (cpuPos == 25 || cpuPos == 20 || cpuPos == 19) {
					cpuPos = rand.nextInt(25 - 16) + 16;
				}
			}
			if (playerPos == 23 || playerPos == 24 || playerPos == 25) {
				cpuPos = rand.nextInt(25 - 16) + 16;
				while  (cpuPos == 21 || cpuPos == 16 || cpuPos == 17 ) {
					cpuPos = rand.nextInt(25 - 16) + 16;
				}
			}
			
			
			
			while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)){
				
				
				if (playerPos == 1 || playerPos == 2 || playerPos == 3) {
					cpuPos = rand.nextInt(8 - 1) + 1;
					while (cpuPos == 5) {
						cpuPos = rand.nextInt(8 - 1) + 1;
					}
				}
				
				if (playerPos == 3 || playerPos == 4 || playerPos == 5) {
					cpuPos = rand.nextInt(10 - 1) + 1;
					while  (cpuPos == 1 || cpuPos == 6 || cpuPos == 7) {
						cpuPos = rand.nextInt(10 - 1) + 1;
					}
				}
				
				
			    if (playerPos == 6 || playerPos == 7 || playerPos == 8 ) {
					cpuPos = rand.nextInt(15 - 1) + 1;
					while  (cpuPos == 4 || cpuPos == 5 || cpuPos == 15 || cpuPos == 14 || cpuPos == 10) {
						cpuPos = rand.nextInt(15 - 1) + 1;
					}
				}
			    
			    if ( playerPos == 8 || playerPos == 9 || playerPos == 10) {
					cpuPos = rand.nextInt(15 - 1) + 1;
					while  (cpuPos == 1 || cpuPos == 6 || cpuPos == 11 || cpuPos == 2 || cpuPos == 12) {
						cpuPos = rand.nextInt(15 - 1) + 1;
					}
				}
				
				
			    if (playerPos == 11 || playerPos == 12|| playerPos == 13 ) {
					cpuPos = rand.nextInt(20 - 6) + 6;
					while  (cpuPos == 9 || cpuPos == 19 || cpuPos == 20 || cpuPos == 10 || cpuPos == 15) {
						cpuPos = rand.nextInt(20 - 6) + 6;
					}
			    }
			    if (playerPos == 13 || playerPos == 14 || playerPos == 15) {
					cpuPos = rand.nextInt(20 - 6) + 6;
					while  (cpuPos == 11 || cpuPos == 6 || cpuPos == 7 || cpuPos == 17 || cpuPos == 16) {
						cpuPos = rand.nextInt(20 - 6) + 6;
					}
				}
				
				if (playerPos == 16 || playerPos == 17 || playerPos == 18 ) {
					cpuPos = rand.nextInt(25 - 11) + 11;
					while  (cpuPos == 20 || cpuPos == 25 || cpuPos == 24 || cpuPos == 15 || cpuPos == 14) {
						cpuPos = rand.nextInt(25 - 11) + 11;
					}
				}
				if ( playerPos == 18 || playerPos == 19 || playerPos == 20) {
					cpuPos = rand.nextInt(25 - 11) + 11;
					while  (cpuPos == 16 || cpuPos == 11 || cpuPos == 12 || cpuPos == 21 || cpuPos == 22) {
						cpuPos = rand.nextInt(25 - 11) + 11;
					}
				}
				
				
				if (playerPos == 21 || playerPos == 22 || playerPos == 23) {
					cpuPos = rand.nextInt(25 - 16) + 16;
					while  (cpuPos == 25 || cpuPos == 20 || cpuPos == 19) {
						cpuPos = rand.nextInt(25 - 16) + 16;
					}
				}
				if (playerPos == 23 || playerPos == 24 || playerPos == 25) {
					cpuPos = rand.nextInt(25 - 16) + 16;
					while  (cpuPos == 21 || cpuPos == 16 || cpuPos == 17 ) {
						cpuPos = rand.nextInt(25 - 16) + 16;
					}
				}
				
			}
			
			placePiece(gameBoard, cpuPos, "cpu");
			
			printGameBoard(gameBoard);
		
			result = WinCon.checkWinner();
			if(result.length() > 0) {
				System.out.println(result);
				break;
			}
			


		}
			
			break;
			
			
			//hard
		case 3:
			
		
			
			printGameBoard(gameBoard);
			
			while(true) {
			
			System.out.println("Enter your placement 1-25:");
			int playerPos = scan.nextInt();
			
			while (playerPos > 25 || playerPos < 1 ) {
				System.out.println("you can pic 1 - 25, try again");
				playerPos = scan.nextInt();
			} 
			
			
			while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)){
				System.out.println("Position taken");
				playerPos = scan.nextInt();
			}
			
			
		
			
			
			
			
			placePiece(gameBoard, playerPos, "player");
			
			winCon WinCon = new winCon();
			String result = WinCon.checkWinner();
			if(result.length() > 0) {
				printGameBoard(gameBoard);
				System.out.println(result);
				break;
			}
			
			//CPU lvl3
			
			Random rand = new Random();
			int cpuPos = rand.nextInt(25) + 1;
			

			
			if (playerPos == 1 || playerPos == 2 || playerPos == 3) {
				cpuPos = rand.nextInt(8 - 1) + 1;
				while (cpuPos == 5) {
					cpuPos = rand.nextInt(8 - 1) + 1;
				}
			}
			
			if (playerPos == 3 || playerPos == 4 || playerPos == 5) {
				cpuPos = rand.nextInt(10 - 1) + 1;
				while  (cpuPos == 1 || cpuPos == 6 || cpuPos == 7) {
					cpuPos = rand.nextInt(10 - 1) + 1;
				}
			}
			
			
		    if (playerPos == 6 || playerPos == 7 || playerPos == 8 ) {
				cpuPos = rand.nextInt(15 - 1) + 1;
				while  (cpuPos == 4 || cpuPos == 5 || cpuPos == 15 || cpuPos == 14 || cpuPos == 10) {
					cpuPos = rand.nextInt(15 - 1) + 1;
				}
			}
		    
		    if ( playerPos == 8 || playerPos == 9 || playerPos == 10) {
				cpuPos = rand.nextInt(15 - 1) + 1;
				while  (cpuPos == 1 || cpuPos == 6 || cpuPos == 11 || cpuPos == 2 || cpuPos == 12) {
					cpuPos = rand.nextInt(15 - 1) + 1;
				}
			}
			
			
		    if (playerPos == 11 || playerPos == 12|| playerPos == 13 ) {
				cpuPos = rand.nextInt(20 - 6) + 6;
				while  (cpuPos == 9 || cpuPos == 19 || cpuPos == 20 || cpuPos == 10 || cpuPos == 15) {
					cpuPos = rand.nextInt(20 - 6) + 6;
				}
		    }
		    if (playerPos == 13 || playerPos == 14 || playerPos == 15) {
				cpuPos = rand.nextInt(20 - 6) + 6;
				while  (cpuPos == 11 || cpuPos == 6 || cpuPos == 7 || cpuPos == 17 || cpuPos == 16) {
					cpuPos = rand.nextInt(20 - 6) + 6;
				}
			}
			
			if (playerPos == 16 || playerPos == 17 || playerPos == 18 ) {
				cpuPos = rand.nextInt(25 - 11) + 11;
				while  (cpuPos == 20 || cpuPos == 25 || cpuPos == 24 || cpuPos == 15 || cpuPos == 14) {
					cpuPos = rand.nextInt(25 - 11) + 11;
				}
			}
			if ( playerPos == 18 || playerPos == 19 || playerPos == 20) {
				cpuPos = rand.nextInt(25 - 11) + 11;
				while  (cpuPos == 16 || cpuPos == 11 || cpuPos == 12 || cpuPos == 21 || cpuPos == 22) {
					cpuPos = rand.nextInt(25 - 11) + 11;
				}
			}
			
			
			if (playerPos == 21 || playerPos == 22 || playerPos == 23) {
				cpuPos = rand.nextInt(25 - 16) + 16;
				while  (cpuPos == 25 || cpuPos == 20 || cpuPos == 19) {
					cpuPos = rand.nextInt(25 - 16) + 16;
				}
			}
			if (playerPos == 23 || playerPos == 24 || playerPos == 25) {
				cpuPos = rand.nextInt(25 - 16) + 16;
				while  (cpuPos == 21 || cpuPos == 16 || cpuPos == 17 ) {
					cpuPos = rand.nextInt(25 - 16) + 16;
				}
			}
			
			win WIN = new win();
			int ChecksWin = WIN.cpuWin();
			
			if(ChecksWin != 0) {
				cpuPos = ChecksWin;
				
				}
			
			stop STOP = new stop();
			int Checkstop = STOP.stopPlayer();
			
			if(Checkstop != 0)  {
				cpuPos = Checkstop;
				}
			
			while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)){
				
				if (playerPos == 1 || playerPos == 2 || playerPos == 3) {
					cpuPos = rand.nextInt(8 - 1) + 1;
					while (cpuPos == 5) {
						cpuPos = rand.nextInt(8 - 1) + 1;
					}
				}
				
				if (playerPos == 3 || playerPos == 4 || playerPos == 5) {
					cpuPos = rand.nextInt(10 - 1) + 1;
					while  (cpuPos == 1 || cpuPos == 6 || cpuPos == 7) {
						cpuPos = rand.nextInt(10 - 1) + 1;
					}
				}
				
				
			    if (playerPos == 6 || playerPos == 7 || playerPos == 8 ) {
					cpuPos = rand.nextInt(15 - 1) + 1;
					while  (cpuPos == 4 || cpuPos == 5 || cpuPos == 15 || cpuPos == 14 || cpuPos == 10) {
						cpuPos = rand.nextInt(15 - 1) + 1;
					}
				}
			    
			    if ( playerPos == 8 || playerPos == 9 || playerPos == 10) {
					cpuPos = rand.nextInt(15 - 1) + 1;
					while  (cpuPos == 1 || cpuPos == 6 || cpuPos == 11 || cpuPos == 2 || cpuPos == 12) {
						cpuPos = rand.nextInt(15 - 1) + 1;
					}
				}
				
				
			    if (playerPos == 11 || playerPos == 12|| playerPos == 13 ) {
					cpuPos = rand.nextInt(20 - 6) + 6;
					while  (cpuPos == 9 || cpuPos == 19 || cpuPos == 20 || cpuPos == 10 || cpuPos == 15) {
						cpuPos = rand.nextInt(20 - 6) + 6;
					}
			    }
			    if (playerPos == 13 || playerPos == 14 || playerPos == 15) {
					cpuPos = rand.nextInt(20 - 6) + 6;
					while  (cpuPos == 11 || cpuPos == 6 || cpuPos == 7 || cpuPos == 17 || cpuPos == 16) {
						cpuPos = rand.nextInt(20 - 6) + 6;
					}
				}
				
				if (playerPos == 16 || playerPos == 17 || playerPos == 18 ) {
					cpuPos = rand.nextInt(25 - 11) + 11;
					while  (cpuPos == 20 || cpuPos == 25 || cpuPos == 24 || cpuPos == 15 || cpuPos == 14) {
						cpuPos = rand.nextInt(25 - 11) + 11;
					}
				}
				if ( playerPos == 18 || playerPos == 19 || playerPos == 20) {
					cpuPos = rand.nextInt(25 - 11) + 11;
					while  (cpuPos == 16 || cpuPos == 11 || cpuPos == 12 || cpuPos == 21 || cpuPos == 22) {
						cpuPos = rand.nextInt(25 - 11) + 11;
					}
				}
				
				
				if (playerPos == 21 || playerPos == 22 || playerPos == 23) {
					cpuPos = rand.nextInt(25 - 16) + 16;
					while  (cpuPos == 25 || cpuPos == 20 || cpuPos == 19) {
						cpuPos = rand.nextInt(25 - 16) + 16;
					}
				}
				if (playerPos == 23 || playerPos == 24 || playerPos == 25) {
					cpuPos = rand.nextInt(25 - 16) + 16;
					while  (cpuPos == 21 || cpuPos == 16 || cpuPos == 17 ) {
						cpuPos = rand.nextInt(25 - 16) + 16;
					}
				}
			}
			
			
			
			placePiece(gameBoard, cpuPos, "cpu");
			
			printGameBoard(gameBoard);
		
			result = WinCon.checkWinner();
			if(result.length() > 0) {
				System.out.println(result);
				break;
			}
			
			
			
			

				

		}
			
			break;
			default:
			break;
		
		}
		
		
 
	}


	public static void printGameBoard(char[][] gameBoard) {
		for(char[] row : gameBoard) {
			for(char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
		
	}
	
public static void placePiece(char[][] gameBoard, int pos, String user) {
		
		char symbol = ' '; 
		
		if(user.equals("player")) {
			symbol = 'X';
			playerPositions.add(pos);
		} else if(user.equals("cpu")) {
			symbol = 'O';
			cpuPositions.add(pos);
		}
		
		switch(pos) {
		case 1:
			gameBoard[0][0] = symbol;
			break;
		case 2:
			gameBoard[0][2] = symbol;
			break;
		case 3:
			gameBoard[0][4] = symbol;
			break;
		case 4:
			gameBoard[0][6] = symbol;
			break;
		case 5:
			gameBoard[0][8] = symbol;
			break;
		case 6:
			gameBoard[2][0] = symbol;
			break;
		case 7:
			gameBoard[2][2] = symbol;
			break;
		case 8:
			gameBoard[2][4] = symbol;
			break;
		case 9:
			gameBoard[2][6] = symbol;
			break;
		case 10:
			gameBoard[2][8] = symbol;
			break;
		case 11:
			gameBoard[4][0] = symbol;
			break;
		case 12:
			gameBoard[4][2] = symbol;
			break;
		case 13:
			gameBoard[4][4] = symbol;
			break;
		case 14:
			gameBoard[4][6] = symbol;
			break;
		case 15:
			gameBoard[4][8] = symbol;
			break;
		case 16:
			gameBoard[6][0] = symbol;
			break;
		case 17:
			gameBoard[6][2] = symbol;
			break;
		case 18:
			gameBoard[6][4] = symbol;
			break;
		case 19:
			gameBoard[6][6] = symbol;
			break;
		case 20:
			gameBoard[6][8] = symbol;
			break;
		case 21:
			gameBoard[8][0] = symbol;
			break;
		case 22:
			gameBoard[8][2] = symbol;
			break;
		case 23:
			gameBoard[8][4] = symbol;
			break;
		case 24:
			gameBoard[8][6] = symbol;
			break;
		case 25:
			gameBoard[8][8] = symbol;
			break;
		default:
			break;
		}
}


}