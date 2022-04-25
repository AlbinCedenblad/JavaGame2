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
		
		printGameBoard(gameBoard);
		
		
		
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your placement 1-25:");
		int playerPos = scan.nextInt();
		while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)){
			System.out.println("Position taken");
			playerPos = scan.nextInt();
		}
		
		
		String result = checkWinner();
		if(result.length() > 0) {
			System.out.println(result);
			break;
		}
		
		
		placePiece(gameBoard, playerPos, "player");
		
		
		Random rand = new Random();
		int cpuPos = rand.nextInt(25) + 1;
		
		//def
		if (playerPos == 1 || playerPos == 2 || playerPos == 3 || playerPos == 4 || playerPos == 5) {
			cpuPos = rand.nextInt(7) + 1;
		}
		if (playerPos == 21 || playerPos == 22 || playerPos == 23 || playerPos == 24 || playerPos == 25) {
			cpuPos = rand.nextInt(15) + 15;
			if (cpuPos > 25) {
				cpuPos = rand.nextInt(15) + 15;
			}
		}
		//attack
		if(cpuPos == 10) {
			cpuPos = 9;
		}
		
	
		
		while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)){
			cpuPos = rand.nextInt(25) + 1;
		}
		placePiece(gameBoard, cpuPos, "cpu");
		
		printGameBoard(gameBoard);
	
		 result = checkWinner();
		if(result.length() > 0) {
			System.out.println(result);
			break;
		}
		


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
	
	public static String checkWinner() {
		List topRow1 = Arrays.asList(1, 2, 3, 4);
		List topRow2 = Arrays.asList(2, 3, 4, 5);
		
		
		List secondRow1 = Arrays.asList(6, 7, 8, 9);
		List secondRow2 = Arrays.asList(7, 8, 9, 10);
		
		List therdRow1 = Arrays.asList(11, 12, 13, 14);
		List therdRow2 = Arrays.asList(12, 13, 14, 15);
		
		List forthRow1 = Arrays.asList(16, 17, 18, 19);
		List forthRow2 = Arrays.asList(17, 18, 19, 20);
		
		List botRow1 = Arrays.asList(21, 22, 23, 24);
		List botRow2 = Arrays.asList(22, 23, 24, 25);
		
		List leftCol1 = Arrays.asList(1, 6, 11, 16);
		List leftCol2 = Arrays.asList(6, 11, 16, 21);
		
		List secondCol1 = Arrays.asList(2, 7, 12, 17);
		List secondCol2 = Arrays.asList(7, 12, 17, 22);
		
		List therdCol1 = Arrays.asList(3, 8, 13, 18);
		List therdCol2 = Arrays.asList(8, 13, 18, 23);
		
		List forthCol1 = Arrays.asList(4, 9, 14, 19);
		List forthCol2 = Arrays.asList(9, 18, 19, 24);
		
		List rightCol1 = Arrays.asList(5, 10, 15, 20);
		List rightCol2 = Arrays.asList(10, 15, 20, 25);
		
		List leftCross1 = Arrays.asList(5, 9, 13, 17);
		List leftCross2 = Arrays.asList(9, 13, 17, 21);
		List leftCross3 = Arrays.asList(4, 8, 12, 16);
		List leftCross4 = Arrays.asList(10, 14, 18, 22);
		
		List rightCross1 = Arrays.asList(1, 7, 13, 19);
		List rightCross2 = Arrays.asList(7, 13, 19, 25);
		List rightCross3 = Arrays.asList(2, 8, 14, 20);
		List rightCross4 = Arrays.asList(6, 12, 18, 24);
		
		List<List> WinningConditions = new ArrayList<List>();
		WinningConditions.add(topRow1);
		WinningConditions.add(topRow2);
		
		WinningConditions.add(secondRow1);
		WinningConditions.add(secondRow2);
		
		WinningConditions.add(forthRow1);
		WinningConditions.add(forthRow2);
		
		WinningConditions.add(therdRow1);
		WinningConditions.add(therdRow2);
		
		WinningConditions.add(botRow1);
		WinningConditions.add(botRow2);
		
		WinningConditions.add(leftCol1);
		WinningConditions.add(leftCol2);
		
		WinningConditions.add(secondCol1);
		WinningConditions.add(secondCol2);
		
		WinningConditions.add(therdCol1);
		WinningConditions.add(therdCol2);
		
		WinningConditions.add(forthCol1);
		WinningConditions.add(forthCol2);
		
		WinningConditions.add(rightCol1);
		WinningConditions.add(rightCol2);
		
		WinningConditions.add(leftCross1);
		WinningConditions.add(leftCross2);
		WinningConditions.add(leftCross3);
		WinningConditions.add(leftCross4);
		
		WinningConditions.add(rightCross1);
		WinningConditions.add(rightCross2);
		WinningConditions.add(rightCross3);
		WinningConditions.add(rightCross4);
		
		for(List l : WinningConditions) {
			if(playerPositions.containsAll(l)) {
				return "Congratulations";
			}
			else if(cpuPositions.containsAll(l)) {
				return"CPU win";
			}
			else if(playerPositions.size() + cpuPositions.size() == 9) {
				return"rematch";
			}
			
		}
		
		return "";
	}
}
