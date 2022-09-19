package ca.sait.applicationDriver;

import java.util.Collections;

import ca.sait.shapeDomain.Cone;
import ca.sait.shapeDomain.Cylinder;
import ca.sait.shapeDomain.Shape;
import ca.sait.testingApplication.TestingManager;
import ca.sait.utilities.BaseAreaCompare;
import ca.sait.utilities.SortingCollection;
import ca.sait.utilities.VolumeCompare;

public class ApplicationDriver {
	public static void main(String[] args) {
		String fileName = "";
		String compareType = "";
		String sortingType = "";
		long start = 0;
		long stop = 0;

		TestingManager testingManager = new TestingManager();
		String[] parsedArgs = testingManager.parseArgs(args);

		try {
			fileName = parsedArgs[0];
			compareType = parsedArgs[1];
			sortingType = parsedArgs[2];
		} catch (NullPointerException ex) {
			System.out.println("Program Teriminated because a wrong value was passed into the arguments");
		}

		Shape[] shapesArray = testingManager.loadShapesIntoArray(fileName);

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
		

		System.out.println("The sort took " + (stop - start) + "ms");
	}
}
