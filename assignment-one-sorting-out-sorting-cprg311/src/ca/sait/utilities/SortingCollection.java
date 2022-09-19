package ca.sait.utilities;

import java.util.Comparator;

import ca.sait.shapeDomain.Shape;

public class SortingCollection {
	public static void sort(Shape[] shapeArray, String sortType, Comparator<Shape> comparator) {
		switch (sortType.charAt(0)) {
		case 'B':
			bubbleSort(shapeArray, comparator);
			break;
		case 'S':
			selectionSort(shapeArray, comparator);
			break;
		case 'I':
			insertionSort(shapeArray, comparator);
			break;
		case 'M':
			mergeSort(shapeArray, comparator, 0, shapeArray.length - 1);
			break;
		case 'Q':
			quickSort(shapeArray, comparator, 0, shapeArray.length);
			break;
		case 'Z':
			heapSort(shapeArray, comparator);
			break;

		}
	}

	public static void sort(Shape[] shapeArray, String sortType) {
		switch (sortType.charAt(0)) {
		case 'B':
			bubbleSort(shapeArray);
			break;
		case 'S':
			selectionSort(shapeArray);
			break;
		case 'I':
			insertionSort(shapeArray);
			break;
		case 'M':
			mergeSort(shapeArray, shapeArray.length);
			break;
		case 'Q':
			quickSort(shapeArray, 0, shapeArray.length);
			break;
		case 'Z':
			heapSort(shapeArray);
			break;

		}
	}

	private static void bubbleSort(Shape[] shapeArray, Comparator<Shape> comp) {

		int n = shapeArray.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (comp.compare(shapeArray[j], shapeArray[j + 1]) == -100) {
					Shape temp = shapeArray[j];
					shapeArray[j] = shapeArray[j + 1];
					shapeArray[j + 1] = temp;
				}
			}
		}
	}

	private static void bubbleSort(Shape[] shapeArray) {
		int n = shapeArray.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (shapeArray[j].compareTo(shapeArray[j + 1]) == -1) {
					Shape temp = shapeArray[j];
					shapeArray[j] = shapeArray[j + 1];
					shapeArray[j + 1] = temp;
				}
	}

	private static void insertionSort(Shape[] shapeArray, Comparator<Shape> comparator) {
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

	private static void insertionSort(Shape[] shapeArray) {
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

	private static void mergeSort(Shape[] shapeArray, Comparator<Shape> comparator, int l, int r) {
		
	}


	private static void mergeSort(Shape[] shapeArray, int n) {
		
	}



	private static void quickSort(Shape[] shapeArray, Comparator<Shape> comparator, int low, int high) {
		
	}


	private static void quickSort(Shape[] shapeArray, int low, int high) {
		
	}

	

	private static void selectionSort(Shape[] shapeArray, Comparator<Shape> comparator) {
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

	private static void selectionSort(Shape[] shapeArray) {
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

	private static void heapSort(Shape[] shapeArray, Comparator<Shape> comparator) {
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

	private static void heap(Shape[] shapeArray, int n, int i, Comparator<Shape> comparator) {
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

	private static void heapSort(Shape[] shapeArray) {
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

	private static void heap(Shape[] shapeArray, int n, int i) {
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
