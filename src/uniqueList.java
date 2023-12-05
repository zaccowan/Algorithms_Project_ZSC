import java.util.Random;

/**
 * Class which stores and generates an array of n unique, random integers.
 * Uses a sequential search to determine uniqueness and java.util.Random to generate random integers.
 * @author Zachary Cowan
 * @version 9/27/2023
 * Fall/2023
 */
public class uniqueList {

    /**
     * Instance of the Random class used to generate a random integer.
     */
    private Random rand = new Random();
    /**
     * Integer array used to store unique, random integers generated by the constructor.
     */
    private int[] uniqueArray;



    /**
     * Constructor that fills uniqueArray with unique, random integers.
     * @param n The number of unique, random integers to generate. Also serves as the upper bound for random generation.
     */
    public uniqueList(int n) {
        //Instantiates uniqueArray with n element.
        uniqueArray = new int[n];
        int RAND_RANGE = Integer.MAX_VALUE;

        //Since the first number element must be unique
        int randNum = rand.nextInt(RAND_RANGE); // generate a random number 1 to Max Integer Size
        uniqueArray[0] = randNum; // insert random unique integer into the array
        int numAppendedToArray = 1; // stores number of unique elements added so far


        // to fill the rest of the array with unique integers:
        // generate a random integer
        // check if the integer already exists in the array
        // if it is unique, append it to the array
        // if it is not unique, generate a new integer and repeat the steps.
        while( numAppendedToArray <= n) {
            randNum = rand.nextInt(RAND_RANGE);
            // assume randNum is not yet in the array
            boolean isInArray = false;

            // Determine if randNum exists in the filled indices of uniqueArray
            for( int i = 0 ; i < numAppendedToArray ; i++) {
                // randNum is present in the unique array, so we do not want to add it again
                if( randNum == uniqueArray[i] ) {
                    isInArray = true;
                }
            }

            // if randNum is not in array yet, add it
            if( !isInArray ) {
                uniqueArray[numAppendedToArray-1] = randNum;
                numAppendedToArray++;
            }
        }// closes while
    }// closes constructor


    /**
     * Get the array which stores random unique integers for the UniqueListCreator class.
     * @return uniqueArray The array which stores random, unique integers
     */
    public int[] getArray() {
        return uniqueArray;
    }

    /**
     * Method used to print formatted representation of all elements in uniqueArray.
     */
    public void printArray() {
        System.out.print("[");
        for(int element: getArray()) {
            System.out.print(element +", ");
        }
        System.out.println("]");
    }




}
