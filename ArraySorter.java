
public final class ArraySorter {

    public enum Order {
        ASCENDING, DESCENDING
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

    public static String[] bubbleSort(String[] input, Order order) {
        String[] data = input.clone();
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (order == Order.ASCENDING) {
                    if (data[j].compareTo(data[j + 1]) > 0) {
                        String temp = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = temp;
                    }
                } else if (order == Order.DESCENDING) {
                    if (data[j].compareTo(data[j + 1]) < 0) {
                        String temp = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = temp;
                    }
                }
            }
        }
        return data;
    }

    public static String[] selectionSort(String[] input, Order order) {
        String[] data = input.clone();
        for (int i = 0; i < data.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < data.length; j++) {
                if (order == Order.ASCENDING) {
                    if (data[j].compareTo(data[min_index]) < 0) {
                        min_index = j;
                    }
                } else if (order == Order.DESCENDING) {
                    if (data[j].compareTo(data[min_index]) > 0) {
                        min_index = j;
                    }
                }

            }
            String min_value = data[min_index];
            data[min_index] = data[i];
            data[i] = min_value;
        }
        return data;
    }

    public static String[] insertionSort(String[] input, Order order) {
        String[] data = input.clone();
        for (int i = 0; i < data.length; i++) {
            int insert_index = i;
            String current_value = data[i];
            int j = i - 1;
            if (order == Order.ASCENDING) {
                while (j >= 0 && data[j].compareTo(current_value) > 0) {
                    data[j + 1] = data[j];
                    insert_index = j;
                    j--;
                }
            } else if (order == Order.DESCENDING) {
                while (j >= 0 && data[j].compareTo(current_value) > 0) {
                    data[j + 1] = data[j];
                    insert_index = j;
                    j--;
                }
            }
        }
        return data;
    }

    public static String oneloopSort(String input, Order order) {
        char[] data = input.toCharArray();
        for (int i = 0; i < data.length - 1; i++) {
            if (order == Order.ASCENDING) {
                if (data[i] > data[i + 1]) {
                    char temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                    i = -1;
                }
            } else if (order == Order.DESCENDING) {
                if (data[i] < (data[i + 1])){
                    char temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                    i = -1;
                }
            }
        }
        return new String(data);
    }
}
