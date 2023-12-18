import java.util.Arrays;

public class TestSortUtil {
    public static void main(String[] args) {
        int[] arr = {44,11,7,9,2,10};
        SortUtil.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
