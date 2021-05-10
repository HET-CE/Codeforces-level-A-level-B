public class Recursive_bubble_sort{

    static void bubblesort(int[] arr, int l , int r){
        if(r == 1){
            return;
        }
        for(int i = 0 ; i < r-1 ;i++){    
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubblesort(arr, l, r-1);
    }

    public static void main(String args[]){
        int[] arr = {5, 4, 3, 2, 1};
        bubblesort(arr, 0, 5);
        for(int i : arr)
            System.out.print(i + " ");
    }
    
}