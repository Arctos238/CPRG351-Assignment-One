package ca.sait.shapeDomain;

public class TriangularPrism extends Prism {
	private double volume;
	private double baseArea;

	public TriangularPrism(double height, double side) {
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
		return ((this.getSide() * this.getSide()) * Math.sqrt(3)) / 4;
	}

}
