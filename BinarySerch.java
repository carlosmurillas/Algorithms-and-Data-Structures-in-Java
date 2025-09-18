package CS210;

public class BinarySerch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(BinarySearch(0, a.length - 1, 5, a)); // Searching for 5
    }

    public static int BinarySearch(int LowerBound, int UpperBound, int SearchKey, int[] a) {
        // Base Case: If bounds are invalid, the element is not found
        if (LowerBound > UpperBound) {
            return -1; // Not found
        }

        // Calculate the middle index
        int middle = (LowerBound + UpperBound) / 2;

        // Check if the middle element is the search key
        if (a[middle] == SearchKey) {
            return a[middle]; // Found, return index
        }

        // If the search key is smaller, search the lower half
        if (a[middle] > SearchKey) {
            return BinarySearch(LowerBound, middle - 1, SearchKey, a);
        }

        // Otherwise, search the upper half
        return BinarySearch(middle + 1, UpperBound, SearchKey, a);
    }
}
