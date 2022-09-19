package ca.sait.testingApplication;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import ca.sait.shapeDomain.Shape;

public class TestingManager {
	private final String[] STRING_ARRAY_FILE_NAMES = { "polyfor1", "polyfor2", "polyfor3" };


	public String[] parseArgs(String[] args) {
		String[] parsedArgs = new String[3];

		for (String arg : args) {
			if (arg.toUpperCase().startsWith("-F")) {
				int indexOfFileName = arg.indexOf("polyfor");

				if (indexOfFileName != -1) {
					parsedArgs[0] = "res/" + arg.substring(indexOfFileName, (indexOfFileName + 8)) + ".txt";
				} else {
					System.out.println(
							"Please enter a correct file path (-f/-F) that contains one of theses three file name:"
									+ STRING_ARRAY_FILE_NAMES[0] + " or " + STRING_ARRAY_FILE_NAMES[1] + " or "
									+ STRING_ARRAY_FILE_NAMES[2]);
				}

			} else if (arg.toUpperCase().startsWith("-T")) {
				switch (arg.toUpperCase().charAt(2)) {

				case 'A':
					parsedArgs[1] = "A";
					break;
				case 'H':
					parsedArgs[1] = "H";
					break;
				case 'V':
					parsedArgs[1] = "V";
					break;
				default:
					System.out.println(
							"Please enter a correct compare type (-t/-T) that is equal to one of theses values:"
									+ "v/V (volume) or h/H (height) or a/A (base area)");
				}

			} else if (arg.toUpperCase().startsWith("-S")) {
				switch (arg.toUpperCase().charAt(2)) {

				case 'B':
					parsedArgs[2] = "B";
					break;
				case 'S':
					parsedArgs[2] = "S";
					break;
				case 'I':
					parsedArgs[2] = "I";
					break;
				case 'M':
					parsedArgs[2] = "M";
					break;
				case 'Q':
					parsedArgs[2] = "Q";
					break;
				case 'Z':
					parsedArgs[2] = "Z";
					break;
				default:
					System.out.println("Please enter a correct sort type (-s/-S) that is equal to one of theses values:"
							+ "b/B (Bubble Sort) or s/S (Selection Sort) or i/I (Insertion Sort "
							+ "m/M (Merge Sort) or q/Q (Quick Sort) or z/Z(My Choice Sort");
				}
			}
		}
		return parsedArgs;
	}

	/**
	 * This method loads the text file selected into an array of Shapes
	 */
	public Shape[] loadShapesIntoArray(String fileName) {
		try {
			Scanner inputScanner = new Scanner(new FileReader(fileName));

			Shape[] shapesArray = new Shape[inputScanner.nextInt()];

			int i = 0;

			while (inputScanner.hasNext()) {

				String className = "ca.sait.shapeDomain." + inputScanner.next();
				Class classType = Class.forName(className);

				Class paramType[] = new Class[2];
				paramType[0] = Double.TYPE;
				paramType[1] = Double.TYPE;

				Constructor constructor = classType.getConstructor(paramType);

				Object argList[] = new Object[2];
				argList[0] = inputScanner.nextDouble();
				argList[1] = inputScanner.nextDouble();

				Shape shape = (Shape) constructor.newInstance(argList);

				shapesArray[i] = shape;
				i++;
			}
			return shapesArray;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
