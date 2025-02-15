import java.util.*;

class RemoveAdjacentDuplicates {
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) 
                stack.pop(); 
            else 
                stack.push(c);
        }
        
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) 
            result.append(stack.pop());
        
        return result.reverse().toString(); 
    }

    public static void main(String[] args) {
        String input = "aabbccdde";
        System.out.println("Output: " + removeDuplicates(input)); 
    }
}
