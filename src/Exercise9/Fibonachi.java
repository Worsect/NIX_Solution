package Exercise9;

import Exercise3.StringOutput;

public class Fibonachi {
     void methodCalculateFib (int n) {
        int [] a = {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int num = 3;
         System.out.print(a[0] + " ");
        while ((a[num - 1]+a[num - 2])<n) {
                a[num] = a [num - 1] + a [num - 2];
                System.out.print(a[num] + " ");
                num++;
            }
    }
}
