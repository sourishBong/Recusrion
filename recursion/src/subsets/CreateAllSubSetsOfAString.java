package subsets;

import java.util.ArrayList;
import java.util.Collections;

//The Subset pattern takes some elements and remove some elements
//for every character I have two choices- either take it or not take it
//SubSequence is subset of Strings
public class CreateAllSubSetsOfAString {

    //Find all subsets of String abc
    public static void main(String[] args) {
        String str="abc";
     ArrayList<String> ans=findAllSubSets(str);
        System.out.println(ans);
    }

    private static ArrayList<String> findAllSubSets(String str) {
        ArrayList<String> result=new ArrayList<>();
        String ans="";
        helper(result,str,ans);
        Collections.sort(result);
        return result;
    }

    private static void helper(ArrayList<String> result, String str,String ans) {
       // String ans="";
        if(str.isEmpty())
            return;

        helper(result,str.substring(1),ans);
        char ch=str.charAt(0);
        ans=ans+ch;
        result.add(ans);
        helper(result,str.substring(1),ans);
    }
}
