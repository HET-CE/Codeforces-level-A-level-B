import java.util.Scanner;

public class A_Cinema_Line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] clerkbank = {0,0,0};

        int temp, custamount;
        boolean flag = true;
        for(int i = 0 ; i < n ; i++){
            temp = sc.nextInt();
            if(temp == 25){
                clerkbank[0] += temp;
                // System.out.println(clerkbank[0] + "  " + clerkbank[1] + "  " + clerkbank[2]);

            }else{
                custamount = temp - 25;
                if(custamount == 25){
                    if(custamount > clerkbank[0]){
                        System.out.println("NO");
                        flag = false;
                        break;
                    }
                    else{
                        clerkbank[0] = clerkbank[0] - custamount;
                        if(temp == 25) clerkbank[0] += 25;
                        if(temp == 50) clerkbank[1] += 50;
                        if(temp == 100) clerkbank[2] += 100;
                    }
                }
                if(custamount == 50){
                    if(custamount > clerkbank[1]){
                        System.out.println("NO");
                        flag = false;
                        break;
                    }
                    else{
                        clerkbank[1] = clerkbank[1] - custamount;
                        if(temp == 25) clerkbank[0] += 25;
                        if(temp == 50) clerkbank[1] += 50;
                        if(temp == 100) clerkbank[2] += 100;
                    }
                }
                if(custamount == 75){
                    if(custamount > clerkbank[0] + clerkbank[1]){
                        System.out.println("NO");
                        flag = false;
                        break;
                    }
                    else{
                        clerkbank[0] = clerkbank[0] - 25;
                        clerkbank[1] = clerkbank[1] - 50;
                    //     clerkbank[0] = clerkbank[0] + 25;
                    //     clerkbank[1] = clerkbank[1] + 50;
                        if(temp == 25) clerkbank[0] += 25;
                        if(temp == 50) clerkbank[1] += 50;
                        if(temp == 100) clerkbank[2] += 100;
                    }
                }
                if(custamount == 100){
                    if(custamount > clerkbank[2]){
                        System.out.println("NO");
                        flag = false;
                        break;
                    }
                    else{
                        clerkbank[2] = clerkbank[2] - custamount;
                        if(temp == 25) clerkbank[0] += 25;
                        if(temp == 50) clerkbank[1] += 50;
                        if(temp == 100) clerkbank[2] += 100;
                    }
                }
                // System.out.println(clerkbank[0] + "  " + clerkbank[1] + "  " + clerkbank[2]);
            }
        }
        if( flag && (n < 50) && (clerkbank[0] < 0 || clerkbank[1] < 0 || clerkbank[2] < 0)){
            System.out.println("NO");
            flag = false;
        }
        if(flag)
            System.out.println("YES");
    
            sc.close();    }
}
