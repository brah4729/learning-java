
    import java.util.Arrays;

    public class main {

        public static void main(String[] args) {
            int[] input = {64, 34, 25, 12, 22, 11, 90, 5};
            int[] data = {5, 2, 9, 1};
            String[] InputString = {"a", "b", "c", "d", "a", "b", "c", "d"};

            int[] asc = ArraySorter.bubbleSort(input, ArraySorter.Order.ASCENDING);
            int[] asc2 = ArraySorter.bubbleSort(input, ArraySorter.Order.DESCENDING);
            int[] desc = ArraySorter.selectionSort(input, ArraySorter.Order.ASCENDING);
            int[] desc2 = ArraySorter.selectionSort(input, ArraySorter.Order.DESCENDING);
            int[] desc3 = ArraySorter.insertionSort(data, ArraySorter.Order.ASCENDING);
            int[] desc4 = ArraySorter.insertionSort(input, ArraySorter.Order.DESCENDING);
            String[] ascString = ArraySorter.stringsort(InputString, ArraySorter.Order.ASCENDING);
            String[] ascString2 = ArraySorter.stringsort(InputString, ArraySorter.Order.DESCENDING);
            System.out.println(Arrays.toString(asc));
            System.out.println(Arrays.toString(asc2));
            System.out.println(Arrays.toString(desc));
            System.out.println(Arrays.toString(desc2));
            System.out.println(Arrays.toString(desc3));
            System.out.println(Arrays.toString(desc4));
            System.out.println(Arrays.toString(ascString));
            System.out.println(Arrays.toString(ascString2));
        }
    }
