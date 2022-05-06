import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class win extends TicTacToe {
	
	public static int cpuWin() {
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
		
		List<List> cpuWin = new ArrayList<List>();
		cpuWin.add(topRow1);
		cpuWin.add(topRow2);
		
		cpuWin.add(secondRow1);
		cpuWin.add(secondRow2);
		
		cpuWin.add(forthRow1);
		cpuWin.add(forthRow2);
		
		cpuWin.add(therdRow1);
		cpuWin.add(therdRow2);
		
		cpuWin.add(botRow1);
		cpuWin.add(botRow2);
		
		cpuWin.add(leftCol1);
		cpuWin.add(leftCol2);
		
		cpuWin.add(secondCol1);
		cpuWin.add(secondCol2);
		
		cpuWin.add(therdCol1);
		cpuWin.add(therdCol2);
		
		cpuWin.add(forthCol1);
		cpuWin.add(forthCol2);
		
		cpuWin.add(rightCol1);
		cpuWin.add(rightCol2);
		
		cpuWin.add(leftCross1);
		cpuWin.add(leftCross11);
		cpuWin.add(leftCross2);
		cpuWin.add(leftCross22);
		cpuWin.add(leftCross3);
		cpuWin.add(leftCross33);
		cpuWin.add(leftCross4);
		cpuWin.add(leftCross44);
		
		cpuWin.add(rightCross1);
		cpuWin.add(rightCross2);
		cpuWin.add(rightCross3);
		cpuWin.add(rightCross4);
		
		for(List l : cpuWin) {
			if(cpuPositions.containsAll(topRow1)) {
				return  4;
			}else if(cpuPositions.containsAll(topRow2)) { 
				return 2;
			}
			
			else if(cpuPositions.containsAll(secondRow1)) { 
				return 7;
			}else if(cpuPositions.containsAll(secondRow2)) { 
				return 9;
			}
			
			else if(cpuPositions.containsAll(forthRow1)) { 
				return 19;
			}else if(cpuPositions.containsAll(forthRow2)) { 
				return 17;
			}
			
			else if(cpuPositions.containsAll(therdRow1)) { 
				return 14;
			}else if(cpuPositions.containsAll(therdRow2)) { 
				return 12;
			}
			
			else if(cpuPositions.containsAll(botRow1)) { 
				return 24;
			}else if(cpuPositions.containsAll(botRow2)) { 
				return 22;
			}
			
			else if(cpuPositions.containsAll(leftCol1)) { 
				return 16;
			}else if(cpuPositions.containsAll(leftCol2)) { 
				return 6;
			}
			
			else if(cpuPositions.containsAll(secondCol1)) { 
				return 17;
			}else if(cpuPositions.containsAll(secondCol2)) { 
				return 7;
			}
			
			else if(cpuPositions.containsAll(therdCol1)) { 
				return 18;
			}else if(cpuPositions.containsAll(therdCol2)) { 
				return 8;
			}
			
			else if(cpuPositions.containsAll(forthCol1)) { 
				return 19;
			}else if(cpuPositions.containsAll(forthCol2)) { 
				return 9;
			}
			
			else if(cpuPositions.containsAll(rightCol1)) { 
				return 20;
			}else if(cpuPositions.containsAll(rightCol2)) { 
				return 10;
			}
			
			else if(cpuPositions.containsAll(leftCross1)) { 
				return 17;
			}else if(cpuPositions.containsAll(leftCross11)) { 
				return 5;
			}
			
			else if(cpuPositions.containsAll(leftCross2)) { 
				return 21;
			}else if(cpuPositions.containsAll(leftCross22)) { 
				return 9;
			}
			
			
			else if(cpuPositions.containsAll(leftCross3)) { 
				return 16;
			}	else if(cpuPositions.containsAll(leftCross33)) { 
				return 4;
			}
			
			
			else if(cpuPositions.containsAll(leftCross4)) { 
				return 22;
			}	else if(cpuPositions.containsAll(leftCross44)) { 
				return 10;
			}
			
			
			else if(cpuPositions.containsAll(rightCross1)) { 
				return 19;
			}else if(cpuPositions.containsAll(rightCross11)) { 
				return 1;
			}
			
			else if(cpuPositions.containsAll(rightCross2)) { 
				return 25;
			}else if(cpuPositions.containsAll(rightCross22)) { 
				return 7;
			}
			
			else if(cpuPositions.containsAll(rightCross3)) { 
				return 20;
			}else if(cpuPositions.containsAll(rightCross33)) { 
				return 2;
			}
			
			else if(cpuPositions.containsAll(rightCross4)) { 
				return 24;
			}else if(cpuPositions.containsAll(rightCross44)) { 
				return 6;
			}
		}
		
		return 0;
	}
	

}
