public class ProductArrayWithoutDivision {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5};
        product(arr);
    }
    public static void product(int[] arr){
        int[] prefixArray = new int[arr.length];
        prefixArray[0] = 1;
        int[] suffixArray = new int[arr.length];
        suffixArray[arr.length-1] = 1;
        for(int i=1; i<arr.length; i++){
            prefixArray[i] = arr[i-1]*prefixArray[i-1];
        }
        for(int i=arr.length-2; i>=0; i--){
            suffixArray[i] = arr[i+1]*suffixArray[i+1];
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(prefixArray[i]*suffixArray[i]);
        }
    }
}
