import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * This program demonstrates sorting and searching a HashMap of U.S. state capitals.
 * It initializes a HashMap with the state-capital pairs, displays the contents of the HashMap,
 * sorts the HashMap by state name using a TreeMap, prompts the user to enter a state,
 * and displays the capital of the entered state if it exists in the sorted map.
 */

public class SortingSearchingHashMap {
    public static void main(String[] args) {
        // Define and populate the HashMap of state capitals
        HashMap<String, String> stateCapitalsMap = new HashMap<>();
        stateCapitalsMap.put("Alabama", "Montgomery");
        stateCapitalsMap.put("Alaska", "Juneau");
        stateCapitalsMap.put("Arizona", "Phoenix");
        stateCapitalsMap.put("Arkansas", "Little Rock");
        stateCapitalsMap.put("California", "Sacramento");
        stateCapitalsMap.put("Colorado", "Denver");
        stateCapitalsMap.put("Connecticut", "Hartford");
        stateCapitalsMap.put("Delaware", "Dover");
        stateCapitalsMap.put("Florida", "Tallahassee");
        stateCapitalsMap.put("Georgia", "Atlanta");
        stateCapitalsMap.put("Hawaii", "Honolulu");
        stateCapitalsMap.put("Idaho", "Boise");
        stateCapitalsMap.put("Illinois", "Springfield");
        stateCapitalsMap.put("Indiana", "Indianapolis");
        stateCapitalsMap.put("Iowa", "Des Moines");
        stateCapitalsMap.put("Kansas", "Topeka");
        stateCapitalsMap.put("Kentucky", "Frankfort");
        stateCapitalsMap.put("Louisiana", "Baton Rouge");
        stateCapitalsMap.put("Maine", "Augusta");
        stateCapitalsMap.put("Maryland", "Annapolis");
        stateCapitalsMap.put("Massachusetts", "Boston");
        stateCapitalsMap.put("Michigan", "Lansing");
        stateCapitalsMap.put("Minnesota", "St. Paul");
        stateCapitalsMap.put("Mississippi", "Jackson");
        stateCapitalsMap.put("Missouri", "Jefferson City");
        stateCapitalsMap.put("Montana", "Helena");
        stateCapitalsMap.put("Nebraska", "Lincoln");
        stateCapitalsMap.put("Nevada", "Carson City");
        stateCapitalsMap.put("New Hampshire", "Concord");
        stateCapitalsMap.put("New Jersey", "Trenton");
        stateCapitalsMap.put("New Mexico", "Santa Fe");
        stateCapitalsMap.put("New York", "Albany");
        stateCapitalsMap.put("North Carolina", "Raleigh");
        stateCapitalsMap.put("North Dakota", "Bismarck");
        stateCapitalsMap.put("Ohio", "Columbus");
        stateCapitalsMap.put("Oklahoma", "Oklahoma City");
        stateCapitalsMap.put("Oregon", "Salem");
        stateCapitalsMap.put("Pennsylvania", "Harrisburg");
        stateCapitalsMap.put("Rhode Island", "Providence");
        stateCapitalsMap.put("South Carolina", "Columbia");
        stateCapitalsMap.put("South Dakota", "Pierre");
        stateCapitalsMap.put("Tennessee", "Nashville");
        stateCapitalsMap.put("Texas", "Austin");
        stateCapitalsMap.put("Utah", "Salt Lake City");
        stateCapitalsMap.put("Vermont", "Montpelier");
        stateCapitalsMap.put("Virginia", "Richmond");
        stateCapitalsMap.put("Washington", "Olympia");
        stateCapitalsMap.put("West Virginia", "Charleston");
        stateCapitalsMap.put("Wisconsin", "Madison");
        stateCapitalsMap.put("Wyoming", "Cheyenne");

    // Display the content of the HashMap
    System.out.println("Content of the HashMap:"); 
    // Iterate over each key (state) in the HashMap
    for (String state : stateCapitalsMap.keySet()) {
        // Print the state-capital pair
        System.out.println(state + " - " + stateCapitalsMap.get(state));
    }

    // Sort the HashMap using TreeMap
    TreeMap<String, String> sortedStateCapitalsMap = new TreeMap<>(stateCapitalsMap);

    // Prompt the user to enter a state and display the capital
    Scanner scanner = new Scanner(System.in); // Create a new Scanner object to read user input
    System.out.print("Enter a state: "); // Prompt the user to enter a state
    String userState = scanner.nextLine(); // Read the user's input for the state
    String capital = sortedStateCapitalsMap.get(userState); // Retrieve the capital corresponding to the user's input state from the sorted TreeMap
    if (capital != null) { // Check if the capital is found
        System.out.println("Capital of " + userState + ": " + capital); // Display the capital corresponding to the user's input state
    } else {
        System.out.println("State not found."); // Display a message indicating that the state was not found
    }
    }
}
