public class ArraySortedCheck {
    public static boolean isSorted(int[] arr) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ascending = false;
            }
            if (arr[i] < arr[i + 1]) {
                descending = false;
            }
        }

        return ascending || descending;
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};

        if (isSorted(array)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
