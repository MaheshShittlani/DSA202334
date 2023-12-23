import java.util.Arrays;

public class TestSortUtil {
    public static void main(String[] args) {
        int[] arr = {44,11,85,67,33,10,91,12,45};
        SortUtil.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
