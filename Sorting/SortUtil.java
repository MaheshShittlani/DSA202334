import java.util.Arrays;

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

    public static void quickSort(int[] arr, int lb, int ub) {
      if(lb >= ub) {
        return;
      }
      int partitionIndex  = partition(arr, lb, ub); 
      quickSort(arr, lb, partitionIndex - 1);
      quickSort(arr, partitionIndex + 1, ub);
    }

    public static int partition(int[] arr, int lb, int ub) {
        int low = lb;
        int high = ub;
        int pivot = arr[lb];//mediun value of three

        while(low <= high) {
            while(low <= high && arr[low] <= pivot) {
                low++;
            }

            while(low <= high && arr[high] > pivot) {
                high--;
            }

            if(low < high) {
                int t = arr[low];
                arr[low] = arr[high];
                arr[high] = t;
            }
        }

        // swap arr[lb], arr[high]
        arr[lb] = arr[high];
        arr[high] = pivot;
        
        return high;
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if(n > 1) {
           int mid = n / 2;
           int[] leftArray = new int[mid];
           int[] rightArray = new int[n - mid];
           
           System.arraycopy(arr, 0, leftArray, 0, mid);
           System.arraycopy(arr, mid, rightArray, 0, n - mid);
           
           mergeSort(leftArray);
           mergeSort(rightArray);

           merge(leftArray, rightArray, arr);
        }
    }

    public static void merge(int[] a, int[] b, int[] c) {
        int n1 = a.length;
        int n2 = b.length;
        int i,j,k;
        for(i = 0, j = 0, k = 0; i < n1 && j < n2; k++) {
            if(a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
        }

        /* Remaining of array-1 */
        while(i < n1) {
            c[k] = a[i];
            k++; i++;
        }

        /* Remaining of array-2 */
        while(j < n2) {
            c[k] = b[j];
            k++; j++;
        }
    }
}
