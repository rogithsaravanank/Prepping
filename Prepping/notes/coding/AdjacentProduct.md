#### Adjacent 
```
import java.util.Stack;

public class Adjacent {

    // This program uses a stack to remove adjacent duplicate characters from a string (str2). 
    //It iterates through the string, pushing characters onto the stack unless the character is the same as the one on top of the stack.
    public static void main(String[] args) {
        String str1="abAAAAAbaBB";
        String str2 ="Chaahch";

        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str2.length();i++){
            if(stack.isEmpty())
            {
                stack.push(str2.charAt(i));
            }
            else{
                if(stack.peek() == str2.charAt(i))
                {
                    stack.pop();
                }
                else {
                    stack.push(str2.charAt(i));
                }
            }
        }
        System.out.println(stack);
    }
}

```