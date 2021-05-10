public class binary_search {
    
    static int pos = -1;
    static void b_search(int[] arr, int l , int mid, int r, int ele){
        if(l > r){
            return;
        }
        if(arr[mid] == ele){
            pos = mid;
            return;
        }
        else if(arr[mid] < ele){
            l = mid + 1;
            mid = (l+r)/2;
            b_search(arr, l, mid, r, ele);
        }
        else if(arr[mid] > ele){
            r = mid-1;
            mid = (l+r)/2;
            b_search(arr, l, mid, r, ele);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int ele = 8;
        b_search(arr, 0, 2, arr.length-1, ele);
        System.out.println("At index "+ pos);
    }
}
