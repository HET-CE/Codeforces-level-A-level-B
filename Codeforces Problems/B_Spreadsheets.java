import java.util.Scanner;

public class B_Spreadsheets {

    static String numtoChar(String str) {
        int p = str.length() - 1;
        while (true) {
            if (str.charAt(p) >= '1' && str.charAt(p) <= '9')
                p--;
            else
                break;
        }

        int row_num = 1;
        while(true){
            if(str.charAt(row_num) >= '1' && str.charAt(row_num) <= '9')
                row_num++;
            else
                break;
        }

        int ans = Integer.parseInt(str.substring(p + 1));
        char z = '@';
        char temp = '@';
        while (ans != 0) {
            if (z != 'Z')
                z++;
            if (z == 'Z') {
                z = '@';
                temp++;
            }
            ans--;
        }
        return String.valueOf(temp + "" + z) + "" + str.substring(1, row_num);
    }

    static String chartoNum(String str) {
        int p = 0;
        while (true) {
            if (str.charAt(p) >= 'A' && str.charAt(p) <= 'Z')
                p++;
            else
                break;
        }
        int row_num = str.length() - 1;
        while (true) {
            if (str.charAt(row_num) >= '1' && str.charAt(row_num) <= '9')
                row_num--;
            else
                break;
        }



        String ans = str.substring(0, p);

        char z = '@';
        char temp = '@';

        int fin = 0;
        while (!ans.equals(String.valueOf(temp + "" + z))) {
            if (z != 'Z')
                z++;
            if (z == 'Z') {
                z = '@';
                temp++;
            }
            fin++;
        }
        return "R" + str.substring(str.length() - (row_num+1)) + "C" + fin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        sc.nextLine();
        String str1;

        for (int i = 0; i < n; i++) {
            str1 = sc.nextLine();
            if ((str1.charAt(0) != 'R')) {
                str1 = chartoNum(str1);
                System.out.println(str1);
            }
            else{
                str1 = numtoChar(str1);
                System.out.println(str1);
            }
        }
        sc.close();}
}
