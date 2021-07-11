package Exercise4;

public class Calculator {
//    String [] methodSplit (String numbersAndOperation) {
//        return numbersAndOperation.split(" ", 3);
//    }
    void methodCalculate (int firstNumber, int secondNumber, String nameOpertions) {
        switch (nameOpertions) {
            case "sum": {
                System.out.println(firstNumber+secondNumber);
                break;
            }
            case "dec": {
                System.out.println(firstNumber-secondNumber);
                break;
            }
            case "mul": {
                System.out.println(firstNumber*secondNumber);
                break;
            }
            case "div": {
                System.out.println(firstNumber/secondNumber);
                break;
            }
        }
    }
}
