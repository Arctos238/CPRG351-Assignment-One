package ca.sait.shapeDomain;


/**
 * The Class OctagonalPrism.
 */
public class OctagonalPrism extends Prism {
	
	/** The volume. */
	private double volume;
	
	/** The base area. */
	private double baseArea;

	/**
	 * Instantiates a new octagonal prism.
	 *
	 * @param height the height
	 * @param side the side
	 */
	public OctagonalPrism(double height, double side) {
		super(height, side);
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
		return 2 * (1 + Math.sqrt(2)) * (this.getSide() * this.getSide());
	}

}
