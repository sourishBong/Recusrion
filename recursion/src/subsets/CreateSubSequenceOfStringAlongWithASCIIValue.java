package subsets;

import java.util.ArrayList;
import java.util.Collections;

public class CreateSubSequenceOfStringAlongWithASCIIValue {

    public static void main(String[] args) {
        String str="abc";
        ArrayList<String> ans=findAllSubSequenceWithASCIIValue(str);
        System.out.println(ans);
    }

    private static ArrayList<String> findAllSubSequenceWithASCIIValue(String str) {
        ArrayList<String> result=new ArrayList<>();
        helper(str,"","",result);
        Collections.sort(result);
        return result;
    }

    private static void helper(String str, String ans,String asciiString, ArrayList<String> result) {
        if(str.isEmpty()){
            return;
        }

        helper(str.substring(1),ans,asciiString,result);
        char ch=str.charAt(0);
        ans=ans+ch;
        result.add(ans);
        helper(str.substring(1),ans,asciiString,result);
        ans=ans+(ch+0);
        result.add(ans);
        helper(str.substring(1),ans,asciiString,result);
    }
}
