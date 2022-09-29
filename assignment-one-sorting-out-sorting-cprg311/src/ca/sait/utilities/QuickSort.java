package ca.sait.utilities;

import java.util.Comparator;

import ca.sait.shapeDomain.Shape;

public class QuickSort {
	public QuickSort(Shape[] shapeArray, Comparator<Shape> comparator) {
		quickSort(shapeArray, 0, shapeArray.length - 1, comparator);
	}

	public QuickSort(Shape[] shapeArray) {
		quickSort(shapeArray, 0, shapeArray.length - 1);
	}
	
	private void quickSort(Shape[] arr, int low, int high, Comparator<Shape> comparator) {
		if (low < high) {

			int pi = partition(arr, low, high, comparator);

			quickSort(arr, low, pi - 1, comparator);
			quickSort(arr, pi + 1, high, comparator);
		}
	}
	
	private int partition(Shape[] arr, int low, int high, Comparator<Shape> comparator) {

		Shape pivot = arr[high];

		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {

			if (comparator.compare(arr[j], pivot) == 100) {

				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}
	
	private void quickSort(Shape[] arr, int low, int high) {
		if (low < high) {

			int pi = partition(arr, low, high);

			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}
	
	private int partition(Shape[] arr, int low, int high) {

		Shape pivot = arr[high];

		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {

			if (arr[j].compareTo(pivot) == 1) {

				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}

	private void swap(Shape[] arr, int i, int j) {
		Shape temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
