import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class stop extends TicTacToe {
	
	public static int stopPlayer() {
		List topRow1 = Arrays.asList(1, 2, 3);
		List topRow2 = Arrays.asList( 3, 4, 5);
		
		
		List secondRow1 = Arrays.asList(6, 7, 8);
		List secondRow2 = Arrays.asList(8, 9, 10);
		
		List therdRow1 = Arrays.asList(11, 12, 13);
		List therdRow2 = Arrays.asList(13, 14, 15);
		
		List forthRow1 = Arrays.asList(16, 17, 18);
		List forthRow2 = Arrays.asList(18, 19, 20);
		
		List botRow1 = Arrays.asList(21, 22, 23);
		List botRow2 = Arrays.asList(23, 24, 25);
		
		List leftCol1 = Arrays.asList(1, 6, 11);
		List leftCol2 = Arrays.asList(11, 16, 21);
		
		List secondCol1 = Arrays.asList(2, 7, 12);
		List secondCol2 = Arrays.asList( 12, 17, 22);
		
		List therdCol1 = Arrays.asList(3, 8, 13);
		List therdCol2 = Arrays.asList(13, 18, 23);
		
		List forthCol1 = Arrays.asList(4, 9, 14);
		List forthCol2 = Arrays.asList( 14, 19, 24);
		
		List rightCol1 = Arrays.asList(5, 10, 15);
		List rightCol2 = Arrays.asList(15, 20, 25);
		
		List leftCross1 = Arrays.asList(5, 9, 13);
		List leftCross11 = Arrays.asList(9, 13, 17);
		
		List leftCross2 = Arrays.asList(9, 13, 17);
		List leftCross22 = Arrays.asList(13, 17, 21);
		
		List leftCross3 = Arrays.asList(4, 8, 12);
		List leftCross33 = Arrays.asList(8, 12, 16);
		
		List leftCross4 = Arrays.asList(10, 14, 18);
		List leftCross44 = Arrays.asList(14, 18, 22);
		
		List rightCross1 = Arrays.asList(1, 7, 13);
		List rightCross11 = Arrays.asList( 7, 13, 19);
		
		List rightCross2 = Arrays.asList(7, 13, 19);
		List rightCross22 = Arrays.asList(13, 19, 25);
		
		List rightCross3 = Arrays.asList(2, 8, 14);
		List rightCross33 = Arrays.asList(8, 14, 20);
		
		List rightCross4 = Arrays.asList(6, 12, 18);
		List rightCross44 = Arrays.asList(12, 18, 24);
		
		List<List> stopPlayer = new ArrayList<List>();
		stopPlayer.add(topRow1);
		stopPlayer.add(topRow2);
		
		stopPlayer.add(secondRow1);
		stopPlayer.add(secondRow2);
		
		stopPlayer.add(forthRow1);
		stopPlayer.add(forthRow2);
		
		stopPlayer.add(therdRow1);
		stopPlayer.add(therdRow2);
		
		stopPlayer.add(botRow1);
		stopPlayer.add(botRow2);
		
		stopPlayer.add(leftCol1);
		stopPlayer.add(leftCol2);
		
		stopPlayer.add(secondCol1);
		stopPlayer.add(secondCol2);
		
		stopPlayer.add(therdCol1);
		stopPlayer.add(therdCol2);
		
		stopPlayer.add(forthCol1);
		stopPlayer.add(forthCol2);
		
		stopPlayer.add(rightCol1);
		stopPlayer.add(rightCol2);
		
		stopPlayer.add(leftCross1);
		stopPlayer.add(leftCross11);
		stopPlayer.add(leftCross2);
		stopPlayer.add(leftCross22);
		stopPlayer.add(leftCross3);
		stopPlayer.add(leftCross33);
		stopPlayer.add(leftCross4);
		stopPlayer.add(leftCross44);
		
		stopPlayer.add(rightCross1);
		stopPlayer.add(rightCross2);
		stopPlayer.add(rightCross3);
		stopPlayer.add(rightCross4);
		
		for(List l : stopPlayer) {
			if(playerPositions.containsAll(topRow1)) {
				return  4;
			}else if(playerPositions.containsAll(topRow2)) { 
				return 2;
			}
			
			else if(playerPositions.containsAll(secondRow1)) { 
				return 7;
			}else if(playerPositions.containsAll(secondRow2)) { 
				return 9;
			}
			
			else if(playerPositions.containsAll(forthRow1)) { 
				return 19;
			}else if(playerPositions.containsAll(forthRow2)) { 
				return 17;
			}
			
			else if(playerPositions.containsAll(therdRow1)) { 
				return 14;
			}else if(playerPositions.containsAll(therdRow2)) { 
				return 12;
			}
			
			else if(playerPositions.containsAll(botRow1)) { 
				return 24;
			}else if(playerPositions.containsAll(botRow2)) { 
				return 22;
			}
			
			else if(playerPositions.containsAll(leftCol1)) { 
				return 16;
			}else if(playerPositions.containsAll(leftCol2)) { 
				return 6;
			}
			
			else if(playerPositions.containsAll(secondCol1)) { 
				return 17;
			}else if(playerPositions.containsAll(secondCol2)) { 
				return 7;
			}
			
			else if(playerPositions.containsAll(therdCol1)) { 
				return 18;
			}else if(playerPositions.containsAll(therdCol2)) { 
				return 8;
			}
			
			else if(playerPositions.containsAll(forthCol1)) { 
				return 19;
			}else if(playerPositions.containsAll(forthCol2)) { 
				return 9;
			}
			
			else if(playerPositions.containsAll(rightCol1)) { 
				return 20;
			}else if(playerPositions.containsAll(rightCol2)) { 
				return 10;
			}
			
			else if(playerPositions.containsAll(leftCross1)) { 
				return 17;
			}else if(playerPositions.containsAll(leftCross11)) { 
				return 5;
			}
			
			else if(playerPositions.containsAll(leftCross2)) { 
				return 21;
			}else if(playerPositions.containsAll(leftCross22)) { 
				return 9;
			}
			
			
			else if(playerPositions.containsAll(leftCross3)) { 
				return 16;
			}	else if(playerPositions.containsAll(leftCross33)) { 
				return 4;
			}
			
			
			else if(playerPositions.containsAll(leftCross4)) { 
				return 22;
			}	else if(playerPositions.containsAll(leftCross44)) { 
				return 10;
			}
			
			
			else if(playerPositions.containsAll(rightCross1)) { 
				return 19;
			}else if(playerPositions.containsAll(rightCross11)) { 
				return 1;
			}
			
			else if(playerPositions.containsAll(rightCross2)) { 
				return 25;
			}else if(playerPositions.containsAll(rightCross22)) { 
				return 7;
			}
			
			else if(playerPositions.containsAll(rightCross3)) { 
				return 20;
			}else if(playerPositions.containsAll(rightCross33)) { 
				return 2;
			}
			
			else if(playerPositions.containsAll(rightCross4)) { 
				return 24;
			}else if(playerPositions.containsAll(rightCross44)) { 
				return 6;
			}
		}
		
		return 0;
	}
	
	

}
