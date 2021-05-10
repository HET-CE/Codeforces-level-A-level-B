public class remove_occurance_of_pi {
    
    static String curr = "";
    static void change(String str, int s, int n){
        if(s >= n){
            return;
        }
        if(str.charAt(s) == 'p' && str.charAt(s+1) == 'i'){
            curr = curr + "3.14";
            s = s+2;
        }
        else{
            curr = curr + "" + str.charAt(s);
            s++;
        }
        change(str, s, n);
        return;
    }
    public static void main(String[] args) {
        String str = "pippppiiiipi";
        change(str, 0, str.length()-1);

        for(int i = 0 ; i < curr.length(); i++){
            System.out.print(curr.charAt(i));
        }
    }
}
