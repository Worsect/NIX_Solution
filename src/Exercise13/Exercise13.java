package Exercise13;

public class Exercise13 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 7, 30, 5, 70 ,44};
        int mean = 0, count = 0;
        for (int i: arr) {
            if (i>0) {
                mean+=i;
                count++;
            }
        }
        System.out.println((double)mean/count);
    }
}
