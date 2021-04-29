public class MaximumSubarray {
    public static void main(String[] args){
        MaxSubarray(new int[]{34,-50,42,14,-5,86});
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
}
