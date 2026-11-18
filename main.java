
    import java.util.Arrays;

    public class main {

        public static void main(String[] args) {
            int[] input = {64, 34, 25, 12, 22, 11, 90, 5};
            int[] data = {5, 2, 9, 1};
            String[] InputString = {"a", "b", "c", "d", "a", "b", "c", "d", "b", "a"};

            int[] asc = ArraySorter.bubbleSort(input, ArraySorter.Order.ASCENDING);
            int[] desc = ArraySorter.bubbleSort(input, ArraySorter.Order.DESCENDING);
            int[] asc2 = ArraySorter.selectionSort(input, ArraySorter.Order.ASCENDING);
            int[] desc2 = ArraySorter.selectionSort(input, ArraySorter.Order.DESCENDING);
            int[] asc3 = ArraySorter.insertionSort(data, ArraySorter.Order.ASCENDING);
            int[] desc3 = ArraySorter.insertionSort(input, ArraySorter.Order.DESCENDING);
            String[] ascString = ArraySorter.bubbleSort(InputString, ArraySorter.Order.ASCENDING);
            String[] descString = ArraySorter.bubbleSort(InputString, ArraySorter.Order.DESCENDING);
            String[] ascStringSelect = ArraySorter.selectionSort(InputString, ArraySorter.Order.ASCENDING);
            String[] descStringSelect = ArraySorter.selectionSort(InputString, ArraySorter.Order.DESCENDING);
            String[] ascStringInsert = ArraySorter.insertionSort(InputString, ArraySorter.Order.ASCENDING);
            String[] descStringInsert = ArraySorter.insertionSort(InputString, ArraySorter.Order.DESCENDING);
            String[] ascStringOneLoop = ArraySorter.oneloopSort(InputString, ArraySorter.Order.ASCENDING);
            String[] descStringOneLoop = ArraySorter.oneloopSort(InputString, ArraySorter.Order.DESCENDING);
            System.out.println(Arrays.toString(asc));
            System.out.println(Arrays.toString(desc));
            System.out.println(Arrays.toString(asc2));
            System.out.println(Arrays.toString(desc2));
            System.out.println(Arrays.toString(asc3));
            System.out.println(Arrays.toString(desc3));
            System.out.println(Arrays.toString(ascString));
            System.out.println(Arrays.toString(descString));
            System.out.println(Arrays.toString(ascStringSelect));
            System.out.println(Arrays.toString(descStringSelect));
            System.out.println(Arrays.toString(ascStringInsert));
            System.out.println(Arrays.toString(descStringInsert));
            System.out.println(Arrays.toString(ascStringOneLoop));
            System.out.println(Arrays.toString(descStringOneLoop));

        }
    }
