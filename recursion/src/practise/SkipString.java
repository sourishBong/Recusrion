package practise;

// skip the string apple
public class SkipString {

    public static void main(String[] args) {
        String str="dapplefg";
        String ans=skipApple(str);
        System.out.println(ans);
    }

    private static String skipApple(String str) {
        return helper(str,"");
    }

    private static String helper(String str, String result) {
        if(str.isEmpty())
            return result;

        if(str.startsWith("apple"))
            return helper(str.substring(5),result);
        else
            return helper(str.substring(1),result+str.charAt(0));
    }
}
