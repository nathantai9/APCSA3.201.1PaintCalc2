import java.util.Scanner;

public class U03aPaintCalc2App {

    /*
     * Create a public static method named calculateTotalSquareFeet
     * that has 5 parameters: length, width, height, doors, windows.
     * Returns the surface area of the walls as a double.
     * Assume that a door is 21 square feet and a window is 12 sq ft.
     */
    // DONE

    public static double calculateTotalSquareFeet(double length, double width, double height, double doors, double windows) {
        return (length * height * 2) + (width * height * 2) - (doors * 21) - (windows * 12);
    }

    /*
     * Create a public static method named calculateIfGallonsOnly
     * that has 1 parameter: totalSqFeet. Returns a String that
     * says "If gallons only = " and the number of gallons rounded up.
     */
    // DONE 

    public static String calculateIfGallonsOnly(double totalSqFeet) {
        int gallons = (int) Math.ceil(totalSqFeet / 350);
        String gallon_word = (gallons == 1) ? "gallon" : "gallons";
        return "If gallons only = " + gallons + " " + gallon_word;
    }

    /*
     * Create a public static method named calculateIfQuartsAvailable
     * that has 1 parameter: totalSqFeet. Returns a String that says
     * "If quarts are available = " and the number of gallons and quarts.
     * NOTE: If there are no quarts needed, do NOT display “0 quarts”.
     */
    // DONE 

    public static String calculateIfQuartsAvailable(double totalSqFeet) {
        int totalQuarts = (int) Math.ceil(totalSqFeet / 75);
        int gallons = totalQuarts / 4;
        int quarts = totalQuarts % 4;
        
        if (quarts == 0) {
            String gallon_word = (gallons == 1) ? "gallon" : "gallons";
            return "If quarts are available = " + gallons + " " + gallon_word;
        } else {
            String gallon_word = (gallons == 1) ? "gallon" : "gallons";
            String quart_word = (quarts == 1) ? "quart" : "quarts";
            return "If quarts are available = " + gallons + " " + gallon_word + " and " + quarts + " " + quart_word;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the room dimensions below");
        System.out.print("Length (for example, 12.5): ");
        // DONE collect the user input as a double
        input.nextDouble();
        double length = input.nextDouble();
        System.out.print("Width: ");
        // DONE
        input.nextDouble();
        double width = input.nextDouble();
        System.out.print("Height: ");
        // DONE
        input.nextDouble();
        double height = input.nextDouble();
        System.out.print("How many doors does the room have: ");
        // DONE collect the user input as an int
        input.nextInt();
        int doors = input.nextInt();
        System.out.print("How many windows does the room have: ");
        // DONE
        input.nextInt();
        int windows = input.nextInt();
        System.out.println("Total square feet =");
        // DONE use calculateTotalSquareFeet to get the result
        System.out.println(calculateTotalSquareFeet(length, width, height, doors, windows));
        System.out.println("If gallons only =");
        // DONE use calculateIfGallonsOnly to get the result
        System.out.println(calculateIfGallonsOnly(calculateTotalSquareFeet(length, width, height, doors, windows)));
        System.out.println("If quarts are available =");
        // DONE use calculateIfQuartsAvailable to get the result
        System.out.println(calculateIfQuartsAvailable(calculateTotalSquareFeet(length, width, height, doors, windows)));
        input.close();
    }
}