public class Reverse_array_recursion {
    
    static int temp;
    static int[] reverse(int[] arr, int l, int r){
        if(l>=r){
            return arr;
        }
        temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        return reverse(arr, l+1,r-1);
    }
    public static void main(String[] args) {
        int[] arr = { 15, 12, 13 ,10, 8}; 
        int l = 0;
        int r = arr.length;
    
        arr = reverse(arr, l, r-1);

        for(int i : arr)
         System.out.print(i + " ");
    }

}
