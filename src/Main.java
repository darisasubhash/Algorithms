
import com.BridgeLabz.Searching.BinarySearch;
import com.BridgeLabz.Sorting.BubbleSort;



public class Main {
    public static void main(String[] args) {

        Integer[] ar = {1, 2, 5, 8, 3, 6};
        BubbleSort.sort(ar);

        int a= BinarySearch.search(ar, 2);
        System.out.println(a);
    }
}