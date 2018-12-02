package drive;

import java.util.Collections;
import java.util.LinkedList;

import module.DrivingModule;
import module.DrivingModule.Direction;
import module.DrivingModule.Position;
import tunnel.Tunnel;

public class Drive {
	
	public Position driveFromStartToEnd(int tunnelNumber, DrivingModule drivingModule){
		
		Tunnel tunnel = new Tunnel(tunnelNumber);
		int positionI = tunnel.startI;
		int positionJ = tunnel.startJ;
		int counter = 0;
		String str;
		LinkedList<String> pathToEnd = new LinkedList<String>();

		while (!((positionI == tunnel.endI)&&(positionJ == tunnel.endJ))) {
			counter = 0;
			for (Direction dir : Direction.values()){

				if (drivingModule.go(dir) == Position.NORMAL_UNCHANGED) {
					counter ++;
				} else {
					
					str = "";
					
					switch (dir) {
					case UP:
						str = String.format("(%d,%d)", positionI, positionJ);
						pathToEnd.add(str);	
						positionI--;
						break;
						
					case DOWN:
						str = String.format("(%d,%d)", positionI, positionJ);
						pathToEnd.add(str);
						positionI++;
						break;
						
					case LEFT:
						str = String.format("(%d,%d)", positionI, positionJ);
						pathToEnd.add(str);
						positionJ--;
						break;
						
					default:
						//	RIGHT
						str = String.format("(%d,%d)", positionI, positionJ);
						pathToEnd.add(str);
						positionJ++;
						break;
					}		
					break;			
				}
				if (counter == 4) {
					System.out.println("Tunnel obstruction, return to starting point S");
					Collections.reverse(pathToEnd);
					System.out.println();
					
					for (String s : pathToEnd){
						System.out.println(s);
					}
					
					return Position.NORMAL_UNCHANGED;
				}
			}
		}	
		String s = String.format("(%d,%d)", tunnel.endI, tunnel.endJ);
		System.out.println(s);
		return Position.NORMAL;
	}

}
