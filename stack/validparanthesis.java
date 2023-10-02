package stack;

import java.util.Stack;

public class validparanthesis {
    public static boolean checkparan(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if (ch=='('|| ch=='{'|| ch=='['){
                st.push(ch);
            }
            else{
                if (st.size()==0){
                    return false;
                }
                if ((st.peek()=='('&&ch==')')||
                    (st.peek()=='{'&&ch=='}')||
                    (st.peek()=='['&&ch==']')){
                        st.pop();
                    }
                else {
                    return false;}
                }
            }
                if (st.size()==0){
                    return true;
                }
                else 
                return false;
        }
    
    public static void main(String args[]){
        String s = "[{{}()}]";
        System.out.println(checkparan(s));

    }
    
}
