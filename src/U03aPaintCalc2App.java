import java.util.Scanner;

public class U03aPaintCalc2App {

    /*
     * Create a public static method named calculateTotalSquareFeet
     * that has 5 parameters: length, width, height, doors, windows.
     * Returns the surface area of the walls as a double.
     * Assume that a door is 21 square feet and a window is 12 sq ft.
     */
    // DONE
    public static double calculateTotalSquareFeet(double length, double width, double height, double doors, double windows){
        double totalSqFeet = (length * height * 2) + (width * height * 2) - (doors * 21) - (windows * 12);
        return totalSqFeet;
    }

    /*
     * Create a public static method named calculateIfGallonsOnly
     * that has 1 parameter: totalSqFeet. Returns a String that
     * says "If gallons only = " and the number of gallons rounded up.
     */
    // DONE
    public static String calculateIfGallonsOnly(double totalSqFeet){
        double gallonsNeeded = totalSqFeet / 300.0;
        long numOfGallons = (long) Math.ceil(gallonsNeeded);
        
        if (numOfGallons == 1) {
            return "If gallons only = " + numOfGallons + " gallon";
        } else {
            return "If gallons only = " + numOfGallons + " gallons";
        }
    }

    /*
     * Create a public static method named calculateIfQuartsAvailable
     * that has 1 parameter: totalSqFeet. Returns a String that says
     * "If quarts are available = " and the number of gallons and quarts.
     * NOTE: If there are no quarts needed, do NOT display “0 quarts”.
     */
    // DONE 
    public static String calculateIfQuartsAvailable(double totalSqFeet){
        double paintNeeded = totalSqFeet / 300.0;
        long numOfGallons = (long) Math.floor(paintNeeded);
        double leftover = paintNeeded - numOfGallons;
        long numOfQuarts = (long) Math.ceil(leftover * 4);
        
        // Convert 4 quarts to 1 gallon
        if (numOfQuarts == 4) {
            numOfGallons = numOfGallons + 1;
            numOfQuarts = 0;
        }
        
        // Only gallons, no quarts
        if (numOfQuarts == 0) {
            if (numOfGallons == 1) {
                return "If quarts are available = " + numOfGallons + " gallon";
            } else {
                return "If quarts are available = " + numOfGallons + " gallons";
            }
        }
        
        // Gallons and quarts
        if (numOfQuarts == 1) {
            if (numOfGallons == 1) {
                return "If quarts are available = " + numOfGallons + " gallon and " + numOfQuarts + " quart";
            } else {
                return "If quarts are available = " + numOfGallons + " gallons and " + numOfQuarts + " quart";
            }
        } else {
            if (numOfGallons == 1) {
                return "If quarts are available = " + numOfGallons + " gallon and " + numOfQuarts + " quarts";
            } else {
                return "If quarts are available = " + numOfGallons + " gallons and " + numOfQuarts + " quarts";
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the room dimensions below");
        System.out.print("Length (for example, 12.5): ");
        // DONE collect the user input as a double
        input.nextDouble();
        System.out.print("Width: ");
        // DONE
        input.nextDouble();
        System.out.print("Height: ");
        // DONE
        input.nextDouble();
        System.out.print("How many doors does the room have: ");
        // DONE collect the user input as an int
        input.nextInt();
        System.out.print("How many windows does the room have: ");
        // DONE
        input.nextInt();
        System.out.println("Total square feet =");
        // DONE use calculateTotalSquareFeet to get the result
        double totalSqFeet = calculateTotalSquareFeet(10.5, 25.6, 10.7, 1, 2);
        System.out.println(totalSqFeet);
        System.out.println("If gallons only =");
        // DONE use calculateIfGallonsOnly to get the result
        String gallonsOnly = calculateIfGallonsOnly(totalSqFeet);
        System.out.println(gallonsOnly);
        System.out.println("If quarts are available =");
        // DONE use calculateIfQuartsAvailable to get the result
        String quartsAvailable = calculateIfQuartsAvailable(totalSqFeet);
        System.out.println(quartsAvailable);
        input.close();
    }
}
