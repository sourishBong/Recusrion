package subsets;

import java.util.ArrayList;
import java.util.List;

public class DiceRoll {

    public static void main(String[] args) {
        int target=4;
        List<String> ans=diceRoll(target);
        System.out.println(ans);
    }

    private static List<String> diceRoll(int target) {
        List<String> list=new ArrayList<>();
        helper(target,"",list);
        return list;
    }

    private static void helper(int target, String ans, List<String> list) {

        if(target==0) {
            list.add(ans);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            helper(target-i,ans+i,list);
        }
    }
}
