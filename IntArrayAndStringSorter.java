
/**
 * Provides static sorting methods for {@code int[]} arrays and {@link String} objects
 * using bubble sort, selection sort, insertion sort, and a single-pass variant sort.
 * <p>
 * All array-based sort methods operate on a copy of the input array and return a new
 * sorted array, leaving the original array unchanged. String-based sort methods return
 * a new {@link String} whose characters are sorted by their Unicode char values.
 * <p>
 * This class cannot be instantiated.
 */
public final class IntArrayAndStringSorter {

    /**
     * Specifies the sort order used by the sorting methods in this class.
     */
    public enum Order {
        /**
         * Sort from smallest to largest.
         */
        ASCENDING,
        /**
         * Sort from largest to smallest.
         */
        DESCENDING
    }

    /**
     * Prevents instantiation of this utility class. All methods are static.
     */
    private IntArrayAndStringSorter() {
    }

    /**
     * Sorts a copy of the given array using bubble sort.
     *
     * @param input the array to sort; must not be null
     * @param order ASCENDING or DESCENDING
     * @return a new sorted array; the input array is left unchanged
     */
    public static int[] bubbleSort(int[] input, Order order) {
        //ascending
        int[] data = input.clone();
        if (order == Order.ASCENDING) {
            for (int i = 0; i < data.length - 1; i++) {
                for (int j = 0; j < data.length - i - 1; j++) {
                    if (data[j] > data[j + 1]) {
                        int temp = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = temp;
                    }
                }
            }
        } else if (order == Order.DESCENDING) {
            //descending
            for (int i = 0; i < data.length - 1; i++) {
                for (int j = 0; j < data.length - i - 1; j++) {
                    if (data[j] < data[j + 1]) {
                        int temp = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = temp;
                    }
                }
            }
        }
        return data;
    }

    /**
     * Sorts a copy of the given array using selection sort.
     *
     * @param input the array to sort; must not be null
     * @param order {@link Order#ASCENDING} or {@link Order#DESCENDING}
     * @return a new sorted array; the input array is left unchanged
     * @throws NullPointerException if {@code input} is {@code null}
     */
    public static int[] selectionSort(int[] input, Order order) {
        //ascending
        int[] data = input.clone();
        if (order == Order.ASCENDING) {
            for (int i = 0; i < data.length; i++) {
                int min_index = i;
                for (int j = i + 1; j < data.length; j++) {
                    if (data[j] < data[min_index]) {
                        min_index = j;
                    }
                }
                int min_value = data[min_index];
                // for (int k = min_index; k > i; k--) {
                //     data[k] = data[k - 1];
                // }
                data[min_index] = data[i];
                data[i] = min_value;

            }
        } else if (order == Order.DESCENDING) {
            //descending
            for (int i = 0; i < data.length; i++) {
                int min_index = i;
                for (int j = i + 1; j < data.length; j++) {
                    if (data[j] > data[min_index]) {
                        min_index = j;
                    }
                }
                int min_value = data[min_index];
                data[min_index] = data[i];
                data[i] = min_value;
            }
        }
        return data;
    }

    /**
     * Sorts a copy of the given array using insertion sort.
     *
     * @param input the array to sort; must not be null
     * @param order {@link Order#ASCENDING} or {@link Order#DESCENDING}
     * @return a new sorted array; the input array is left unchanged
     * @throws NullPointerException if {@code input} is {@code null}
     */
    public static int[] insertionSort(int[] input, Order order) {
        int[] data = input.clone();
        if (order == Order.ASCENDING) {
            for (int i = 0; i < data.length; i++) {
                int insert_index = i;
                int current_value = data[i];
                int j = i - 1;

                while (j >= 0 && data[j] > current_value) {
                    data[j + 1] = data[j];
                    insert_index = j;
                    j--;

                }

                data[insert_index] = current_value;

            }
        } else if (order == Order.DESCENDING) {
            for (int i = 0; i < data.length; i++) {
                int insert_index = i;
                int current_value = data[i];
                int j = i - 1;
                
                while (j >= 0 && data[j] < current_value) {
                    data[j + 1] = data[j];
                    insert_index = j;
                    j--;
                }
                
                data[insert_index] = current_value;
            }
        }
        return data;
    }

    /**
     * Returns a new string whose characters are sorted using bubble sort.
     * Sorting is performed on the Unicode char values of the string.
     *
     * @param input the string to sort; must not be null
     * @param order {@link Order#ASCENDING} or {@link Order#DESCENDING}
     * @return a new string with the same characters in sorted order
     * @throws NullPointerException if {@code input} is {@code null}
     */
    public static String bubbleSort(String input, Order order) {
        char[] data = input.toCharArray();
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (order == Order.ASCENDING) {
                    if (data[j] > data[j + 1]) {
                        char temp = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = temp;
                    }
                } else if (order == Order.DESCENDING) {
                    if (data[j] < data[j + 1]) {
                        char temp = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = temp;
                    }
                }
            }
        }
        return new String(data);
    }

    /**
     * Returns a new string whose characters are sorted using selection sort.
     * Sorting is performed on the Unicode char values of the string.
     *
     * @param input the string to sort; must not be null
     * @param order {@link Order#ASCENDING} or {@link Order#DESCENDING}
     * @return a new string with the same characters in sorted order
     * @throws NullPointerException if {@code input} is {@code null}
     */
    public static String selectionSort(String input, Order order) {
        char[] data = input.toCharArray();
        for (int i = 0; i < data.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < data.length; j++) {
                if (order == Order.ASCENDING) {
                    if (data[j] < data[min_index]) {
                        min_index = j;
                    }
                } else if (order == Order.DESCENDING) {
                    if (data[j] > data[min_index]) {
                        min_index = j;
                    }
                }

            }
            char min_value = data[min_index];
            data[min_index] = data[i];
            data[i] = min_value;
        }
        return new String(data);
    }

    /**
     * Returns a new string whose characters are sorted using insertion sort.
     * Sorting is performed on the Unicode char values of the string.
     *
     * @param input the string to sort; must not be null
     * @param order {@link Order#ASCENDING} or {@link Order#DESCENDING}
     * @return a new string with the same characters in sorted order
     * @throws NullPointerException if {@code input} is {@code null}
     */
    public static String insertionSort(String input, Order order) {
        char[] data = input.toCharArray();
        for (int i = 0; i < data.length; i++) {
            int insert_index = i;
            char current_value = data[i];
            int j = i - 1;
            if (order == Order.ASCENDING) {
                while (j >= 0 && data[j] > (current_value)) {
                    data[j + 1] = data[j];
                    insert_index = j;
                    j--;
                }
            } else if (order == Order.DESCENDING) {
                while (j >= 0 && data[j] < (current_value)) {
                    data[j + 1] = data[j];
                    insert_index = j;
                    j--;
                }
            }
            data[insert_index] = current_value;
        }
        return new String(data);
    }
}
