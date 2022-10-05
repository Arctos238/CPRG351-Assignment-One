package ca.sait.utilities;

import java.util.Comparator;

import ca.sait.shapeDomain.Shape;

/**
 * The Class SelectionSort.
 */
public class SelectionSort {

	/**
	 * Instantiates a new selection sort with a comparator.
	 *
	 * @param shapeArray the shape array
	 * @param comparator the comparator
	 */
	public SelectionSort(Shape[] shapeArray, Comparator<Shape> comparator) {
		// Gets the length of the array
		int n = shapeArray.length;

		// Loops through the length of the array
		for (int i = 0; i < n - 1; i++) {
			// Assigns the first element in the unsorted array to the max_idx
			int max_idx = i;

			// Finds the highest element in the unsorted array
			for (int j = i + 1; j < n; j++)
				if (comparator.compare(shapeArray[j], shapeArray[max_idx]) == 100)
					max_idx = j;

			// Swaps the element
			Shape tempShape = shapeArray[max_idx];
			shapeArray[max_idx] = shapeArray[i];
			shapeArray[i] = tempShape;
		}
	}

	/**
	 * Instantiates a new selection sort.
	 *
	 * @param shapeArray the shape array using the comparable interface.
	 */
	public SelectionSort(Shape[] shapeArray) {
		// Gets the length of the array
		int n = shapeArray.length;

		// Loops through the length of the array
		for (int i = 0; i < n - 1; i++) {
			// Assigns the first element in the unsorted array to the max_idx
			int max_idx = i;

			// Finds the highest element in the unsorted array
			for (int j = i + 1; j < n; j++)
				if (shapeArray[j].compareTo(shapeArray[max_idx]) == 1)
					max_idx = j;

			// Swaps the element
			Shape tempShape = shapeArray[max_idx];
			shapeArray[max_idx] = shapeArray[i];
			shapeArray[i] = tempShape;
		}
	}
}
