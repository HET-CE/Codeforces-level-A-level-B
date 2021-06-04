import java.util.Scanner;

public class A_IQ_Test {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] str1 = new String[4];

        for(int i = 0 ; i < 4 ; i++){
            str1[i] = sc.nextLine();
            // sc.nextLine();
        }

        String str;
        char[][] arr = new char[4][4];

        for(int i = 0 ; i < 4 ; i++){
            str = str1[i];
            for(int j = 0 ; j < 4 ; j++){
                arr[i][j] = str.charAt(j);
            }
        }



        boolean flag = true;
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                if(arr[i][j] == '.'){
                    if(flag && ((arr[i+1][j] == '.' && arr[i][j+1] == '.') || (arr[i+1][j] == '.' && arr[i+1][j+1] == '.') || (arr[i][j+1] == '.' && arr[i+1][j+1] == '.'))){
                        flag = false;
                        System.out.println("YES");
                        break;
                    }               
                    if(flag && ((arr[i+1][j] == '#' && arr[i][j+1] == '#' && arr[i+1][j+1] == '#'))){
                        flag = false;
                        System.out.println("YES");
                        break;
                    }
                }
                if(arr[i][j] == '#'){
                    if(flag && ((arr[i+1][j] == '#' && arr[i][j+1] == '#') || (arr[i+1][j] == '#' && arr[i+1][j+1] == '#') || (arr[i][j+1] == '#' && arr[i+1][j+1] == '#'))){
                        flag = false;
                        System.out.println("YES");
                        break;
                    }  
                    if(flag && ((arr[i+1][j] == '.' && arr[i][j+1] == '.' && arr[i+1][j+1] == '.'))){
                        flag = false;
                        System.out.println("YES");
                        break;
                    }                   
                }
            }
        }
        if(flag)
            System.out.println("NO");
        

            sc.close();  }
}
