package ca.sait.shapeDomain;


/**
 * The Class Pyramid.
 */
public class Pyramid extends Shape {
	
	/** The side. */
	private double side;
	
	/** The volume. */
	private double volume;
	
	/** The base area. */
	private double baseArea;

	/**
	 * Instantiates a new pyramid.
	 *
	 * @param height the height
	 * @param side the side
	 */
	public Pyramid(double height, double side) {
		super(height);
		this.side = side;
		this.volume = calVolume();
		this.baseArea = calBaseArea();
	}

	/**
	 * Gets the volume.
	 *
	 * @return the volume
	 */
	public double getVolume() {
		return volume;
	}

	/**
	 * Gets the base area.
	 *
	 * @return the base area
	 */
	public double getBaseArea() {
		return baseArea;
	}

	/**
	 * Gets the side.
	 *
	 * @return the side
	 */
	public double getSide() {
		return side;
	}

	/**
	 * Sets the side.
	 *
	 * @param side the new side
	 */
	public void setSide(double side) {
		this.side = side;
	}

	/**
	 * Cal volume.
	 *
	 * @return the double
	 */
	@Override
	public double calVolume() {
		return (1.0 / 3) * this.calBaseArea() * this.getHeight();
	}

	/**
	 * Cal base area.
	 *
	 * @return the double
	 */
	@Override
	public double calBaseArea() {
		return this.side * this.side;
	}

}
