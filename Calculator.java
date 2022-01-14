//Calculator class 
public class Calculator {

    // Constructor method
    public Calculator() {

    }

    // add method

    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // subtract method

    public int subtract(int a, int b) {
        int sum = a - b;

        return sum;
    }

    // mulitply method
    public int multiply(int a, int b) {
        int sum = a * b;
        return sum;
    }

    // divide method

    public int divide(int a, int b) {
        int sum = a / b;
        return sum;
    }

    // modulo method

    public int modulo(int a, int b) {
        int sum = a % b;
        return sum;
    }

    // Main method
    public static void main(String[] args) {
        // Creating object myCalculator
        Calculator myCalculator = new Calculator();

        // declaring addValue int and assigning it to the result of add method
        int addValue = myCalculator.add(5, 7);

        // printing the addValue to the console
        System.out.println(addValue);

        // declaring subtractValue and assigning it to the value of subtract method

        int subtractValue = myCalculator.subtract(45, 11);
        System.out.println(subtractValue);

        // int multiple Value hold results of multiply method
        int multipleValue = myCalculator.multiply(45, 11);

        // printing the result to the console

        System.out.println(multipleValue);

        // int divisionValue hold the result of divide method
        int divisionValue = myCalculator.divide(9, 3);
        // Prints the results to the console
        System.out.println(divisionValue);

        // int moduleValue holds result of modulo method
        int moduloValue = myCalculator.modulo(9, 2);
        // Prints the results to the console
        System.out.println(moduloValue);

    }
}