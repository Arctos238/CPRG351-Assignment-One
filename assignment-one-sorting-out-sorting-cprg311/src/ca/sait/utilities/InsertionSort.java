package ca.sait.utilities;

import java.util.Comparator;

import ca.sait.shapeDomain.Shape;

public class InsertionSort {
	public InsertionSort(Shape[] shapeArray, Comparator<Shape> comparator) {
		int n = shapeArray.length;
		for (int i = 1; i < n; ++i) {
			Shape key = shapeArray[i];
			int j = i - 1;

			while (j >= 0 && comparator.compare(shapeArray[j], key) == -100) {
				shapeArray[j + 1] = shapeArray[j];
				j = j - 1;
			}

			shapeArray[j + 1] = key;
		}
	}

	public InsertionSort(Shape[] shapeArray) {
		int n = shapeArray.length;
		for (int i = 1; i < n; ++i) {
			Shape key = shapeArray[i];
			int j = i - 1;

			while (j >= 0 && shapeArray[j].compareTo(key) == -1) {
				shapeArray[j + 1] = shapeArray[j];
				j = j - 1;
			}

			shapeArray[j + 1] = key;
		}
	}
}
