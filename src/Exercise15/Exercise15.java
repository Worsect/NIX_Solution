package Exercise15;

public class Exercise15 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 7, 30, 5, 70, 44};
        int n = arr.length - 1;
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[n];
            arr[n] = arr[i];
            arr [i] = temp;
            n--;
        }
        for (int i:arr) {
            System.out.print(i + " ");
        }
    }
}
