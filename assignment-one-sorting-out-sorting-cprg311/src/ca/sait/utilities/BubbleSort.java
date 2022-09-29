package ca.sait.utilities;

import java.util.Comparator;

import ca.sait.shapeDomain.Shape;

public class BubbleSort {
	
	public BubbleSort(Shape[] shapeArray, Comparator<Shape> comp) {

		int n = shapeArray.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (comp.compare(shapeArray[j], shapeArray[j + 1]) == -100) {
					Shape temp = shapeArray[j];
					shapeArray[j] = shapeArray[j + 1];
					shapeArray[j + 1] = temp;
				}
			}
		}
	}

	public BubbleSort(Shape[] shapeArray) {
		int n = shapeArray.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (shapeArray[j].compareTo(shapeArray[j + 1]) == -1) {
					Shape temp = shapeArray[j];
					shapeArray[j] = shapeArray[j + 1];
					shapeArray[j + 1] = temp;
				}
	}
}
