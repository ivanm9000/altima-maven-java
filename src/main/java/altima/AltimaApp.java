package altima;

import java.util.Scanner;

import drive.*;
import vehicle.*;

public class AltimaApp {
	public static void main(String[] args) {

		int numberOfTunnel;
		String str;
		Scanner scanIn = new Scanner(System.in);
		
		
		while(true) {	
			
			System.out.println("Enter number of tunnel :");		
			str = scanIn.nextLine();
			
			try {		
				numberOfTunnel = Integer.parseInt(str);
				if (numberOfTunnel <= 0) {
					System.out.println("Only integer greater than 0 is accepted :");	
				} else break; 
			} 
			catch (Exception e) {	
				System.out.println("Only integer greater than 0 is accepted :");
			}
		}
		
		scanIn.close();

		Vehicle vehicle = new Vehicle(numberOfTunnel);
		Drive drive = new Drive();

		if (drive.driveFromStartToEnd(numberOfTunnel, vehicle).toString() != "NORMAL") {
			System.exit(0);
		}
	}
}
