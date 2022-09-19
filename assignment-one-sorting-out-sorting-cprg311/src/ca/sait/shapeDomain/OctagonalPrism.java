package ca.sait.shapeDomain;

public class OctagonalPrism extends Prism {
	private double volume;
	private double baseArea;

	public OctagonalPrism(double height, double side) {
		super(height, side);
		this.volume = calVolume();
		this.baseArea = calBaseArea();
	}

	public double getVolume() {
		return volume;
	}

	public double getBaseArea() {
		return baseArea;
	}

	@Override
	public double calVolume() {
		return this.calBaseArea() * this.getHeight();
	}

	@Override
	public double calBaseArea() {
		return 2 * (1 + Math.sqrt(2)) * (this.getSide() * this.getSide());
	}

}
