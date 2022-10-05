package ca.sait.utilities;

import java.util.Comparator;

import ca.sait.shapeDomain.Shape;

/**
 * The Class QuickSort.
 */
public class QuickSort {

	/**
	 * Instantiates a new quick sort with a comparator.
	 *
	 * @param shapeArray the shape array
	 * @param comparator the comparator
	 */
	public QuickSort(Shape[] shapeArray, Comparator<Shape> comparator) {
		quickSort(shapeArray, 0, shapeArray.length - 1, comparator);
	}

	/**
	 * Instantiates a new quick sort using the comparable interface shapeArray.
	 *
	 * @param shapeArray the shape array
	 */
	public QuickSort(Shape[] shapeArray) {
		quickSort(shapeArray, 0, shapeArray.length - 1);
	}

	/**
	 * Quick sort. Sorts the array using the comparator interface
	 *
	 * @param arr        the arr
	 * @param low        the low
	 * @param high       the high
	 * @param comparator the comparator
	 */
	private void quickSort(Shape[] arr, int low, int high, Comparator<Shape> comparator) {
		// As long as the low index is lower then the greatest index
		if (low < high) {

			// Finds the pivot and split into a partition
			int pi = partition(arr, low, high, comparator);

			// Uses Recursion to recall this method to sort the partitions
			quickSort(arr, low, pi - 1, comparator);
			quickSort(arr, pi + 1, high, comparator);
		}
	}

	/**
	 * Partition.
	 *
	 * @param arr        the arr
	 * @param low        the low
	 * @param high       the high
	 * @param comparator the comparator
	 * @return the int
	 */
	private int partition(Shape[] arr, int low, int high, Comparator<Shape> comparator) {

		// Selects the element at the end of the list and assigns it as the pivot
		Shape pivot = arr[high];

		int i = (low - 1);
		
		// Loops through comparing and swapping elements if they are higher or lower than the pivot
		for (int j = low; j <= high - 1; j++) {

			if (comparator.compare(arr[j], pivot) == 100) {

				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}

	/**
	 * Quick sort.
	 *
	 * @param arr  the arr
	 * @param low  the low
	 * @param high the high
	 */
	private void quickSort(Shape[] arr, int low, int high) {
		if (low < high) {

			int pi = partition(arr, low, high);

			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	/**
	 * Partition.
	 *
	 * @param arr  the arr
	 * @param low  the low
	 * @param high the high
	 * @return the int
	 */
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

	/**
	 * Swaps the element with the elements called
	 *
	 * @param arr the arr
	 * @param i   the i
	 * @param j   the j
	 */
	private void swap(Shape[] arr, int i, int j) {
		Shape temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
