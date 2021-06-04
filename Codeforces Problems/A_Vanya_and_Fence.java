import java.util.Scanner;

public class A_Vanya_and_Fence{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		
		int ans = 0,temp;
		for(int i = 0 ; i < n ; i++){
			temp = sc.nextInt();
			if(temp > h)
				ans += 2;
			else
				ans += 1;
		}
		System.out.println(ans);
		sc.close();}
}