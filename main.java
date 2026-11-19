import java.util.Arrays;
public class main {

    public static void main(String[] args) {
        int[] input = {64, 34, 25, 12, 22, 11, 90, 5};
        int[] data = {5, 2, 9, 1};
        String[] InputString = {"a", "b", "c", "d", "a", "b", "c", "d", "b", "a"};
        String InputStringNoArray = "fdsfsfcwfdfdfdfdcvcvcvcvcystsdfzfxfffcrxrxrxrxrxrxrxrxrxrxaw";
        int[] asc = IntArrayAndStringSorter.bubbleSort(input, IntArrayAndStringSorter.Order.ASCENDING);
        int[] desc = IntArrayAndStringSorter.bubbleSort(input, IntArrayAndStringSorter.Order.DESCENDING);
        int[] asc2 = IntArrayAndStringSorter.selectionSort(input, IntArrayAndStringSorter.Order.ASCENDING);
        int[] desc2 = IntArrayAndStringSorter.selectionSort(input, IntArrayAndStringSorter.Order.DESCENDING);
        int[] asc3 = IntArrayAndStringSorter.insertionSort(input, IntArrayAndStringSorter.Order.ASCENDING);
        int[] desc3 = IntArrayAndStringSorter.insertionSort(input, IntArrayAndStringSorter.Order.DESCENDING);
        String ascString = IntArrayAndStringSorter.bubbleSort(InputStringNoArray, IntArrayAndStringSorter.Order.ASCENDING);
        String descString = IntArrayAndStringSorter.bubbleSort(InputStringNoArray, IntArrayAndStringSorter.Order.DESCENDING);
        String ascStringSelect = IntArrayAndStringSorter.selectionSort(InputStringNoArray, IntArrayAndStringSorter.Order.ASCENDING);
        String descStringSelect = IntArrayAndStringSorter.selectionSort(InputStringNoArray, IntArrayAndStringSorter.Order.DESCENDING);
        String ascStringInsert = IntArrayAndStringSorter.insertionSort(InputStringNoArray, IntArrayAndStringSorter.Order.ASCENDING);
        String descStringInsert = IntArrayAndStringSorter.insertionSort(InputStringNoArray, IntArrayAndStringSorter.Order.DESCENDING);
        System.out.println(Arrays.toString(asc));
        System.out.println(Arrays.toString(desc));
        System.out.println(Arrays.toString(asc2));
        System.out.println(Arrays.toString(desc2));
        System.out.println(Arrays.toString(asc3));
        System.out.println(Arrays.toString(desc3));
        System.out.println((ascString));
        System.out.println((descString));
        System.out.println((ascStringSelect));
        System.out.println((descStringSelect));
        System.out.println((ascStringInsert));
        System.out.println((descStringInsert));

    }
}
