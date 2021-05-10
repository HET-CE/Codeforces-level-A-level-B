public class Print_all_possible_combinations_of_r_elements_in_a_given_array_of_size_n {
   
    static void solve(int[] arr,int i, int a){
        if(i >= arr.length-1){
            a = a+1;
            return;
        }
        System.out.println(a + " " + arr[i+1]);
        solve(arr, i+1 , a);
        // solve(arr, i , a);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        solve(arr, 0, arr[0]);
    }
}
