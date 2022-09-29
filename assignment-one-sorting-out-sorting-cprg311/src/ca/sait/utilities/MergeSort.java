package ca.sait.utilities;

import java.util.Comparator;

import ca.sait.shapeDomain.Shape;

public class MergeSort {
	public MergeSort(Shape[] shapeArray, Comparator<Shape> comparator) {
		mergeSort(shapeArray, comparator);
	}

	public MergeSort(Shape[] shapeArray) {
		mergeSort(shapeArray);
	}

	private void mergeSort(Shape[] array, Comparator<Shape> comparator) {
		if (array.length > 1) {
			int mid = array.length / 2;

			Shape[] left = new Shape[mid];
			for (int i = 0; i < mid; i++) {
				left[i] = array[i];
			}

			Shape[] right = new Shape[array.length - mid];
			for (int i = mid; i < array.length; i++) {
				right[i - mid] = array[i];
			}
			mergeSort(left, comparator);
			mergeSort(right, comparator);

			int i = 0;
			int j = 0;
			int k = 0;

			while (i < left.length && j < right.length) {
				if (comparator.compare(left[i], right[j]) == 100) {
					array[k] = left[i];
					i++;
				} else {
					array[k] = right[j];
					j++;
				}
				k++;
			}

			
			while (i < left.length) {
				array[k] = left[i];
				i++;
				k++;
			}
			while (j < right.length) {
				array[k] = right[j];
				j++;
				k++;
			}
		}
	}

	private void mergeSort(Shape[] array) {
		if (array.length > 1) {
			int mid = array.length / 2;

			Shape[] left = new Shape[mid];
			for (int i = 0; i < mid; i++) {
				left[i] = array[i];
			}

			Shape[] right = new Shape[array.length - mid];
			for (int i = mid; i < array.length; i++) {
				right[i - mid] = array[i];
			}
			
			mergeSort(left);
			mergeSort(right);

			int i = 0;
			int j = 0;
			int k = 0;

			while (i < left.length && j < right.length) {
				if (left[i].compareTo(right[j]) == 1) {
					array[k] = left[i];
					i++;
				} else {
					array[k] = right[j];
					j++;
				}
				k++;
			}
		
			while (i < left.length) {
				array[k] = left[i];
				i++;
				k++;
			}
			while (j < right.length) {
				array[k] = right[j];
				j++;
				k++;
			}
		}
	}
}
