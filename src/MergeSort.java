import java.util.Arrays;

public class MergeSort {

    /**
     * Default Constructor
     */
    public MergeSort() {
    }

    void sort(int[] A) {
        if (A.length > 1) {
            int[] B = Arrays.copyOfRange(A, 0, A.length/2);
            int[] C = Arrays.copyOfRange(A, A.length/2, A.length);
            sort(B);
            sort(C);
            merge(B,C,A);
        }
    }

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
                A[k] = C[i];
                i++;
                k++;
            }
        }
    }

    public void printArray(int[] arr)
    {
        int n = arr.length;
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

}
