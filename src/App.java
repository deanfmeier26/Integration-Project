
/* By: Dean Meier
 *
 * This is a console app that will have various actions the user can choose from
 * by inputting the number corresponding to the actions specified. Once the chosen
 * action is completed, the user will be asked if they want to pick another action
 * to try, where they enter either "yes" or "no", or the number that corresponds to
 * those choices, e.g. 1 or 2. The list of actions will be printed again, and the user
 * will input the number of the desired action again. This will continue to repeat
 * until the user choose "no" when prompted to try again, or if they choose the "exit"
 * option from the list.
 *
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

public class App {
    public static Scanner input = new Scanner(System.in);
    public static boolean repeat = true;
    public static int response = 0;

    public static int calculatorX;
    public static int calculatorY;
    public static String calculatorOperator;

    public static String fname;
    public static String lname;
    public static String gender;
    public static int age;

    public static void main(String[] args) {
        System.out.print("Please enter your name: ");
        String userName = "";
        try {
            userName = input.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input type.");
        }
        String userGreeting;
        userGreeting = "Hello, " + userName
                + "! Follow the instructions below to use the application.";
        System.out.println(userGreeting.toUpperCase());
        /*
         * .toUpperCase() is a string method that makes all of the letters in a
         * string capitalized.
         */

        System.out.println("How old are you? ");
        int userAge = 0;
        try {
            userAge = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input type.");
        }

        if (userAge <= 17) {
            System.out.println("You are not an adult.");
        } else if (userAge >= 18 && userAge <= 35) {
            System.out.println("You are in the prime of your life.");
        } else if (userAge > 35 && userAge < 50) {
            System.out
                    .println("You've still got some good years ahead of you.");
        } else if (userAge >= 50) {
            System.out.println(
                    "You should really consider getting life insurance.");
        }

        GeneralFunctionality.printDashedLineBreak();
        System.out.println("A list of actions will appear below. \n"
                + "Use the corresponding number to choose an action. \n");

        while (repeat) {
            GeneralFunctionality.printActionList();
            System.out.println();
            System.out.print("Enter Your Choice Here: ");
            try {
                response = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Wrong input type.");
            }
            GeneralFunctionality.printDashedLineBreak();

            switch (response) {
                case 1:
                    // Start user information function here
                    try {
                        input.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("Wrong input type.");
                    }
                    System.out.println("Create a new account:");
                    System.out.println("What is your first name?");
                    try {
                        fname = input.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("Wrong input type.");
                    }
                    System.out.println("What is your last name?");
                    try {
                        lname = input.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("Wrong input type.");
                    }
                    System.out.println("What is your gender?");
                    try {
                        gender = input.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("Wrong input type.");
                    }
                    System.out.println("What is your age?");
                    try {
                        age = input.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Wrong input type.");
                    }

                    GeneralFunctionality.printDashedLineBreak();

                    UserAccount newUser = new UserAccount(fname, lname, gender,
                            age);
                    System.out.println("Generating your personal ID number...");
                    newUser.createUserID();
                    System.out.println("Your personal ID number is "
                            + newUser.getUserID());
                    System.out.println(newUser.getFullName()
                            + " your account is officially created!");
                    System.out.println(newUser.selfDescription());

                    GeneralFunctionality.printDashedLineBreak();
                    break;
                // These break statements, when executed, make a switch
                // statement stop and has the code
                // jump to the end of the switch statement and continue
                // executing the program.
                case 2:
                    // Start list generator function here
                    int repeatCase2 = 1;
                    do {
                        System.out.println(
                                "How long do you want your list to be?");
                        int listLength = 0;
                        try {
                            listLength = input.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Wrong input type.");
                        }
                        int[] generatedList = new int[listLength];
                        String[][] twoDList = new String[listLength][1];
                        ArrayList<Integer> arrayList = new ArrayList<Integer>();

                        for (int i = 0; i < listLength; i++) {
                            generatedList[i] = i;
                        }
                        for (int num : generatedList) {
                            System.out.println(num);
                        }

                        for (int i = 0; i < listLength; i++) {
                            for (int j = 0; j < 1; j++) {
                                twoDList[i][j] = i + ", " + j;
                            }
                        }
                        for (int i = 0; i < listLength; i++) {
                            for (int j = 0; j < 1; j++) {
                                System.out.println(twoDList[i][j]);
                            }
                        }

                        for (int i = 0; i < listLength; i++) {
                            arrayList.add(i);
                        }
                        for (int i = 0; i < listLength; i++) {
                            System.out.println(arrayList.get(i));
                        }

                        GeneralFunctionality.printDashedLineBreak();

                        System.out.println(
                                "Do you want to generate another list?\n"
                                        + "1. Yes\n" + "2. No");
                        repeatCase2 = input.nextInt();
                        GeneralFunctionality.printDashedLineBreak();
                    } while (repeatCase2 == 1);

                    break;
                case 3:
                    // Start to-do list function here
                    System.out.println("To-Do List - *WIP*");
                    break;
                case 4:
                    // Start Calculator function here
                    System.out.print("Enter your first number: ");
                    try {
                        calculatorX = input.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Wrong input type.");
                    }
                    System.out.println();

                    System.out.print("Enter your second number: ");
                    try {
                        calculatorY = input.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Wrong input type.");
                    }
                    System.out.println();

                    System.out.print("Enter one of the following operators:\n"
                            + "+, -, *, /, %: ");
                    try {
                        calculatorOperator = input.next();
                    } catch (InputMismatchException e) {
                        System.out.println("Wrong input type.");
                    }
                    System.out.println();

                    Calculator c = new Calculator();
                    /*
                     * Inside of the println() below is a method call.
                     * calculatorX, calculatorY, and calculatorOperator are all
                     * arguments being passed to the method.
                     */
                    System.out.println(c.calculate(calculatorX, calculatorY,
                            calculatorOperator));
                    GeneralFunctionality.printDashedLineBreak();

                    break;
                case 5:
                    repeat = false;
                    break;
            }
            if (repeat == true) {
                System.out.println(
                        "Do you want to keep going?\n" + "1. Yes\n" + "2. No");
                try {
                    response = input.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Wrong input type.");
                }
                if (response == 1) {
                    repeat = true;
                } else if (response == 2) {
                    repeat = false;
                }

                GeneralFunctionality.printDashedLineBreak();
            }

        }

        System.out.println("Have a great day, " + userName + "!");

    }
}

