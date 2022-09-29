package ca.sait.utilities;

import java.util.Comparator;

import ca.sait.shapeDomain.Shape;

// Compares shapes based on area
/**
 * The Class BaseAreaCompare.
 */
public class BaseAreaCompare implements Comparator<Shape>{
	
	/**
	 * Compare.
	 *
	 * @param shape1 the shape 1
	 * @param shape2 the shape 2
	 * @return the int
	 */
	@Override
	public int compare(Shape shape1, Shape shape2) {
		if (shape1.getBaseArea() > shape2.getBaseArea()) {
			return 100;
		} else if (shape1.getBaseArea() < shape2.getBaseArea()) {
			return -100;
		} else {
			return 0;
		}
	}
}
