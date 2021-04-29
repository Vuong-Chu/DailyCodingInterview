import java.util.*;

public class SmallerCount {
    public static void main(String[] args){
        SmallerArray(new int[]{3,4,9,6,1});
    }
    public static void SmallerArray(int[] arr){
        List<Integer> seen = new LinkedList<>();
        List<Integer> result = new LinkedList<>();
        for(int i=arr.length-1; i>=0; i--){
            int k = bisectLeft(seen,arr[i]);
            result.add(k);
            seen.add(bisectLeft(seen,arr[i]),arr[i]);
        }
        for(int num: result){
            System.out.println(num);
        }
    }
    public static int bisectLeft(List<Integer> a, int key) {
        int idx = Math.min(a.size(), Math.abs(Collections.binarySearch(a, key)));
        while (idx > 0 && a.get(idx - 1) >= key) idx--;
        return idx;
    }
}
