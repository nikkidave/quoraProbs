import javax.swing.*;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void maxLenArr(int arr[], int S){
        int k = arr.length; int sum = 0;
        int subArrLen = 0; int endInd = 0;
        Map<Integer, Integer> map = new HashMap< >();
        map.put(0,-1);
        for (int i=0;i<k; i++){
            sum = sum + arr[i];
            if(!map.containsKey(map)){
                map.put(sum, i);
            }
            if(map.containsKey(sum-S) && subArrLen< i-map.get(sum-S)){
                subArrLen = i-map.get(sum-S);
                endInd = i;
            }

        }
        System.out.println(endInd-subArrLen+1 + " " + endInd);
    }

    public static void main(String[] args) {
        int arr[] = {5,6,-5,5,3,5,3,-2,0};
        int sum =8;
        maxLenArr(arr, sum);

    }
}