/*
 * if (i % 2 != 0) { continue; /*
 * 
 * The continue statement is used in a loop to immediately jump from to the
 * update statement in a for loop, or the Boolean expression in a do/while or
 * while loop.
 * 
 * 
 * }
 */

/*
 * Built in Java Data Types: 1. byte: designates the 8 bit signed integer
 * primitive type. Minimum value is -128, maximum value is 127. 2. char: defines
 * a character primitive type. Can be created from character literals and
 * numeric representation. Minimum value is 0, maximum value is (2^16)-1. 3.
 * short: Integer primitive type. Minimum value is -32,768, maximum value is
 * 32,767. 4. int: Integer primitive type. Minimum value is -2^31, maximum value
 * is (2^31)-1. 5. long: Integer primitive type. Minimum value is -2^63, maximum
 * value is (2^63)-1. Denoted with an L at the end of the number (65L). 6.
 * float: Floating point primitive type. Minimum value is 2^-149, maximum value
 * is (2-2^-23)*(2^127). Denoted with an f after the number (65.55f). 7. double:
 * Floating point primitive type. Minimum value is 2^-1074, maximum value is
 * (2-2^-52)*(2^1023). 8. boolean: can only hold the values of true or false.
 *
 * Operator Precedence: this is the way java (and other languages) specify the
 * order in which the operators in an expression are evaluated when the
 * expression has multiple operators.
 */