import com.BridgeLabz.Sorting.BubbleSort;
import com.BridgeLabz.Sorting.InsertionSort;

public class Main {
    public static void main(String[] args) {

        String [] ar ={"1","20","8","6","11"};

        InsertionSort.sort(ar);
        for(String i:ar){
            System.out.println(i+" ");
        }
    }
}