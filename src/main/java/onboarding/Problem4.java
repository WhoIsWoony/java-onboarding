package onboarding;

public class Problem4 {
    private static char reverseTransferChar(char ascii){
        if((int)'A' <= ascii && ascii <= (int)'Z')
            ascii = (char)((int)'A'+ (int)'Z'- (int)ascii);
        else if((int)'a' <= ascii && ascii <= (int)'z')
            ascii = (char)((int)'a'+ (int)'z'- (int)ascii);
        return ascii;
    }

    private static String wordTransfer(String word){
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < word.length(); i++)
        {
            char ascii = word.charAt(i);
            ascii = reverseTransferChar(ascii);
            answer.append(ascii);
        }
        return answer.toString();
    }
    public static String solution(String word) {
        return wordTransfer(word);
    }
}
