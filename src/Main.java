
import com.BridgeLabz.Searching.BinarySearch;
import com.BridgeLabz.Sorting.BubbleSort;
import com.BridgeLabz.Sorting.MergeSort;


public class Main {
    public static void main(String[] args) {

        Integer [] ar = {1, 2, 5, 8, 3, 6};
        MergeSort.sort(ar);


        for(int a:ar){
            System.out.println(a);
        }
    }
}