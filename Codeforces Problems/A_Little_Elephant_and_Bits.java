import java.util.Scanner;

public class A_Little_Elephant_and_Bits {
    
    static long max = Integer.MIN_VALUE;

    static void btoi(String binaryString){
        
        long decimal=Long.parseLong(binaryString,2);

        if(decimal > max)
            max = decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String binaryString = sc.nextLine();  
        
        for(int i = 0 ; i < binaryString.length() ; i++){
            btoi(binaryString.substring(0, i) + binaryString.substring(i+1));
            // System.out.println(binaryString.substring(0, i) + binaryString.substring(i+1));
        }  
        System.out.println(Long.toBinaryString(max));
        sc.close();}
}
