import com.BridgeLabz.Sorting.BubbleSort;
import com.BridgeLabz.Sorting.SelectionSort;

public class Main {
    public static void main(String[] args) {

        Integer [] ar ={1,2,5,8,3,6};

        SelectionSort.sort(ar);
        for(int i:ar){
            System.out.println(i+" ");
        }
    }
}