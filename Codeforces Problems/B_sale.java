import java.util.Scanner;
import java.util.Arrays;

public class B_sale{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		Arrays.sort(arr);

		for(int i = 0; i< m ; i++){
			if(arr[i] <= 0){
				sum += arr[i];
			}
		}

		System.out.println(Math.abs(sum));
	}
 }