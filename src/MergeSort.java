import java.util.Arrays;

/**
 * Merge sort class with sort, merge, and print method.
 * @author Zachary Cowan
 * @version 9/27/2023
 * Fall/2023
 */
public class MergeSort {

    /**
     * Default Constructor
     */
    public MergeSort() {
    }

    /**
     * Method call to sort array using merge sort.
     * Makes recursive calls to sub-arrays.
     * @param A Array to sort
     */
    void sort(int[] A) {
        if (A.length > 1) {
            int[] B = Arrays.copyOfRange(A, 0, A.length / 2);
            int[] C = Arrays.copyOfRange(A, A.length / 2, A.length);
            sort(B);
            sort(C);
            merge(B,C,A);
        }
    }

    /**
     * Merge two sub-arrays B and C into A while sorting correspondingly.
     * @param B Left sub-array to merge
     * @param C Right sub-array to merge
     * @param A Array to merge into
     */
    void merge(int[] B, int[] C, int[] A) {
        int i = 0, j = 0, k = 0;
        int p = B.length, q = C.length;

        while( i < p && j < q) {
            if( B[i] < C[j] ) {
                A[k] = B[i];
                i++;
            } else {
                A[k] = C[j];
                j++;
            }
            k++;
        }

        if( i == p ) {
            while( j < q ) {
                A[k] = C[j];
                j++;
                k++;
            }
        } else {
            while( i < p ) {
                A[k] = B[i];
                i++;
                k++;
            }
        }
    }

    /**
     * Method to print all elements in array.
     * @param arr Array to print
     */
    public void printArray(int[] arr)
    {
        int n = arr.length;
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

}
