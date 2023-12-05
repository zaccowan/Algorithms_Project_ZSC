/**
 * Selection sort class with sort and print method.
 * @author Zachary Cowan
 * @version 9/27/2023
 * Fall/2023
 */
public class SelectionSort {

    /**
     * Default Constructor
     */
    public SelectionSort() {
    }

    /**
     * Sorts array using selection sort algorithm.
     * @param array Array to sort.
     */
    public void sort(int[] array) {
        int n;
        n = array.length;

        for (int i = 0; i < n-1; i++) {
            // Assume the min element is at i
            int minIndex = i;

            // Compare all elements after i to determine the minimum
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap i with the minimum found
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

    }
    /**
     * Method to print all elements in array.
     * @param array Array to print
     */
    public void printArray(int[] array) {
        int n = array.length;
        for (int j : array) System.out.print(j + " ");
        System.out.println();
    }
}
