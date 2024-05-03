import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StateCapital {
    // Define arrays for states and capitals
    private String[] states = {"Alabama", "Alaska", /* add all 50 states here */};
    private String[] capitals = {"Montgomery", "Juneau", /* add all 50 capitals here */};
    
    // Define a HashMap to store states and capitals
    private Map<String, String> stateCapitalMap;

    // Constructor
    public StateCapital() {
        // Initialize the HashMap
        stateCapitalMap = new HashMap<>();
        // Populate the HashMap with states and capitals
        for (int i = 0; i < states.length; i++) {
            stateCapitalMap.put(states[i], capitals[i]);
        }
    }

    // Method to sort states by capital using bubble sort
    public void sortStatesByCapital() {
        // Perform bubble sort
        for (int i = 0; i < capitals.length - 1; i++) {
            for (int j = 0; j < capitals.length - i - 1; j++) {
                if (capitals[j].compareToIgnoreCase(capitals[j + 1]) > 0) {
                    // Swap capitals
                    String tempCap = capitals[j];
                    capitals[j] = capitals[j + 1];
                    capitals[j + 1] = tempCap;
                    // Swap corresponding states
                    String tempState = states[j];
                    states[j] = states[j + 1];
                    states[j + 1] = tempState;
                }
            }
        }
        // Display sorted states and capitals
        System.out.println("States and Capitals (Sorted by Capital):\n");
        for (int i = 0; i < states.length; i++) {
            System.out.println(states[i] + " - " + capitals[i]);
        }
    }

    // Method to prompt user for state capitals and calculate total correct count
    public void promptUserForStateCapitals(Scanner scanner) {
        int correctCount = 0;
        System.out.println("\nPlease enter the capital for each state:\n");
        for (int i = 0; i < states.length; i++) {
            System.out.print(states[i] + ": ");
            String userCapital = scanner.nextLine();
            if (userCapital.equalsIgnoreCase(capitals[i])) {
                correctCount++;
            }
        }
        // Display total correct count
        System.out.println("\nTotal correct count: " + correctCount + " out of " + states.length);
    }

    // Method to store states and capitals in HashMap
    public void storeStateCapitalsInHashMap() {
        // Display the content of the HashMap
        System.out.println("\nStates and Capitals (HashMap):\n");
        for (Map.Entry<String, String> entry : stateCapitalMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    // Method to prompt user for a state and display its capital
    public void promptUserForState(Scanner scanner) {
        System.out.print("\nEnter a state to find its capital: ");
        String state = scanner.nextLine();
        // Display the capital for the entered state
        if (stateCapitalMap.containsKey(state)) {
            System.out.println("Capital of " + state + ": " + stateCapitalMap.get(state));
        } else {
            System.out.println("State not found.");
        }
    }
}
