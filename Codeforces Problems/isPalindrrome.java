public class isPalindrrome {

    static boolean ispal(String str,int l,int r){
        if(l>=r){
            return true;
        }
        if(str.charAt(l) != str.charAt(r)){
            return false;
        }
        return ispal(str, l+1, r-1);
    }
    static void isPalindrome(int num){
        String str = "";
        str = str + num ;
        System.out.println(ispal(str, 0 , str.length()-1));
    }
    public static void main(String[] args) {
        int num = 2001;

        isPalindrome(num);
    }
}
