package onboarding;

import java.util.Stack;

public class Problem2 {
    private static Stack<Character> reduceStringByStack(String cryptogram){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < cryptogram.length(); i++){
            if(!stack.empty() && stack.peek() == cryptogram.charAt(i))
                stack.pop();
            else
                stack.push(cryptogram.charAt(i));
        }
        return stack;
    }

    private static String stackToString(Stack<Character> stack){
        StringBuilder answer = new StringBuilder();
        for (Character character : stack) answer.append(character.toString());
        return answer.toString();
    }

    public static String solution(String cryptogram) {
        Stack<Character> stack = reduceStringByStack(cryptogram);
        return stackToString(stack);
    }
}
