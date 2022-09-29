package ca.sait.utilities;

import java.util.Comparator;

import ca.sait.shapeDomain.Shape;

public class SelectionSort {
	
	public SelectionSort(Shape[] shapeArray, Comparator<Shape> comparator) {
		int n = shapeArray.length;

		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (comparator.compare(shapeArray[j], shapeArray[min_idx]) == 100)
					min_idx = j;

			Shape tempShape = shapeArray[min_idx];
			shapeArray[min_idx] = shapeArray[i];
			shapeArray[i] = tempShape;
		}
	}

	public SelectionSort(Shape[] shapeArray) {
		int n = shapeArray.length;

		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (shapeArray[j].compareTo(shapeArray[min_idx]) == 1)
					min_idx = j;

			Shape tempShape = shapeArray[min_idx];
			shapeArray[min_idx] = shapeArray[i];
			shapeArray[i] = tempShape;
		}
	}
}
