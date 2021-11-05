public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = new int[]{4, 8, 15, 16, 23, 42};
        int[] sequence = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(binarySearch(sequence, sequence.length, 10));
    }

    private static int binarySearch(int[] a, int n, int x) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (x < a[mid])
                high = mid - 1;
            else if (x > a[mid])
                low = mid + 1;
            else return mid;
        }

        return -1;
    }
}
