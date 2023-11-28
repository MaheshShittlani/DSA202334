class TestSearching {
    public static void main(String[] args) {
        int[] arr = {33,11,55,66,34,65,76,87,67,90};
        int index = Searching.linearSearch(arr, 25);

        if(index != -1) {
            System.out.println("Item found at position : " + index);
        } else {
            System.out.println("Item not found");
        }
        
    }
}