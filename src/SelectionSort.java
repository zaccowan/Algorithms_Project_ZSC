public class SelectionSort {

    public SelectionSort() {
    }

    public void sort(int[] unsortedArr) {
        int n;
        n = unsortedArr.length;

        for (int i = 0; i < n-2; i++) {
            // Assume the min element is at i
            int minIndex = i;

            // Compare all elements after i to determine the minimum
            for (int j = i + 1; j < n; j++) {
                if (unsortedArr[j] < unsortedArr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap i with the minimum found
            int temp = unsortedArr[minIndex];
            unsortedArr[i] = unsortedArr[minIndex];
            unsortedArr[minIndex] = temp;
        }

    }

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}
