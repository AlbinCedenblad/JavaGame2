import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class winCon extends TicTacToe {
	
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
		List forthCol2 = Arrays.asList(9, 14, 19, 24);
		
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
			else if(playerPositions.size() + cpuPositions.size() == 25) {
				return"No winner3";
			}
			
		}
		
		return "";
	}

}
