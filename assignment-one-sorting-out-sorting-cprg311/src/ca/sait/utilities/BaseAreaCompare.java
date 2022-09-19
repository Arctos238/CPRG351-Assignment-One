package ca.sait.utilities;

import java.util.Comparator;

import ca.sait.shapeDomain.Shape;

public class BaseAreaCompare implements Comparator<Shape>{
	
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
