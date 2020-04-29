import java.util.*;
public class ValidParentheses {
	public boolean isValid(String s) {
        char[] c=s.toCharArray();
        if(c.length==1) return false;
        else if(c.length==0) return true;
        else if(Arrays.asList(')',']','}').contains(c[0])) return false;
        else{
            ArrayList<Character> al=new ArrayList<>();
            for(char ch:c){
                int top=0;
                if(al.size()==0){
                    top=0;
                }else{
                    top=al.size()-1;
                }
                if(al.size()!=0){
                    if(ch==')'){
                    if(al.get(top)=='(') al.remove(top);
                    else al.add(')');
                }
                else if(ch==']'){
                    if(al.get(top)=='[') al.remove(top);
                    else al.add(']');
                }
                else if(ch=='}'){
                    if(al.get(top)=='{') al.remove(top);
                    else al.add('}');
                }
                else{
                    al.add(ch);
                }
                }else{
                    al.add(ch);
                }
            }
            if(al.size()==0) return true;
            else return false;
        }
        }
	public static void main(String[] args) {
		ValidParentheses vp=new ValidParentheses();
		System.out.println(vp.isValid("()[]{}"));
		System.out.println(vp.isValid("([(]{}"));
		System.out.println(vp.isValid("(]{[]"));
		System.out.println(vp.isValid("()"));
	}

}
