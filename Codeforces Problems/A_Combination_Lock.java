import java.util.Scanner;

public class A_Combination_Lock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str1 = sc.nextLine();
        String str2  =sc.nextLine();

        int op = 0;
        for(int i = 0 ; i < n ; i++){
            if(Math.abs((int)str1.charAt(i) - (int)str2.charAt(i))  <= Math.abs(9 - ( (int)str2.charAt(i) >= (int)str1.charAt(i) ? (int)str2.charAt(i) : (int)str1.charAt(i))  + ((int)str2.charAt(i) <= (int)str1.charAt(i) ? (int)str2.charAt(i) : (int)str1.charAt(i) ) + 1)){
                op += Math.abs((int)str1.charAt(i) - (int)str2.charAt(i));
                // System.out.println(op);
            }
            else
                op += Math.abs(9 - ( (int)str2.charAt(i) >= (int)str1.charAt(i) ? (int)str2.charAt(i) : (int)str1.charAt(i))  + ((int)str2.charAt(i) <= (int)str1.charAt(i) ? (int)str2.charAt(i) : (int)str1.charAt(i) ) + 1);
                // System.out.println("  " + op);
        }
        // System.out.println((int)str1.charAt(0) - (int)str2.charAt(0));
        System.out.println(op);
    }    
}
