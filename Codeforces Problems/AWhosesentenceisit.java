import java.util.Scanner;
public class AWhosesentenceisit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        sc.nextLine();
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextLine();
        }
        for(int i = 0 ; i < n ; i++){
            if(arr[i].startsWith("miao.") && arr[i].endsWith("lala.") || (!arr[i].startsWith("miao.") && !arr[i].endsWith("lala."))){
                System.out.println("OMG>.< I don't know!");
            }
            else if(arr[i].startsWith("miao.")){
                System.out.println("Rainbow's");
            }
            else if(arr[i].endsWith("lala.")){
                System.out.println("Freda's");
            }
        }
    }
}