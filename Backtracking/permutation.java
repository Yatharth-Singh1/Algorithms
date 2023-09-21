package Backtracking;

public class permutation {

    public static void perm(String str,String ans){
        if (str.length()==0){
            System.out.println(ans);
            return;
        }
        for (int j=0;j<str.length();j++){
        char ch = str.charAt(j);
        String newSt = str.substring(0, j)+str.substring(j+1);
        perm(newSt,ans+ch);
        }
    }
    
  
    public static void main(String args[]){
        String str = "abc";
        perm(str,"");
    }
}  

