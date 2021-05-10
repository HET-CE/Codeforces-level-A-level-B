import java.util.Scanner;

public class Tram {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_stops = sc.nextInt();
        int enter;
        int leave;

        leave = sc.nextInt();
        enter = sc.nextInt();
        int inbus = enter;
        int max = enter;
        for(int i = 1 ; i < no_stops ; i++){
            leave = sc.nextInt();
            enter = sc.nextInt();
            inbus = inbus - leave + enter;

            if(inbus >= max)
                max = inbus;
        }
        System.out.println(max);
    }
}