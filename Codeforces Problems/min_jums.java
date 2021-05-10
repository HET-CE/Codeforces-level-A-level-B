public class min_jums {
    
    static int cn = 0;
    static void minJumps(int[] arr, int l, int r){
        if(l+arr[l] == 0){
            return;
        }
        if( l >= r){
            cn++;
            return;
        }
        cn++;
        minJumps(arr, l+arr[l], r);
    }
    public static void main(String[] args) {
        // int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        // int arr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        // int arr[] = { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5 };
        int arr[] = { 0, 2, 6, 1, 2, 9 };

        minJumps(arr,0,arr.length-1);
        System.out.println(cn-1);
    }
}
