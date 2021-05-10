public class Write_a_program_to_print_all_permutations_of_a_given_string {
    
    static String swap(String str, int l, int r){
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[l] ;
        charArray[l] = charArray[r];
        charArray[r] = temp;
        return String.valueOf(charArray);
    }

    static void permute(String str, int l ,int r){
        if(l == r ){
            System.out.print(str + " ");
            return;
        }
        for(int i = l ; i <= r ;i++){
            str = swap(str,l,i);
            permute(str, l+1,r);
            str = swap(str,l,i);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        permute(str, 0, str.length()-1);
    }
}