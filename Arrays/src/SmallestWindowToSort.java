public class SmallestWindowToSort {
    public static void main(String[] args){
        SmallestWindow(new int[]{4,3,7,5,2,6,9,1,5});
    }
    public static void SmallestWindow(int[] arr){
        int max = Integer.MIN_VALUE;
        int indexR = 0;
        int min = Integer.MAX_VALUE;
        int indexL = arr.length-1;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<max){
                indexR=i;
            }
        }

        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>min){
                indexL=i;
            }
        }
        System.out.println(indexL+" "+indexR);
    }
}
