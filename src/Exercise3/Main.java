package Exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        Scanner input = new Scanner(System.in);
        StringOutput S = new StringOutput();
        System.out.println("Enter yours name and surname");
        String nameSurname = input.nextLine();*/
        StringOutput S = new StringOutput();
        String nameSurname = String.join(" ", args);
        S.methodSplitString(nameSurname);
    }
}
