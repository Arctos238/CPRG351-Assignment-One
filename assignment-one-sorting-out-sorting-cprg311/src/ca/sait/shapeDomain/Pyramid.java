package ca.sait.shapeDomain;

public class Pyramid extends Shape {
	private double side;
	private double volume;
	private double baseArea;

	public Pyramid(double height, double side) {
		super(height);
		this.side = side;
		this.volume = calVolume();
		this.baseArea = calBaseArea();
	}

	public double getVolume() {
		return volume;
	}

	public double getBaseArea() {
		return baseArea;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double calVolume() {
		return (1.0 / 3) * this.calBaseArea() * this.getHeight();
	}

	@Override
	public double calBaseArea() {
		return this.side * this.side;
	}

}
