package ie.gmit.sw.player;

/*
 * for direction use of player movement
 */
public enum Direction {

	UP(0), 
	DOWN(1), 
	LEFT(2), 
	RIGHT(3);

	private final int orientation;

	private Direction(int orientation) {
		this.orientation = orientation;
	}

	public int getOrientation() {
		return this.orientation;
	}
}