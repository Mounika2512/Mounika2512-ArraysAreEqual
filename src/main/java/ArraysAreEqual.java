public class ArraysAreEqual {
    /**
     * Check if two arrays are equal to each other. Return true if all of the values in a are
     * identical to the ones in b, and false otherwise.
     *
     * @param a the first array.
     * @param b the second array.
     * @return true if the values of a are equal to the values of b.
     */
    public boolean equal(int[] a, int[] b) {
        // Check for null arrays
        if (a == null || b == null) {
            return false;
        }

        // Check if the arrays have the same length
        if (a.length != b.length) {
            return false;
        }

        // Iterate through each element and compare values
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        // All elements are equal
        return true;
    }

    // Example of how to use the equal method in a test case
    public static void main(String[] args) {
        ArraysAreEqual arrayComparator = new ArraysAreEqual();

        // Test case 1
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};
        boolean result1 = arrayComparator.equal(array1, array2);
        System.out.println("Test case 1: " + result1);  // Output: true

        // Test case 2
        int[] array3 = {1, 2, 3, 4};
        int[] array4 = {1, 2, 3, 5};
        boolean result2 = arrayComparator.equal(array3, array4);
        System.out.println("Test case 2: " + result2);  // Output: false
    }
}
