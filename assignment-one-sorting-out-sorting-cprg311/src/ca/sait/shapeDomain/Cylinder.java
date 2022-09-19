package ca.sait.shapeDomain;

public class Cylinder extends Shape {
	private double radius;
	private double volume;
	private double baseArea;

	public Cylinder(double height, double radius) {
		super(height);
		this.radius = radius;
		this.volume = calVolume();
		this.baseArea = calBaseArea();
	}

	public double getVolume() {
		return volume;
	}

	public double getBaseArea() {
		return baseArea;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calVolume() {
		return this.calBaseArea() * this.getHeight();
	}

	@Override
	public double calBaseArea() {
		return Math.PI * (this.radius * this.radius);
	}

}
