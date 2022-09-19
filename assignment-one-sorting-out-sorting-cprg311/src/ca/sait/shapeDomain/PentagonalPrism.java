package ca.sait.shapeDomain;

public class PentagonalPrism extends Prism {
	private double volume;
	private double baseArea;

	public PentagonalPrism(double height, double side) {
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
		return (5 * (this.getSide() * this.getSide()) * Math.tan(54)) / 4;
	}

}
