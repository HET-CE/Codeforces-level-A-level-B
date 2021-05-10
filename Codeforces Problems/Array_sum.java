public class Array_sum {
    
    static int sum(int[] arr, int n){
        if(n == 0){
            return arr[0];
        }
        return arr[n] + sum(arr,n-1);
    }
    public static void main(String[] args) {
        int[] arr ={ 15, 12, 13 ,10};
        System.out.println(sum(arr,arr.length-1));
    }
}
