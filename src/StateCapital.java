import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StateCapital {
    private final String[] states = {"Alabama", "Alaska", /* add all 50 states here */};
    private final String[] capitals = {"Montgomery", "Juneau", /* add all 50 capitals here */};
    private final Map<String, String> stateCapitalMap;

    public StateCapital() {
        stateCapitalMap = new HashMap<>();
        for (int i = 0; i < states.length; i++) {
            stateCapitalMap.put(states[i], capitals[i]);
        }
    }

    public void sortStatesByCapital() {
        // Use efficient sorting algorithm like merge sort
        String[] tempStates = Arrays.copyOf(states, states.length);
        String[] tempCapitals = Arrays.copyOf(capitals, capitals.length);
        Arrays.sort(tempCapitals);
        for (String capital : tempCapitals) {
            for (int i = 0; i < tempStates.length; i++) {
                if (tempCapitals[i].equalsIgnoreCase(capital)) {
                    System.out.println(tempStates[i] + " - " + capital);
                    break;
                }
            }
        }
    }

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
        System.out.println("\nTotal correct count: " + correctCount + " out of " + states.length);
    }

    public void storeStateCapitalsInHashMap() {
        // Use TreeMap directly to sort the map
        Map<String, String> sortedMap = new TreeMap<>(stateCapitalMap);
        System.out.println("\nStates and Capitals (Sorted by State):\n");
        for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void promptUserForState(Scanner scanner) {
        System.out.print("\nEnter a state to find its capital: ");
        String state = scanner.nextLine();
        if (stateCapitalMap.containsKey(state)) {
            System.out.println("Capital of " + state + ": " + stateCapitalMap.get(state));
        } else {
            System.out.println("State not found.");
        }
    }
}
