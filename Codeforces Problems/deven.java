import  java.util.Scanner;
public class deven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        long a25=0,a50=0,a100=0;
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(a[i]==25){
                a25++;
                System.out.println(a25 + "  " + a50 + "  " + a100);
            }
            else if(a[i]==50) {
                if(a25>0){
                    a25--;
                    a50++;
                    System.out.println(a25 + "  " + a50 + "  " + a100);
                }
                else
                    flag=true;
            }
            else if(a[i]==100){

                if(a50>0 && a25>0){
                    a25--;
                    a50--;
                    a100++;
                    System.out.println(a25 + "  " + a50 + "  " + a100);
                }
                else if(a25>3){
                    a25=a25-3;
                    a100++;
                    System.out.println(a25 + "  " + a50 + "  " + a100);
                }
                else
                    flag=true;
            }
        }
        if(flag){
            System.out.println("NO");
        }
        else
            System.out.println("YES");
            sc.close(); }
}
