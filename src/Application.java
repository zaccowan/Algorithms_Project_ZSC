import java.util.Arrays;

/**
 * Class used to test code written in the uniqueList package.
 * @author Zachary Cowan
 * @version 9/27/2023
 * Fall/2023
 */
public class Application {

    /**
     * Default constructor to satisfy javadocs.
     */
    public Application() {
    }

    /**
     * Run point for java.
     * @param args Arguments to execute on run.
     */
    public static void main(String [] args) {

        //
        // Creates random unique list using implemented algorithm
        long startCreate = System.nanoTime();
        uniqueList creator = new uniqueList(1000);
        long endCreate = System.nanoTime();
        System.out.println("Random Unique List");
        creator.printArray();
        System.out.println("Computation Time: " + (endCreate - startCreate) / 1000000.0 + "ms");

        System.out.println();

        //
        // Sorts random unique list using selection sort algorithm
        SelectionSort selection = new SelectionSort();
        int[] arrForSelection = Arrays.copyOf(creator.getArray(), creator.getArray().length);
        System.out.println("Selection Sorted:");

        long startSelSort = System.nanoTime();
        selection.sort(arrForSelection);
        long endSelSort = System.nanoTime();

        selection.printArray(arrForSelection);
        System.out.println("Selection Sort Time: " + (endSelSort - startSelSort) / 1000000.0 + "ms");

        System.out.println();

        //
        // Sort random unique list using merge sort algorithm
        MergeSort merge = new MergeSort();
        int[] arrForMerge = Arrays.copyOf(creator.getArray(), creator.getArray().length);

        System.out.println("Merge Sorted:");
        long startMerSort = System.nanoTime();
        merge.sort(arrForMerge);
        long endMerSort = System.nanoTime();

        merge.printArray(arrForMerge);
        System.out.println("Merge Sort Time: " + (endMerSort - startMerSort) / 1000000.0 + "ms");
    }
}
