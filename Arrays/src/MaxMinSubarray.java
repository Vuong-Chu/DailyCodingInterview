public class MaxMinSubarray {
    public static void main(String[] args){
        MaxSubarray(new int[]{34,-50,42,14,-5,86});
        MinSubarray(new int[]{34,-50,42,-49,14,86});
    }
    //Kadane's Algorithm
    public static void MaxSubarray(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int num: arr){
            sum += num;
            if(sum<0){
                sum = 0;
            }else{
                max = Math.max(sum,max);
            }
        }
        System.out.println(max);
    }

    public static void MinSubarray(int[] arr){
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int num: arr) {
            sum += num;
            if (sum > 0) {
                sum = 0;
            } else {
                min = Math.min(sum, min);
            }
        }
        System.out.println(min);
    }
}
