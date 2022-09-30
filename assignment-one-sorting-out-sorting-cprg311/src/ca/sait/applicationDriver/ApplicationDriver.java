package ca.sait.applicationDriver;

import ca.sait.managers.InputParseManager;
import ca.sait.shapeDomain.Shape;
import ca.sait.utilities.BaseAreaCompare;
import ca.sait.utilities.SortingCollection;
import ca.sait.utilities.VolumeCompare;

/**
 * Main Driver for the program
 * 
 * @author Jacque Pointer, Huy Hoang Pham, Evan Stene, Benmarc Jay Agulto
 * @param Args Three Arguments file name, sort by type and sorting algorithm.
 * @version 28th September 2022
 */
public class ApplicationDriver {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		String fileName = "";
		String compareType = "";
		String sortingType = "";
		long start = 0;
		long stop = 0;

		InputParseManager testingManager = new InputParseManager();

		String[] parsedArgs = testingManager.parseArgs(args);

		try {
			fileName = parsedArgs[0];
			compareType = parsedArgs[1];
			sortingType = parsedArgs[2];
		} catch (NullPointerException ex) {
			System.out.println("Program Teriminated because a wrong value was passed into the arguments");
		}

		// Loads shapes into an array
		Shape[] shapesArray = testingManager.loadShapesIntoArray(fileName);

		// Send through the array to be sorted based on the sort type
		switch (compareType.charAt(0)) {
		case 'A':

			BaseAreaCompare baCompare = new BaseAreaCompare();
			start = System.currentTimeMillis();
			SortingCollection.sort(shapesArray, sortingType, baCompare);
			stop = System.currentTimeMillis();

			for (int i = 0; i < shapesArray.length; i++) {
				if (i == 0 || i % 1000 == 0 || i == shapesArray.length - 1) {
					System.out.println(shapesArray[i].calBaseArea());
				}
			}

			break;

		case 'H':
			start = System.currentTimeMillis();
			SortingCollection.sort(shapesArray, sortingType);
			stop = System.currentTimeMillis();

			for (int i = 0; i < shapesArray.length; i++) {
				if (i == 0 || i % 1000 == 0 || i == shapesArray.length - 1) {
					System.out.println(shapesArray[i].getHeight());
				}
			}

			break;

		case 'V':
			VolumeCompare volumeCompare = new VolumeCompare();
			start = System.currentTimeMillis();
			SortingCollection.sort(shapesArray, sortingType, volumeCompare);
			stop = System.currentTimeMillis();

			for (int i = 0; i < shapesArray.length; i++) {
				if (i == 0 || i % 1000 == 0 || i == shapesArray.length - 1) {
					System.out.println(shapesArray[i].calVolume());
				}
			}

			break;
		}

		// Prints out how long the sort took
		if(shapesArray != null) {
			System.out.println("The sort took " + (stop - start) + "ms");
		}
	}
}
