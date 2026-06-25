package Day01;

public class Array {

        public static void main(String[] args) {

            // 1. Declare and initialize an array of integers
            // We use curly braces {} to quickly set up the values.
            int[] scores = {95, 88, 72, 90, 85};

            // 2. Accessing an element
            // IMPORTANT: Arrays in Java start counting at 0, not 1!
            System.out.println("The first score is: " + scores[0]); // Prints 95
            System.out.println("The third score is: " + scores[2]); // Prints 72

            // 3. Modifying an element
            // Let's change the third score (index 2) from 72 to 75
            scores[2] = 75;

            // 4. Using a loop to go through the entire array
            System.out.println("\n--- All Scores ---");
            int totalSum = 0;

            // 'scores.length' tells us how many items are in the array (in this case, 5)
            for (int i = 0; i < scores.length; i++) {
                System.out.println("Score at index " + i + ": " + scores[i]);
                totalSum = totalSum + scores[i];
            }

            // Calculate and print the average
            System.out.println("\nTotal Sum: " + totalSum);
            System.out.println("Average Score: " + (totalSum / scores.length));
        }
    }

