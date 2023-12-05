public class SelectionSort {

    public SelectionSort() {
    }

    public void sort(int[] unsortedArr) {
        int n;
        n = unsortedArr.length;

        for (int i = 0; i < n-1; i++) {
            // Assume the min element is at i
            int min_idx = i;

            // Compare all elements after i to determine the minimum
            for (int j = i + 1; j < n; j++) {
                if (unsortedArr[j] < unsortedArr[min_idx]) {
                    min_idx = j;
                }
            }

            // Swap i with the minimum found
            int temp = unsortedArr[min_idx];
            unsortedArr[min_idx] = unsortedArr[i];
            unsortedArr[i] = temp;
        }

//        if(doPrint) {
//            printArray(unsortedArr);
//        }
    }

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}
