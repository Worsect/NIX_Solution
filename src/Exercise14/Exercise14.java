package Exercise14;

public class Exercise14 {
    public static void main(String[] args) {
        int [] arr = {24, 13, -1, 2, 4, 70, 44};
        int min = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if(max<arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("min = " + min + ", max = " + max);
    }
}
