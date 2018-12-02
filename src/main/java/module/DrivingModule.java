package module;

public interface DrivingModule {
	
	public Position go(Direction direction);
	
	public enum Direction {
		UP,
		DOWN,
		LEFT,
		RIGHT;
	}
	
	public enum Position {
		START,
		NORMAL,
		NORMAL_UNCHANGED,
		END;
	}

}
