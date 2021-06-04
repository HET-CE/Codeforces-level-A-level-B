import java.util.Scanner;

public class A_Soroban {

    static void mapping(int n) {
        if (n == 0)
            System.out.println("O-|-OOOO");
        else if (n == 1)
            System.out.println("O-|O-OOO");
        else if (n == 2)
            System.out.println("O-|OO-OO");
        else if (n == 3)
            System.out.println("O-|OOO-O");
        else if (n == 4)
            System.out.println("O-|OOOO-");
        else if (n == 5)
            System.out.println("-O|-OOOO");
        else if (n == 6)
            System.out.println("-O|O-OOO");
        else if (n == 7)
            System.out.println("-O|OO-OO");
        else if (n == 8)
            System.out.println("-O|OOO-O");
        else if (n == 9)
            System.out.println("-O|OOOO-");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int len = Integer.toString(number).length();
        int[] iarray = new int[len];
        for (int index = 0; index < len; index++) {
            iarray[index] = number % 10;
            number /= 10;
        }

        for(int i = 0 ; i < len ; i++){
            mapping(iarray[i]);
        }
    }
}
