import com.BridgeLabz.Sorting.BubbleSort;

public class Main {
    public static void main(String[] args) {

        Integer [] ar ={1,20,4,9,7};

        BubbleSort.sort(ar);
        for(int i:ar){
            System.out.println(i+" ");
        }
    }
}