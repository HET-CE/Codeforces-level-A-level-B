public class subsequence_of_string {
    
    static String curr = "";
    static void permu(String str, int i, String curr){
        if(i == str.length()){
            System.out.print(curr + " ");
            return;
        }
        permu(str, i+1, curr + str.charAt(i));
        permu(str, i+1, curr);
    }

    public static void main(String[] args){
        String str ="ABC";
        String curr= "";
        permu(str, 0, curr);

    }
}
