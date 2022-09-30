package ca.sait.utilities;

import java.util.Comparator;

import ca.sait.shapeDomain.Shape;

/**
 * The Class InsertionSort. Uses the Insertion Sort Algorithm to sort shapes
 * based on the comparator or interfaced comparable shape.
 */
public class InsertionSort {

	/**
	 * Instantiates a new insertion sort.
	 *
	 * @param shapeArray the shape array filled with shapes
	 * @param comparator the comparator which is used to compare shapes based on the
	 *                   comparator parsed
	 */
	public InsertionSort(Shape[] shapeArray, Comparator<Shape> comparator) {

		int n = shapeArray.length;
		for (int i = 1; i < n; ++i) {
			Shape key = shapeArray[i];
			int j = i - 1;
			// Uses the comparator to compare the shape
			while (j >= 0 && comparator.compare(shapeArray[j], key) == -100) {
				shapeArray[j + 1] = shapeArray[j];
				j = j - 1;
			}

			shapeArray[j + 1] = key;
		}
	}

	/**
	 * Instantiates a new insertion sort which compares shapes based on the
	 * comparable interface
	 *
	 * @param shapeArray the shape array filled with shapes
	 */
	public InsertionSort(Shape[] shapeArray) {
		int n = shapeArray.length;
		for (int i = 1; i < n; ++i) {
			// Takes the next key and compares it to the sorted list
			Shape key = shapeArray[i];
			int j = i - 1;
			// Uses the compareTo (Comparable interface) to compare the shape and runs until
			// it has found the shapes location inside the sorted list
			while (j >= 0 && shapeArray[j].compareTo(key) == -1) {
				shapeArray[j + 1] = shapeArray[j];
				j = j - 1;
			}

			shapeArray[j + 1] = key;
		}
	}
}
