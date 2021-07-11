package Exercise12;

public class Main12 {
    public static void main(String[] args) {
//        int [] arr = new int[100000];
//        for (int i = 0; i < 100000; i++) {
//            arr[i] = (int) (Math.random () * (500-1000) + 1000);
//            System.out.println(arr[i]);
//        }
        int [] arr = {24,13,-1,2,4,70,44} ;

        for (int i = 0; i < arr.length - 1; i++) {
            int temp;
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j]<arr[j-1]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr [j] = temp;
                }
            }

        }
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }
}
