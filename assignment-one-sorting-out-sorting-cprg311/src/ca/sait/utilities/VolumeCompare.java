package ca.sait.utilities;

import java.util.Comparator;

import ca.sait.shapeDomain.Shape;

public class VolumeCompare implements Comparator<Shape> {

	@Override
	public int compare(Shape shape1, Shape shape2) {
		if (shape1.getVolume() > shape2.getVolume()) {
			return 100;
		} else if (shape1.getVolume() < shape2.getVolume()) {
			return -100;
		} else {
			return 0;
		}
	}
}
