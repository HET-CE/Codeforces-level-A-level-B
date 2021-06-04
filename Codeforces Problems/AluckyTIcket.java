import java.util.Scanner;

public class AluckyTIcket {

    static int n;
    static String str;
    static long cn = 0;

    static long helper(long[] num) {
        long sum = 0;
        for(int i = 0 ; i < num.length ; i++)
            sum += num[i];
        // System.out.println(sum);
        return sum;
    }

    static void solve()
{
    String s1 = "";
    String s2 = "";
    for (int i = 0; i < n; i++)
    {
        if (str.charAt(i) != '4' && str.charAt(i) != '7')
        {
            System.out.println("NO");
            return;
        }
    }
    for (int i = 0; i < n / 2; i++)
    {
        s1 = s1 + str.charAt(i);
    }
    // System.out.println(s1 + " " + s1.length() + " ");
    for (int i = (n / 2); i < n; i++)
    {
        s2 = s2 + str.charAt(i);
    }
    // System.out.println(s2 + " " + s2.length() + "\n");

    long[] temp = new long[(n/2)];
    long[] temp2 = new long[(n/2)];

    for(int i = 0 ; i < n / 2 ; i++)
        temp[i] = Long.parseLong(String.valueOf(s1.charAt(i)));

    // int j = n / 2 ;
    for(int i = 0 ; i < n / 2; i++){    
        temp2[i] = Long.parseLong(String.valueOf(s2.charAt(i)));
        // j++;
    }
    if (helper(temp) == helper(temp2))
    {
        System.out.println("YES");
    }
    else
    {
        System.out.println("NO");
    }

    return;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        sc.nextLine();
        str = sc.nextLine();
        solve();
    }
}