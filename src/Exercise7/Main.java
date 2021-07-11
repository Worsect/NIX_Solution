package Exercise7;

public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int sum = 0;
        //System.out.println(Integer.parseInt(str1.substring(0,1)) + Integer.parseInt(str1.substring(1,2)) + Integer.parseInt(str1.substring(2,3))); // METHOD 1
        while (a!=0) {
            sum += a%10;
            a /= 10;
        }
        System.out.println(sum);
    }
}
