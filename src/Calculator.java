
/*
 * This is the calculator class. It is used as one of the actions of the App.java class.
 * This class intakes 2 variables of type double and processes the result according
 * to the user's chosen operator type, and returns the calculated value.
 */

public class Calculator {

    private int x;
    private int y;
    private String operator;
    private double total;

    public Calculator() {

    }

    /*
     * The header of the calculate method below is "public double calculate()"
     * and the parameters are int x, int y, and String operator.
     */
    public double calculate(int x, int y, String operator) {
        this.operator = operator;
        this.x = x;
        this.y = y;
        double finalCalculation = 0;

        if (this.operator.equals("+")) {
            // Addition
            finalCalculation = calculateSum(this.x, this.y);
        } else if (this.operator.equals("-")) {
            // Subtraction
            finalCalculation = calculateDifference(this.x, this.y);
        } else if (this.operator.equals("*")) {
            // Multiplication
            finalCalculation = calculateMuliplication(this.x, this.y);
        } else if (this.operator.equals("/")) {
            // Division
            finalCalculation = calculateDivision(this.x, this.y);
        } else if (this.operator.equals("%")) {
            // Modulus
            finalCalculation = calculateModulus(this.x, this.y);
        }
        return finalCalculation;

        /*
         * The .equals() method is a string method that allows you to compare
         * two string to one another and returns either true or false.
         */
    }

    public double calculateSum(int x, int y) {
        this.x = x;
        this.y = y;
        this.total = this.x + this.y;

        return total;
    }

    public double calculateDifference(int x, int y) {
        this.x = x;
        this.y = y;
        this.total = this.x - this.y;

        return total;
    }

    public double calculateMuliplication(int x, int y) {
        this.x = x;
        this.y = y;
        this.total = this.x * this.y;

        return total;
    }

    public double calculateDivision(int x, int y) {
        this.x = x;
        this.y = y;

        double tempTotal = (double) this.x / this.y;
        String totalAsString = String.format("%.2f", tempTotal);
        this.total = Double.parseDouble(totalAsString);
        /*
         * Casting is taking one variable of one particular type and turning it
         * into another variable type.
         */

        return total;
    }

    public double calculateModulus(int x, int y) {
        this.x = x;
        this.y = y;
        this.total = this.x % this.y;

        return total;
    }

}
