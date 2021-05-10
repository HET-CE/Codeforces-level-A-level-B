public class power {
    
    static int Power(int a, int e){
        if( e== 0){
            return 1;
        }
        return a * Power(a,e-1);
    }
    public static void main(String[] args) {
        int a = 2 , e = 3;
        System.out.println(Power(a,e));
    }
}
