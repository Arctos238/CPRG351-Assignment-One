package ca.sait.utilities;

import java.util.Comparator;

import ca.sait.shapeDomain.Shape;

/**
 * Class for HeapSort
 */
public class HeapSort {
	
	/**
	 * Instantiates a new heap sort.
	 *
	 * @param shapeArray the shape array
	 * @param comparator the comparator which is used to compare shapes based on the
	 *                   comparator parsed
	 * Compare Shapes using a comparator
	 */
	public HeapSort(Shape[] shapeArray, Comparator<Shape> comparator) {
		int n = shapeArray.length;

		//Instantiate a heap data structure
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(shapeArray, n, i, comparator);

		//Move largest element to the last position of array, consider it as sorted
		for (int i = n - 1; i > 0; i--) {
			Shape tempShape = shapeArray[0];
			shapeArray[0] = shapeArray[i];
			shapeArray[i] = tempShape;
			
			//recall the heap method once the largest element is out.
			heapify(shapeArray, i, 0, comparator);
		}
	}

	/**
	 * Method to create/recreate a heap data structure
	 * 
	 * @param shapeArray the shape array
	 * @param n array length/ heap size
	 * @param i root index
	 * @param comparator the comparator which is used to compare shapes based on the
	 *                   comparator parsed
	 */
	private void heapify(Shape[] shapeArray, int n, int i, Comparator<Shape> comparator) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		//If left child > root => largest = left child
		if (l < n && comparator.compare(shapeArray[l], shapeArray[largest]) == -100) {
			largest = l;
		}

		//If right child > root => largest = right child
		if (r < n && comparator.compare(shapeArray[r], shapeArray[largest]) == -100) {
			largest = r;
		}

		//If largest is not root, swap it
		if (largest != i) {
			Shape swapShape = shapeArray[i];
			shapeArray[i] = shapeArray[largest];
			shapeArray[largest] = swapShape;

			//re-heap the tree, repeat the process until the largest is the root
			heapify(shapeArray, n, largest, comparator);
		}
	}

	/**
	 * Instantiates a new heap sort.
	 * 
	 * @param shapeArray the shape array
	 * Compare Shapes using compareTo() method
	 */
	public HeapSort(Shape[] shapeArray) {
		int n = shapeArray.length;

		//Instantiate a heap data structure
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(shapeArray, n, i);

		//Move largest element to the last position of array, consider it as sorted
		for (int i = n - 1; i > 0; i--) {
			Shape tempShape = shapeArray[0];
			shapeArray[0] = shapeArray[i];
			shapeArray[i] = tempShape;

			//recall the heap method once the largest element is out.
			heapify(shapeArray, i, 0);
		}
	}

	private void heapify(Shape[] shapeArray, int n, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		//If left child > root => largest = left child
		if (l < n && shapeArray[l].compareTo(shapeArray[largest]) == -1) {
			largest = l;
		}

		//If right child > root => largest = right child
		if (r < n && shapeArray[r].compareTo(shapeArray[largest]) == -1) {
			largest = r;
		}

		//If largest is not root, swap it
		if (largest != i) {
			Shape swapShape = shapeArray[i];
			shapeArray[i] = shapeArray[largest];
			shapeArray[largest] = swapShape;

			//re-heap the tree, repeat the process until the largest is the root
			heapify(shapeArray, n, largest);
		}
	}
}
