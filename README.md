# CPRG351-Assignment-One
The purpose of this program is to sort a large number of different shapes into a ordered list of shapes that are ordered from largest to smallest in descending 
order. This task will be done using a variety of searching algorithms, with that list consisting of the following search algorithms.
•	Bubble Sort
•	Insertion Sort
•	Selection Sort
•	Merge Sort
•	Quick Sort
•	Heap Sort
These algorithms all have different running times and will print out the results of the algorithm that the user has chosen to them once the program 
hits the end of the array. The time will be recorded in milliseconds. If for some reason the program throughs a NullPointer Error or a StringIndexOutOfBounds 
Error the program will respond with preprogrammed error messages for the user.

Instructions.
Once the program has been downloaded form the internet and unzipped, the user will 
1.	Open up the IDE of their choice (this example will done through Netbeans)
2.	The user will then press the file button in the top left hand corner and navigate their mouse down to “import project”
3.	Once the user clicks on import press “From Zip”
4.	The user must then click on the “Browse” button and navigate to the directory where the user has stored the zipped file.
5.	Select the zipped file and press import. 
6.	The file will appear on the left hand side of the screen you will then click on the file
7.	Once you have opened the file go to the tool bar where you will press the button with a  hammer and a broom on it, once you have done that open your command prompt
8.	You will then change your directory over to Program Files\Apache NetBeans\jdk\bin 
9.	When that is done you will be able to input parameters to tell the program how to behave all within the same line
10.	First you will input -f and with no space the name of the file that you are working with
11.	Second you will input -t and then with no spaces the type of type in which you wish to compare, weather that h for height, a for area, and v for volume
12.	Third you will input -s and then with no space type of sorting algorithm that you wish to use (options are b, I, s, m, q, h)
13.	After you have written everything out the command should look something like this 
a.	java -jar sort.jar -fpolyfor1.txt -Tv -Sb
Once the user has chosen how they want the code to be run, the program will give the user the time that it took for the code to run in milliseconds, 
as well as the first and last value along with the value at the 1000th index, and sort all the numbers into a list from largest to smallest (in descending order). 
Each time will vary depending on the algorithm that has been chosen as their time complexity will vary from the best algorithm taking O(nLogn) to as high as O(n¬¬2). 
The program will also do a myriad of calculation to get either the volume, height or area before they are sorted. Once the program has run the user will be free to 
enter in a new separate command and repeat the process over again.

