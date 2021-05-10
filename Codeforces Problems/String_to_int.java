public class String_to_int {
    
    static int ans = 0;
    static void convert(String str, int l, int r){
        if(l > r){
            return;
        }
        ans = (ans*10) + Integer.parseInt(String.valueOf(str.charAt(l)));
        l++;
        convert(str, l, r);
        return;
    }
    public static void main(String[] args) {
        String str= "0145";
        convert(str, 0 , str.length()-1);
        System.out.println(ans);
    }
}
