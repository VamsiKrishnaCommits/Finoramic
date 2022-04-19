public class Solution {
    public int braces(String A) {
   
   Stack<Character> s=new Stack<Character>();
   for(int i=0;i<A.length();i++){

if(A.charAt(i)=='(')
s.add('(');

else if(A.charAt(i)!='(' && A.charAt(i)!=')'){

    if(s.size()>0 && s.peek()=='(' &&  (A.charAt(i)=='+' || A.charAt(i)=='-' || A.charAt(i)=='/'|| A.charAt(i)=='*'))
    s.add('x');

}
else{
if(s.peek()=='(')
return 1;
else{
    s.pop();
    s.pop();
}

}


   }
   
   return 0;
   
    }
}
