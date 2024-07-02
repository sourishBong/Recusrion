package practise;

//From the given String remove all the 'a' and return
public class ReturnStringWithOutA {

    public static void main(String[] args) {
        String str="baccad";
     //   String ans=removeA(str);
      //  String ans=removeAWithRecursion(str);
      //  String ans=removeAWithRecursion2(str);
        String ans=removeAWithRecursion3(str);
        System.out.println(ans);
    }

    private static String removeAWithRecursion3(String str) {
        if(str.isEmpty())
            return "";

        if(str.charAt(0)=='a'){
            return removeAWithRecursion3(str.substring(1));
        }else{
            return str.charAt(0)+removeAWithRecursion3(str.substring(1));
        }
    }

    private static String removeAWithRecursion2(String str) {
      return helper2(str,"");
    }

    private static String helper2(String str, String result) {
        if(str.isEmpty())
            return result;

        if(str.charAt(0)=='a')
            //when you use a substring with one argument then the string starts from that index
            return helper2(str.substring(1),result);
        else
            return helper2(str.substring(1),result+str.charAt(0));
    }

    // public static String ans="";
    private static String removeAWithRecursion(String str) {
        String ans="";
    return helper(str,0,str.length(),ans);
     //  return ans;
    }

    private static String helper(String str, int i, int length,String ans) {
        if(i>=length)
            return ans;

        if(str.charAt(i)!='a')
            ans=ans+str.charAt(i);

      return helper(str,i+1,length,ans);
    }

    private static String removeA(String str) {
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='a'){
                ans=ans+str.charAt(i);
            }
        }
        return ans;
    }

}
