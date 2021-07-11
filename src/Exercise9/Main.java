package Exercise9;

public class Main {
    public static void main(String[] args) {
        Fibonachi fib = new Fibonachi();
        System.out.println("Yours number is : " + Integer.parseInt(args[0]));
        fib.methodCalculateFib(Integer.parseInt(args[0]));
    }
}
