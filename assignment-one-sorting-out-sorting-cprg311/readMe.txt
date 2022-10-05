The purpose of this program is to sort a large number of different shapes into a ordered list of shapes that are ordered from largest to smallest in descending order. 
This task will be done using a variety of searching algorithms, with that list consisting of the following search algorithms.

•	Bubble Sort
•	Insertion Sort
•	Selection Sort
•	Merge Sort
•	Quick Sort
•	Heap Sort

These algorithms all have different running times and will print out the results of the algorithm that the user has chosen to them once the program hits the end of the array. 
The time will be recorded in milliseconds. If incorrect arguments are inputed into the system it will return an error message to the user informing them of what went wrong and
how to correctly input the arguments.

Instructions.
Once the program has been downloaded form the internet and unzipped, the user will 

	1. Open the the command line
	2. Type the command "java -jar" followed by the file location of the jar file ie. "java -jar C:/CPRG311/Sort.jar"
	3. Followed by the follow three comands in any order 
		a.Input -f/F and with no spaces the name of the file location that you are working with ie. "-fc:/temp/polyfor1.txt" .
		b.Input -t/T and then with no spaces the type in which you wish to compare, h/H for height, a/A for area, and v/V for volume ie. "-ta" "-tV".
		c.Input -s/S and then with no spaces the type of sorting algorithm that you wish to use options are b/B (Bubble Sort), i/I (Insertion Sort), s/S (Selection Sort), 
		  m/M (Merge Sort), q/Q (Quick Sort), z/Z (Heap Sort) ie. "-Sz" "-sB".
	4. Once this has been complete it should look similar to this "-fres/polyfor3.txt -sB -Th".
	5. Press enter and the program will run.

Once the user has chosen how they want the code to be run, the program will give the user the time that it took for the code to run in milliseconds, as well as the first and last 
value along with the value at the 1000th index, and sort all the numbers into a list from largest to smallest (in descending order). Each time will vary depending on the algorithm 
that has been chosen as their time complexity will vary from the best algorithm taking O(nLogn) to as high as O(n^2). The program will also do a myriad of calculation to get either 
the volume, height or area before they are sorted. Once the program has run the user can change the arguments and perform another calculation.

