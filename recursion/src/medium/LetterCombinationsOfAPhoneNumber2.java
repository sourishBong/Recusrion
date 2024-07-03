package medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber2 {

    public static void main(String[] args) {
        String digits="89";
        List<String> ans=letterCombinations(digits);
        System.out.println(ans);
    }

    private static List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            ArrayList<String> str=new ArrayList<>();
            return str;
        }
        List<String> result=new ArrayList<>();
        String[] phone_map={"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        helper(digits,"",phone_map,result);
        return result;
    }

    private static void helper(String digits, String ans, String[] phone_map, List<String> result) {
        if(digits.isEmpty()){
            result.add(ans);
            return;
        }
        int i=digits.charAt(0)-'2';
        String letters=phone_map[i];

        for(char letter:letters.toCharArray()){
            helper(digits.substring(1),ans+letter,phone_map,result);
        }
    }
}
