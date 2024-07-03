package medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class LetterCombinationsofaPhoneNumber {

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
        helper(digits,"",result);
        return result;
    }

    private static void helper(String digits, String ans, List<String> result) {

        if(digits.isEmpty()){
           // System.out.println(ans);
            result.add(ans);
            return;
        }

        if(digits.length()==0){
            result.clear();
        }

        int digit=digits.charAt(0)-'0';
        int i=(digit-2)*3;
        if(digit>7){
            i=i+1;
        }
        int len=i+3;
        if(digit==7 || digit==9)
            len=len+1;

        for(;i<len;i++){
            char ch=(char) ('a'+i);
            helper(digits.substring(1),ans+ch,result);
        }
    }
}
