package ca.sait.shapeDomain;

public abstract class Shape implements Comparable<Shape> {
	private double height;

	public Shape(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

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

	public abstract double calVolume();

	public abstract double calBaseArea();

	public abstract double getBaseArea();

	public abstract double getVolume();
}
