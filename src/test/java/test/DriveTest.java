package test;

import static org.junit.Assert.*;
import module.DrivingModule.Position;

import org.junit.Test;

import drive.Drive;
import vehicle.Vehicle;


public class DriveTest {

	@Test
	public void test() {
		
		Drive test = new Drive();
		
		assertEquals(Position.NORMAL, test.driveFromStartToEnd(1, new Vehicle(1)));
		assertEquals(Position.NORMAL, test.driveFromStartToEnd(2, new Vehicle(2)));
		assertEquals(Position.NORMAL_UNCHANGED, test.driveFromStartToEnd(3, new Vehicle(3)));
	}

}
