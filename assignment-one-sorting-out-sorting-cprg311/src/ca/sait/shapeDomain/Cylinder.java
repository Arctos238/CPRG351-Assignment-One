package ca.sait.shapeDomain;

/**
 * The Class Cylinder.
 */
public class Cylinder extends Shape {
	
	/** The radius. */
	private double radius;
	
	/** The volume. */
	private double volume;
	
	/** The base area. */
	private double baseArea;

	/**
	 * Instantiates a new cylinder.
	 *
	 * @param height the height
	 * @param radius the radius
	 */
	public Cylinder(double height, double radius) {
		super(height);
		this.radius = radius;
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
	 * Gets the radius.
	 *
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * Sets the radius.
	 *
	 * @param radius the new radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * Cal volume.
	 *
	 * @return the double
	 */
	@Override
	public double calVolume() {
		return this.calBaseArea() * this.getHeight();
	}

	/**
	 * Cal base area.
	 *
	 * @return the double
	 */
	@Override
	public double calBaseArea() {
		return Math.PI * (this.radius * this.radius);
	}

}
