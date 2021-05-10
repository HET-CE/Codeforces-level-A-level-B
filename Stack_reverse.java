import java.util.Stack;

public class Stack_reverse {
    
    static Stack<Integer> st = new Stack<>();

    static void insert_at_bottom(int x){
        if(st.isEmpty())
            st.push(x);
        else{
            int a = st.peek();
            st.pop();
            insert_at_bottom(x);
            st.push(a);
        }
    }

    static void reverse(){
        if(st.size() > 0){
    
            int x = st.peek();
            st.pop();
            reverse();

            insert_at_bottom(x);
        }
    }
    public static void main(String[] args) {
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.print(st);

        reverse();
        System.out.println();

        System.out.print(st);
    }
}
