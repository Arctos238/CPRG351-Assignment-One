package ca.sait.utilities;

import java.util.Comparator;

import ca.sait.shapeDomain.Shape;

/**
 * The Class BubbleSort.
 */
public class BubbleSort {

	/**
	 * Instantiates a new bubble sort.
	 *
	 * @param shapeArray the shape array
	 * @param Uses       a comparator<shape type> to compare based of the comparator
	 */
	public BubbleSort(Shape[] shapeArray, Comparator<Shape> comp) {

		int n = shapeArray.length;
		for (int i = 0; i < n - 1; i++) {
			boolean swapMade = false;
			for (int j = 0; j < n - i - 1; j++) {
				// If the shape is less than the one compared it will swap them.
				if (comp.compare(shapeArray[j], shapeArray[j + 1]) == -100) {
					Shape temp = shapeArray[j];
					shapeArray[j] = shapeArray[j + 1];
					shapeArray[j + 1] = temp;
					// Sets swapMade to true, so the loop will continue to run
					swapMade = true;
				}
			}

			// If no swaps made then exit the loop and end the algorithm
			if (!swapMade) {
				i = n;
			}
		}
	}

	/**
	 * Instantiates a new bubble sort.
	 *
	 * @param shapeArray the shape array
	 */
	public BubbleSort(Shape[] shapeArray) {
		int n = shapeArray.length;
		for (int i = 0; i < n - 1; i++) {
			boolean swapMade = false;
			for (int j = 0; j < n - i - 1; j++)
				// If the shape is less than the one compared it will swap them.
				if (shapeArray[j].compareTo(shapeArray[j + 1]) == -1) {
					Shape temp = shapeArray[j];
					shapeArray[j] = shapeArray[j + 1];
					shapeArray[j + 1] = temp;
					swapMade = true;
				}

			// If no swaps made then exit the loop and end the algorithm
			if (!swapMade) {
				i = n;
			}
		}
	}
}
