import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class SciCalculator {

    public static void menu(){

        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("0. Exit Program");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Logarithm");
        System.out.println("7. Display Average");
        System.out.println("");

    }                                   // Method that provides calculator menu

    public static void main(String[] args) {
        int menuSelection = 1;                      //lots of obvious variables
        double operand1;
        double userInput;
        double operand2;
        double additionResult;
        double subtractionResult;
        double multiplicationResult;
        double divisionresult;
        double exponentiationResult;
        double logarithmResult;
        double currentResult = 0.0;
        double sumOfCalcs = 0.0;        //number of calculations
        int numOfCalcs = 0;             //sum of calculations
        DecimalFormat twoDecimals = new DecimalFormat("##0.0#");        //allows for rounding two decimal places and to always show at least one decimal space even if 0. if 0.#, shows the "0.".
        Scanner input = new Scanner(System.in);


        System.out.println("Current Result: " + currentResult + '\n');
        menu();

        while (menuSelection != 0) {                        // exits program if user enters 0

            System.out.print("Enter Menu Selection: ");
            menuSelection = input.nextInt();

            if (menuSelection == 0) {                       //what happens if user enters 0
                System.out.println("");
                System.out.println("Thanks for using this calculator. Goodbye!");
                break;
            }
            else if (menuSelection > 0 && menuSelection <7) {       //user inputs 1-7: operations
                switch (menuSelection) {
                    case 1:
                        System.out.print("Enter first operand: ");
                        userInput = input.nextDouble();
                        operand1 = userInput;
                        System.out.print("Enter second operand: ");
                        userInput = input.nextDouble();
                        operand2 = userInput;
                        System.out.println("");
                        additionResult = (operand1 + operand2);
                        System.out.println("Current Result: " + twoDecimals.format(additionResult));
                        System.out.println("");
                        numOfCalcs += 1;                            //adds one to number of calculations
                        sumOfCalcs = sumOfCalcs + additionResult;  //adds the result to the sum of operations
                        menu();                                    //shows menu
                        break;
                    case 2:
                        System.out.print("Enter first operand: ");
                        userInput = input.nextDouble();
                        operand1 = userInput;
                        System.out.print("Enter second operand: ");
                        userInput = input.nextDouble();
                        operand2 = userInput;
                        System.out.println("");
                        subtractionResult = (operand1 - operand2);
                        System.out.println("Current Result: " + twoDecimals.format(subtractionResult));
                        System.out.println("");
                        numOfCalcs += 1;
                        sumOfCalcs = sumOfCalcs + subtractionResult;
                        menu();
                        break;
                    case 3:
                        System.out.print("Enter first operand: ");
                        userInput = input.nextDouble();
                        operand1 = userInput;
                        System.out.print("Enter second operand: ");
                        userInput = input.nextDouble();
                        operand2 = userInput;
                        System.out.println("");
                        multiplicationResult = (operand1 * operand2);
                        System.out.println("Current Result: " + twoDecimals.format(multiplicationResult));
                        System.out.println("");
                        numOfCalcs += 1;
                        sumOfCalcs = sumOfCalcs + multiplicationResult;
                        menu();
                        break;
                    case 4:
                        System.out.print("Enter first operand: ");
                        userInput = input.nextDouble();
                        operand1 = userInput;
                        System.out.print("Enter second operand: ");
                        userInput = input.nextDouble();
                        operand2 = userInput;
                        System.out.println("");
                        divisionresult = (operand1 / operand2);
                        System.out.println("Current Result: " + twoDecimals.format(divisionresult));
                        System.out.println("");
                        numOfCalcs += 1;
                        sumOfCalcs = sumOfCalcs + divisionresult;
                        menu();
                        break;
                    case 5:
                        System.out.print("Enter first operand: ");
                        userInput = input.nextDouble();
                        operand1 = userInput;
                        System.out.print("Enter second operand: ");
                        userInput = input.nextDouble();
                        operand2 = userInput;
                        System.out.println("");
                        exponentiationResult = (Math.pow(operand1, operand2));
                        System.out.println("Current Result: " + twoDecimals.format(exponentiationResult));
                        System.out.println("");
                        numOfCalcs += 1;
                        sumOfCalcs = sumOfCalcs + exponentiationResult;
                        menu();
                        break;
                    case 6:
                        System.out.print("Enter first operand: ");
                        userInput = input.nextDouble();
                        operand1 = userInput;
                        System.out.print("Enter second operand: ");
                        userInput = input.nextDouble();
                        operand2 = userInput;
                        System.out.println("");
                        logarithmResult = ((Math.log10(operand2)) / (Math.log10(operand1)));
                        System.out.println("Current Result: " + twoDecimals.format(logarithmResult));
                        System.out.println("");
                        numOfCalcs += 1;
                        sumOfCalcs = sumOfCalcs + logarithmResult;
                        menu();
                        break;

                }
            }
            else if (menuSelection == 7) {                      //if user enters 7, shows statistics and average
                if (numOfCalcs == 0) {                          //if no stats, then does not show
                    System.out.println("");
                    System.out.println("Error: No calculations yet to average!");
                    System.out.println("");
                }
                else {
                    System.out.println("");
                    System.out.println("Sum of calculations: " + sumOfCalcs);
                    System.out.println("Number of calculations: " + numOfCalcs);
                    System.out.println("Average of calculations: " + twoDecimals.format(sumOfCalcs/numOfCalcs));    //rounds the average two decimal places
                    System.out.println("");
                }
            }
            else {
                System.out.println("");                                 //if anything other than 0-7 is entered, this prints and asks for input again
                System.out.println("Error: Invalid selection!");
                System.out.println("");
            }

        }
    }

}

