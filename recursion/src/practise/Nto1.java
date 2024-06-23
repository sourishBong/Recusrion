package practise;

public class Nto1 {

    public static void main(String[] args) {

        printBoth(5);
    }

    private static void printRev(int i) {

        if(i<1)
            return;

        System.out.println(i);
        printRev(i-1);
    }

    private static void print(int i) {

        if(i<1)
            return;

        print(i-1);
        System.out.println(i);
    }

    private static void printBoth(int i) {

        if(i==0)
            return;

        System.out.println(i);
        printBoth(i-1);
        System.out.println(i);
    }
}
