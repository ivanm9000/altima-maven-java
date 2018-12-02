package tunnel;

public class Tunnel {
	

	
	public int [][] tunnel;
	public int n;
	public int m;
	public int startI;
	public int startJ;
	public int endI;
	public int endJ;
	
	
	int[] TunnelN = {7,7,7};
	int[] TunnelM = {14,14,14};
	
	int [][] tunnel1 = new int[][]{
			{0,2,0,0,0,0,0},
			{0,2,0,0,0,0,0},
			{0,2,2,2,0,0,0},
			{0,0,0,2,0,0,0},
			{0,0,0,2,0,0,0},
			{0,0,0,2,2,0,0},
			{0,0,0,0,2,0,0},
			{0,0,0,0,2,0,0},
			{0,0,0,0,2,0,0},
			{0,0,0,0,2,0,0},
			{0,0,0,0,2,2,0},
			{0,0,0,0,0,2,0},
			{0,0,0,0,0,2,0},
			{0,0,0,0,0,2,0},
	};
	int [][] tunnel2 = new int[][]{
			{0,2,0,0,0,0,0},
			{0,2,0,0,0,0,0},
			{0,2,0,2,2,2,0},
			{0,2,0,2,0,2,0},
			{0,2,0,2,0,2,0},
			{0,2,2,2,0,2,0},
			{0,0,0,0,0,2,0},
			{0,0,0,0,0,2,0},
			{0,0,0,0,0,2,0},
			{0,0,2,2,2,2,0},
			{0,0,2,0,0,0,0},
			{0,0,2,2,2,2,0},
			{0,0,0,0,0,2,0},
			{0,0,0,0,0,2,0},
	};
	int [][] tunnel3 = new int[][]{
			{0,0,0,2,0,0,0},
			{0,0,0,2,0,0,0},
			{0,0,0,2,0,0,0},
			{0,0,0,2,0,0,0},
			{0,0,0,2,2,2,0},
			{0,0,0,0,0,2,0},
			{0,0,0,0,0,2,0},
			{0,0,0,0,0,2,0},
			{0,0,0,0,0,2,0},
			{0,0,0,0,2,2,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,2,0,0},
			{0,0,0,0,2,0,0},
			{0,0,0,0,2,0,0},
	};

	public Tunnel(int number) {

		//SQL query in database for number of tunnel, here is made with switch-case and hardcoded
		
		switch (number) {
		case 1:
			n = TunnelN[number-1];
			m = TunnelM[number-1];
			startI = 0;
			startJ = 1;
			endI = 13;
			endJ = 5;
			
			tunnel = tunnel1;
			break;
			
		case 2:
			n = TunnelN[number-1];
			m = TunnelM[number-1];
			startI = 0;
			startJ = 1;
			endI = 13;
			endJ = 5;
			
			tunnel = tunnel2;
			break;
			
		case 3:
			n = TunnelN[number-1];
			m = TunnelM[number-1];
			startI = 0;
			startJ = 3;
			endI = 13;
			endJ = 4;
			
			tunnel = tunnel3;
			break;
		default:
			System.out.println("Map of tunnel NOT FOUND");
			System.exit(0);
		}
	}

}
