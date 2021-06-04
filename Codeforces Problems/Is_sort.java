public class Is_sort {
    
    static boolean ans;
    static void sort(int[] arr, int l, int r){
        if(l > r-1){
            ans = true;
            return;
        }
        if(arr[l] > arr[l+1]){
            ans = false;
            return;
        }
        l++;
        sort(arr, l, r);
        return;
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 1};
        sort(arr, 0, arr.length-1);
        System.out.println(ans);
        sc.close();}
}
