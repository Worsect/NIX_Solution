package Exercise16;

public class Exercise16 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 2, 30, 5, 70, 44, 30};
        int [] arr1 = new int [arr.length];
        int carr1 = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr [j] == arr [i]) {
                    arr1 [carr1] = arr [i];
                    carr1++;
                }
            }
        }
        for (int i = 0; i < carr1; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
