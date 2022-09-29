package ca.sait.utilities;

import java.util.Comparator;

import ca.sait.shapeDomain.Shape;

public class SortingCollection {
	@SuppressWarnings("unused")
	public static void sort(Shape[] shapeArray, String sortType, Comparator<Shape> comparator) {
		switch (sortType.charAt(0)) {
		case 'B':
			BubbleSort bubbleSort = new BubbleSort(shapeArray, comparator);
			break;
		case 'S':
			SelectionSort selectionSort = new SelectionSort(shapeArray, comparator);
			break;
		case 'I':
			InsertionSort insertionSort = new InsertionSort(shapeArray, comparator);
			break;
		case 'M':
			MergeSort mergeSort = new MergeSort(shapeArray, comparator);
			break;
		case 'Q':
			QuickSort quickSort = new QuickSort(shapeArray, comparator);
			break;
		case 'Z':
			HeapSort heapSort = new HeapSort(shapeArray, comparator);
			break;

		}
	}

	@SuppressWarnings("unused")
	public static void sort(Shape[] shapeArray, String sortType) {
		switch (sortType.charAt(0)) {
		case 'B':
			BubbleSort bubbleSort = new BubbleSort(shapeArray);
			break;
		case 'S':
			SelectionSort selectionSort = new SelectionSort(shapeArray);
			break;
		case 'I':
			InsertionSort insertionSort = new InsertionSort(shapeArray);
			break;
		case 'M':
			MergeSort mergeSort = new MergeSort(shapeArray);
			break;
		case 'Q':
			QuickSort quickSort = new QuickSort(shapeArray);
			break;
		case 'Z':
			HeapSort heapSort = new HeapSort(shapeArray);
			break;

		}
	}

}
