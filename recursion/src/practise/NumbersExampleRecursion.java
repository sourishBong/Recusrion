package practise;

public class NumbersExampleRecursion {

    public static void main(String[] args) {
        print(1);
    }

    private static void print(int i) {
        if(i>5)
            return;
        System.out.println(i);
        print(i+1);
    }
}
