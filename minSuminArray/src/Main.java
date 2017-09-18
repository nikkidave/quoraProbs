//https://techiedelight.quora.com/500-Data-Structures-and-Algorithms-practice-problems-and-their-solutions?share=1

import java.util.ArrayList;
import  java.util.Map;
import java.util.HashMap;

public class Main {
    private static void insert(Map<Integer, ArrayList> hashMap,
                               Integer key, Integer value)
    {
        if (hashMap.containsKey(key))
            hashMap.get(key).add(value);
        else
        {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(value);

            hashMap.put(key, list);
        }
    }
    public static void printSubArr(int arr[])
    {
        int n = arr.length;
        Map<Integer, ArrayList> hashMap = new
                HashMap<Integer, ArrayList>();
        insert(hashMap, 0, -1);

        int sum = 0;

        for (int i = 0; i < n; i++)
        {
            sum += arr[i];
            if (hashMap.containsKey(sum))
            {
                ArrayList<Integer> list = hashMap.get(sum);
                for (Integer value: list) {
                    System.out.println("Subarr [" + (value + 1) + ".." +
                            i + "]");
                }
            }
            insert(hashMap, sum, i);
        }
    }
    public static void main (String[] args)
    {
        int A[] = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };

        printSubArr(A);
    }


}
