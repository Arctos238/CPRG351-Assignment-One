package ca.sait.shapeDomain;

// Height Super Class used for all shapes
/**
 * The Class Shape.
 */
public abstract class Shape implements Comparable<Shape> {
	
	/** The height. */
	private double height;

	/**
	 * Instantiates a new shape.
	 *
	 * @param height the height
	 */
	public Shape(double height) {
		this.height = height;
	}

	/**
	 * Gets the height.
	 *
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Sets the height.
	 *
	 * @param height the new height
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Compare to.
	 *
	 * @param thatShape the that shape
	 * @return the int
	 */
	@Override
	public int compareTo(Shape thatShape) {
		if (this.height > thatShape.height) {
			return 1;
		} else if (this.height < thatShape.height) {
			return -1;
		} else {
			return 0;
		}

	}

	/**
	 * Cal volume.
	 *
	 * @return the double
	 */
	public abstract double calVolume();

	/**
	 * Cal base area.
	 *
	 * @return the double
	 */
	public abstract double calBaseArea();

	/**
	 * Gets the base area.
	 *
	 * @return the base area
	 */
	public abstract double getBaseArea();

	/**
	 * Gets the volume.
	 *
	 * @return the volume
	 */
	public abstract double getVolume();
}
