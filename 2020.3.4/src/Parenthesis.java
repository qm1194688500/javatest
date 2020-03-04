import java.util.*;

public class Parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(chkParenthesis(string,string.length()));
    }
    public static boolean chkParenthesis(String A, int n) {
        // write code here
        if (n%2!=0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <A.length() ; i++) {
            if (A.charAt(i)=='('){
                stack.push(A.charAt(i));
            }else if (A.charAt(i)==')'){
                if (stack.empty()){
                    return false;
                }else{
                    stack.pop();
                }
            }else{
                return false;
            }
        }
        if (!stack.empty()){
            return false;
        }else{
            return true;
        }
    }
}