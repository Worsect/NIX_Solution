package Exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();
//        String [] arrayAnswer;
//        System.out.println("Enter, 2 numbers, and operation with space"); Method with input
//        arrayAnswer = calc.methodSplit(input.nextLine());
//        calc.methodCalculate(Integer.parseInt(arrayAnswer[0]),Integer.parseInt(arrayAnswer[1]),arrayAnswer[2]);
//        calc.methodCalculate(input.nextInt(),input.nextInt(), input.next()); 1-method
        calc.methodCalculate(Integer.parseInt(args[0]), Integer.parseInt(args[1]), args[2]);
    }
}
