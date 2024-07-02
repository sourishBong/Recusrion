package subsets;

import java.util.ArrayList;

public class PermutationString {

    public static void main(String[] args) {
        String str="abc";
        ArrayList<String> ans=permutations(str);
        System.out.println(ans);
    }

    private static ArrayList<String> permutations(String str) {
        ArrayList<String> result=new ArrayList<>();
        helper(str,"",result);
        return result;
    }

    private static void helper(String str, String ans, ArrayList<String> result) {
        if(str.isEmpty()) {
            //System.out.println(ans);
            result.add(ans);
            return;
        }

        char ch = str.charAt(0);
        for(int i=0;i<=ans.length();i++) {
            String first=ans.substring(0,i);
            String second=ans.substring(i,ans.length());
          //   ans=ans.substring(0,i) + ch + ans.substring(i,ans.length());
            helper(str.substring(1),first+ch+second , result);
        }

    }
}
