import java.util.Scanner;

/**
 * This class implements a program that asks the user to enter a capital for a U.S. state.
 * It then reports whether the user input is correct. The program stores the 50 states and their
 * capitals in a two-dimensional array, displays the current contents of the array, and uses
 * a bubble sort to sort the content by capital. It then prompts the user to enter answers for
 * all state capitals and displays the total correct count. The user's answer is not case-sensitive.
 */

public class SortingArrays {
    /**
     * The main method of the program.
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Define the array of state capitals
        String[][] stateCapitals = {
            {"Alabama", "Montgomery"},
            {"Alaska", "Juneau"},
            {"Arizona", "Phoenix"},
            {"Arkansas", "Little Rock"},
            {"California", "Sacramento"},
            {"Colorado", "Denver"},
            {"Connecticut", "Hartford"},
            {"Delaware", "Dover"},
            {"Florida", "Tallahassee"},
            {"Georgia", "Atlanta"},
            {"Hawaii", "Honolulu"},
            {"Idaho", "Boise"},
            {"Illinois", "Springfield"},
            {"Indiana", "Indianapolis"},
            {"Iowa", "Des Moines"},
            {"Kansas", "Topeka"},
            {"Kentucky", "Frankfort"},
            {"Louisiana", "Baton Rouge"},
            {"Maine", "Augusta"},
            {"Maryland", "Annapolis"},
            {"Massachusetts", "Boston"},
            {"Michigan", "Lansing"},
            {"Minnesota", "St. Paul"},
            {"Mississippi", "Jackson"},
            {"Missouri", "Jefferson City"},
            {"Montana", "Helena"},
            {"Nebraska", "Lincoln"},
            {"Nevada", "Carson City"},
            {"New Hampshire", "Concord"},
            {"New Jersey", "Trenton"},
            {"New Mexico", "Santa Fe"},
            {"New York", "Albany"},
            {"North Carolina", "Raleigh"},
            {"North Dakota", "Bismarck"},
            {"Ohio", "Columbus"},
            {"Oklahoma", "Oklahoma City"},
            {"Oregon", "Salem"},
            {"Pennsylvania", "Harrisburg"},
            {"Rhode Island", "Providence"},
            {"South Carolina", "Columbia"},
            {"South Dakota", "Pierre"},
            {"Tennessee", "Nashville"},
            {"Texas", "Austin"},
            {"Utah", "Salt Lake City"},
            {"Vermont", "Montpelier"},
            {"Virginia", "Richmond"},
            {"Washington", "Olympia"},
            {"West Virginia", "Charleston"},
            {"Wisconsin", "Madison"},
            {"Wyoming", "Cheyenne"}
        };

        // Display the current contents of the array
        System.out.println("Current contents of the array:");
        for (String[] state : stateCapitals) {
            System.out.println(state[0] + " - " + state[1]);
        }

        // Sort the array by capital using bubble sort
        bubbleSortByCapital(stateCapitals);

        // Prompt the user to enter answers for all state capitals
        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;
        for (String[] state : stateCapitals) {
            System.out.print("Enter the capital of " + state[0] + ": ");
            String userCapital = scanner.nextLine();
            if (userCapital.equalsIgnoreCase(state[1])) {
                correctCount++;
            }
        }

        // Display the total correct count
        System.out.println("Total correct count: " + correctCount);
    }

    /**
     * Sorts the 2D array by the second element of each sub-array (the capital) using bubble sort.
     * @param array The 2D array to be sorted.
     */

    private static void bubbleSortByCapital(String[][] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i][1].compareToIgnoreCase(array[i + 1][1]) > 0) {
                    String[] temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
