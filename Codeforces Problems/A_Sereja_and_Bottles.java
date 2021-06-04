import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class A_Sereja_and_Bottles {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();

        int a,b;
        for(int i = 0; i < n ; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            arr1.add(a);
            s.add(a);
            if(!map.containsKey(a))
                map.put(a, 0);
            arr2.add(b);
        }

        for(int i = 0 ; i < arr2.size() ; i++){
            if(map.containsKey(arr2.get(i)) && arr1.get(i) != arr2.get(i)){
                map.put(arr2.get(i), 1);
            }
        }

        // Iterator mapIterator = map.entrySet().iterator();

        int cn = 0;
        // while(mapIterator.hasNext()){  
        //     Map.Entry mapElement = (Map.Entry)mapIterator.next();
        //     if(mapElemtent.getValue())
        //         cn++;  
        // }
        for(Integer i : map.values()){
            // System.out.println(i);
            if(i == 0){
                cn++;
            }
        }
        System.out.println(cn);
        sc.close();
    }
}
