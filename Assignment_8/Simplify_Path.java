package Assignment_8;

import java.util.Stack;

public class Simplify_Path {
    public static void main(String[] args) {
        String path = "/home//foo/";
        System.out.println(simplifyPath(path));
    }

    public static String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        for(int i=0;i<path.length();i++){
            int j=i+1;
            while(j<path.length() && path.charAt(j)!='/') j++;
            String p = path.substring(i,j);
               
            if(p.equals("/.") || p.equals("/")){
                i=j-1;
                continue;
            }
            else if(p.equals("/..")){
                if(st.size()>0) st.pop();
            }
            else if(p.equals ("/...")) 
                st.push(p);
            else st.push(p);
         
            i=j-1;
        }

        String ans="";
        while(st.size()>0) ans = st.pop()+ans;
        if(ans.length()==0) ans+="/";
        return ans;
    }
}
