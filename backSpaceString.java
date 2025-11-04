import java.util.Stack;

public class backSpaceString {
    
}
class Solution {
    public boolean backspaceCompare(String s, String t) {
       Stack<Character> ss=new Stack<>();
       Stack<Character> tt=new Stack<>();
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='#'&&!ss.isEmpty()){
            ss.pop();
        }
        else if(s.charAt(i)!='#'){
            ss.push(s.charAt(i));
        }
       }
       String s1=ss.toString();
       for(int i=0;i<t.length();i++){
        if(t.charAt(i)=='#'&&!tt.isEmpty()){
            tt.pop();
        }
        else if(t.charAt(i)!='#'){
            tt.push(t.charAt(i));
        }
       }
       String s2=tt.toString();
       return ss.equals(tt);
    }
}
class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    private String build(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                sb.append(c);
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }
}
