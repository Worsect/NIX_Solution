package Exercise11;

public class Triangle {
        void WriteTriangle (String [] args) {
            int a = Integer.parseInt(args [0]);
            int b = 1;
            for (int i = 0; i <= a; i++) {
                System.out.println("");
                for (int j = 0; j < i; j++) {
                    System.out.print(b + " ");
                    b++;
                }
            }
        }
}
