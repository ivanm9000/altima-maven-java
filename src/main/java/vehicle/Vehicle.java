package vehicle;

import module.*;
import tunnel.Tunnel;


public class Vehicle implements DrivingModule {
	
	private Tunnel tunnel;
	private int positionI;
	private int positionJ;
	private int n;
	private int m;

	public Vehicle(int number){
		Tunnel tunnelX = new Tunnel(number);
		tunnel = tunnelX;
		positionI = tunnel.startI;
		positionJ = tunnel.startJ;
		n = tunnel.n;
		m = tunnel.m;
	}
	
	public Position go(Direction direction) {

		switch (direction) {
		case UP:
			if (((positionI-1) < 0)||(positionI >= m)||(positionJ-1<0)||(positionJ >=n)) {
				return Position.NORMAL_UNCHANGED;
			}
					
			if (tunnel.tunnel[positionI-1][positionJ]==2) {
				tunnel.tunnel[positionI][positionJ] = 1;
				positionI--;
				return Position.NORMAL;
				
			} else if(tunnel.tunnel[positionI-1][positionJ]==1){
				return Position.NORMAL_UNCHANGED;
			} else {
				return Position.NORMAL_UNCHANGED;
			}
		case DOWN:		
			if ((positionI+1) > (m-1)) {
				return Position.NORMAL_UNCHANGED;
			}
			if (tunnel.tunnel[positionI+1][positionJ]==2) {		
				tunnel.tunnel[positionI][positionJ] = 1;
				positionI++;
				return Position.NORMAL;		
			} else if(tunnel.tunnel[positionI+1][positionJ]==1){
				return Position.NORMAL_UNCHANGED;
			} else {
				return Position.NORMAL_UNCHANGED;
			}
		case LEFT:	
			if ((positionJ-1) < 0) {
				return Position.NORMAL_UNCHANGED;
			}
			if (tunnel.tunnel[positionI][positionJ-1]==2) {		
				tunnel.tunnel[positionI][positionJ-1] = 1;
				positionJ--;
				return Position.NORMAL;	
			} else if(tunnel.tunnel[positionI][positionJ]==1){
				return Position.NORMAL_UNCHANGED;
			} else {
				return Position.NORMAL_UNCHANGED;
			}
		default:
			//	RIGHT
			if ((positionJ+1) > (n-1)) {
				return Position.NORMAL_UNCHANGED;
			}
			if (tunnel.tunnel[positionI][positionJ+1]==2) {
				tunnel.tunnel[positionI][positionJ] = 1;
				positionJ++;
				return Position.NORMAL;	
			} else if(tunnel.tunnel[positionI][positionJ+1]==1){
				return Position.NORMAL_UNCHANGED;
			} else {
				return Position.NORMAL_UNCHANGED;
			}
		}
	}
}
