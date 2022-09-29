package ca.sait.utilities;

import java.util.Comparator;

import ca.sait.shapeDomain.Shape;

public class HeapSort {
	
	public HeapSort(Shape[] shapeArray, Comparator<Shape> comparator) {
		int n = shapeArray.length;

		for (int i = n / 2 - 1; i >= 0; i--)
			heap(shapeArray, n, i, comparator);

		for (int i = n - 1; i > 0; i--) {
			Shape tempShape = shapeArray[0];
			shapeArray[0] = shapeArray[i];
			shapeArray[i] = tempShape;

			heap(shapeArray, i, 0, comparator);
		}
	}

	private void heap(Shape[] shapeArray, int n, int i, Comparator<Shape> comparator) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < n && comparator.compare(shapeArray[l], shapeArray[largest]) == -100) {
			largest = l;
		}

		if (r < n && comparator.compare(shapeArray[r], shapeArray[largest]) == -100) {
			largest = r;
		}

		if (largest != i) {
			Shape swapShape = shapeArray[i];
			shapeArray[i] = shapeArray[largest];
			shapeArray[largest] = swapShape;

			heap(shapeArray, n, largest, comparator);
		}
	}

	public HeapSort(Shape[] shapeArray) {
		int n = shapeArray.length;

		for (int i = n / 2 - 1; i >= 0; i--)
			heap(shapeArray, n, i);

		for (int i = n - 1; i > 0; i--) {
			Shape tempShape = shapeArray[0];
			shapeArray[0] = shapeArray[i];
			shapeArray[i] = tempShape;

			heap(shapeArray, i, 0);
		}
	}

	private void heap(Shape[] shapeArray, int n, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < n && shapeArray[l].compareTo(shapeArray[largest]) == -1) {
			largest = l;
		}

		if (r < n && shapeArray[r].compareTo(shapeArray[largest]) == -1) {
			largest = r;
		}

		if (largest != i) {
			Shape swapShape = shapeArray[i];
			shapeArray[i] = shapeArray[largest];
			shapeArray[largest] = swapShape;

			heap(shapeArray, n, largest);
		}
	}
}
