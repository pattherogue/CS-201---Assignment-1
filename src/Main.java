import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an instance of StateCapital
        StateCapital stateCapital = new StateCapital();
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Part 1: Sorting Arrays
        System.out.println("Part 1: Sorting Arrays\n");
        stateCapital.sortStatesByCapital(); // Sort states by capital
        stateCapital.promptUserForStateCapitals(scanner); // Prompt user for state capitals
        
        // Part 2: Sorting & Searching HashMap
        System.out.println("\nPart 2: Sorting & Searching HashMap\n");
        stateCapital.storeStateCapitalsInHashMap(); // Store states and capitals in HashMap
        stateCapital.promptUserForState(scanner); // Prompt user for a state and display its capital
        
        // Close the scanner
        scanner.close();
    }
}

