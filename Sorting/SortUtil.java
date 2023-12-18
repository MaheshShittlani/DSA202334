public class SortUtil {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        int t;
        for(int i = 0; i < n - 1; i++) { 
            for(int j = i + 1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int t;

        for(int i = 1; i < n; i++) {
            for(int j = 0; j < n - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;  
                }
            }
        }
    }

    public static void bubbleSortV2(int[] arr) {
        int n = arr.length;
        int t;
        boolean isSwap = true;

        for(int i = 1; isSwap && i < n; i++) {
            isSwap = false;
            for(int j = 0; j < n - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    isSwap = true;  
                }
            }
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        int i;
        int item; 
    
        for(int j = 1; j < n; j++) {
            item = arr[j];
            /* Shifting */
            for(i = j - 1 ; i >= 0 && arr[i] > item; i--) {
                arr[i + 1] = arr[i];
            }
            /* Insertion */
            arr[i + 1] = item;
        }
    }
}
