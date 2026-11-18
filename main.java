
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
            String[] ascString = ArraySorter.bubbleSort(InputString, ArraySorter.Order.ASCENDING);
            String[] descString2 = ArraySorter.bubbleSort(InputString, ArraySorter.Order.DESCENDING);
            String[] ascStringselect = ArraySorter.selectionSort(InputString, ArraySorter.Order.ASCENDING);
            String[] descStringselect = ArraySorter.selectionSort(InputString, ArraySorter.Order.DESCENDING);
            String[] ascStringinsert = ArraySorter.selectionSort(InputString, ArraySorter.Order.ASCENDING);
            String[] descStringinsert = ArraySorter.selectionSort(InputString, ArraySorter.Order.DESCENDING);
            System.out.println(Arrays.toString(asc));
            System.out.println(Arrays.toString(asc2));
            System.out.println(Arrays.toString(desc));
            System.out.println(Arrays.toString(desc2));
            System.out.println(Arrays.toString(desc3));
            System.out.println(Arrays.toString(desc4));
            System.out.println(Arrays.toString(ascString));
            System.out.println(Arrays.toString(descString2));
            System.out.println(Arrays.toString(ascStringselect));
            System.out.println(Arrays.toString(descStringselect));
            System.out.println(Arrays.toString(ascStringinsert));
            System.out.println(Arrays.toString(descStringinsert));

        }
    }
