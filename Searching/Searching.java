public class Searching {
    public static int linearSearch(int[] arr, int item) {
        for(int i = 0; i < arr.length; i++) {
            if(item == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int item) {
        int lb = 0;
        int ub = arr.length - 1;

        while(lb <= ub) {
            int mid = (lb + ub) / 2;
            if(item == arr[mid]) {
                return mid;
            } else if(item > arr[mid]) {
                lb = mid + 1;
            } else if(item < arr[mid]) {
                ub = mid - 1;
            }
        }

        return -1;
    }
}
