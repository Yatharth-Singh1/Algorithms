package stack;

import java.util.Stack;

public class duplicateparanthesis {
     public static boolean checkdupliparan(String s){
        Stack<Character> st = new Stack<>();
        int count=0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if (ch==')'){
                count = 0;
                if (st.size()==0){
                    return true;
                }
                while(st.peek()!='('){
                    st.pop();
                    count++;
                }
                st.pop();
            
            if (count==0){
                return true;
            }
        }
        
            else{
                st.push(ch);
            }
        }
        return false;
        }
    
    public static void main(String args[]){
        String s = "(a((+(a+b))))";
        if (!checkdupliparan(s)){
        System.out.println(s+" is valid");
        }
        else
        System.out.println(s+" is not valid");

    }
    
}
