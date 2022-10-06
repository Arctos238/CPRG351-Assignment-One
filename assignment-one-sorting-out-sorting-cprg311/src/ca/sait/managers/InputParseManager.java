package ca.sait.managers;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import ca.sait.shapeDomain.Shape;

/**
 * 
 * Three methods that help manage to parse information and generate the array
 * for application driver
 *
 */
public class InputParseManager {
	private final String[] STRING_ARRAY_FILE_NAMES = { "polyfor1.txt", "polyfor2.txt", "polyfor3.txt" };

	/**
	 * 
	 * @param args the main args from the driver program
	 * @return returns the args parsed
	 * 
	 *         Takes the args that are sent through the main method and parses them
	 *         so that can be read in the main application of the program. If the
	 *         arguments are not in the correct format it will send back a message.
	 */
	public String[] parseArgs(String[] args) {
		String[] parsedArgs = new String[3];

		if (args.length != 3) {
			System.out
					.println("Incorrect amount of arguments, please enter exactly three arguments in the arguments\n");
			return null;
		}
		try {
			for (String arg : args) {
				if (arg.toUpperCase().startsWith("-F")) {
					int indexOfFileName = arg.toUpperCase().indexOf("-F");

					if (indexOfFileName != -1) {
						String parsedFileLocation = arg.substring(2);
						parsedArgs[0] = parsedFileLocation;
					} else {

						System.out.println(
								"Please enter (-f/-F) and correct file path that contains one of theses three file name:\n"
										+ STRING_ARRAY_FILE_NAMES[0] + " or " + STRING_ARRAY_FILE_NAMES[1] + " or "
										+ STRING_ARRAY_FILE_NAMES[2] + "\n");
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
								"Please enter a correct compare type (-t/-T) that is equal to one of theses values:\n"
										+ "v/V (volume) or h/H (height) or a/A (base area)" + "\n");
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
						System.out.println(
								"Please enter a correct sort type (-s/-S) that is equal to one of theses values:\n"
										+ "b/B (Bubble Sort) or s/S (Selection Sort) or i/I (Insertion Sort "
										+ "m/M (Merge Sort) or q/Q (Quick Sort) or z/Z(Heap Sort)" + "\n");
					}
				}
			}
			return parsedArgs;
		} catch (

		StringIndexOutOfBoundsException e) {

		}

		return null;

	}

	/**
	 * 
	 * @param fileName where the location of the file the shape file that needs to
	 *                 be located
	 * @return The shape array filled with all the shapes
	 * 
	 *         Uses reflection to generate each shape based on the type of shape
	 *         string passed in the file and the creates that shape passed on the
	 *         parameters in the file. Then it will put that shape type into a shape
	 *         array.
	 * 
	 */
	public Shape[] loadShapesIntoArray(String fileName) {

		try {
			// removes the quotation marks on the input file

			File file = new File(fileName);
			Scanner fileScanner = new Scanner(file);

			Shape[] shapesArray = new Shape[fileScanner.nextInt()];

			int i = 0;

			while (fileScanner.hasNext()) {

				String className = "ca.sait.shapeDomain." + fileScanner.next();
				Class classType = Class.forName(className);

				Class paramType[] = new Class[2];
				paramType[0] = Double.TYPE;
				paramType[1] = Double.TYPE;

				Constructor constructor = classType.getConstructor(paramType);

				Object argList[] = new Object[2];
				argList[0] = fileScanner.nextDouble();
				argList[1] = fileScanner.nextDouble();

				Shape shape = (Shape) constructor.newInstance(argList);

				shapesArray[i] = shape;
				i++;
			}
			
			fileScanner.close();
			return shapesArray;

		} catch (ClassNotFoundException e) {
			System.out.println("Invalid class. The class name does not exist.");
		} catch (NoSuchMethodException e) {
			System.out.println("Method does not exist.");
		} catch (SecurityException e) {
			e.printStackTrace();
			System.out.println("A call does not have permission to access resource(s).");
		} catch (InstantiationException e) {
			System.out.println("Object cannot be instantiated.");
		} catch (IllegalAccessException e) {
			System.out.println("Method cannot reach the object.");
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid argument.");
		} catch (InvocationTargetException e) {
			System.out.println("Invoked method or constructor");
		} catch (NullPointerException e) {
			System.out.println("Invalid input, please enter an existing file name");
		} catch (Exception e) {
			System.out.println("An exception was caught.");
		}

		return null;
	}
}
