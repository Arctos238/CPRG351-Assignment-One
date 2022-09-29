package ca.sait.shapeDomain;


/**
 * The super class  for all Prisms.
 */
public abstract class Prism extends Shape {
	
	/** The side. */
	private double side;

	/**
	 * Instantiates a new prism.
	 *
	 * @param height the height
	 * @param side the side
	 */
	public Prism(double height, double side) {
		super(height);
		this.side = side;
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

}
