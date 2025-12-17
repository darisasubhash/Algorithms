
import com.BridgeLabz.Sorting.QuickSort;


public class Main {
    public static void main(String[] args) {

        Integer [] ar = {1, 2, 5, 8, 3, 6};
        QuickSort.sort(ar,0,ar.length-1);


        for(int a:ar){
            System.out.println(a);
        }
    }
}