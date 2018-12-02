package test;

import static org.junit.Assert.*;

import org.junit.Test;

import vehicle.Vehicle;
import module.DrivingModule.Direction;
import module.DrivingModule.Position;

public class VehicleTest {

	@Test
	public void test() {
		
		Vehicle test = new Vehicle(1);

		assertEquals(Position.NORMAL_UNCHANGED, test.go(Direction.UP));
		assertEquals(Position.NORMAL, test.go(Direction.DOWN));
		assertEquals(Position.NORMAL_UNCHANGED, test.go(Direction.LEFT));
		assertEquals(Position.NORMAL_UNCHANGED, test.go(Direction.RIGHT));
		
	}

}
