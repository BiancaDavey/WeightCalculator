// Import scanner for user input.
import java.util.Scanner;  

/** 
    This program takes user input for a number of trees, coconuts per tree and weight of each coconut, and calculates the average, maximum, and minimum of the weights overall.
*/

public class CoconutYield {
    public static void main(String[] args)
    {
        int numTrees;  // Variable to hold number of trees.
        int numCoconuts;  // Variable to hold number of coconuts in a given tree.
        double weight;  // Variable to hold the weight of each coconut.
        double totalWeight = 0;  // Accumulator to hold overall weight of coconuts, initialised at 0.
        int totalNumCoconuts = 0;  // Accumulator to hold total number of coconuts, initialised at 0.
        double minWeight = Double.MAX_VALUE;  // Variable to hold the minimum weight, initialised at the maximum value of a double.
        double maxWeight = 0;  // Variable to hold the maximum weight, initialised at 0.
        double average = 0;  // Variable to hold the overall average weight, initialised at 0.
        
        // Create scanner object to take user input, prompt and store user input for number of trees.
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter the number of trees: ");
        numTrees = keyboard.nextInt();
        keyboard.nextLine();  // Consume remaining newline.

        // Error message and termination of program if user enters number less than 1.
        if (numTrees < 1) 
        {
            System.out.println("The number of trees is less than 1. Program will exit.");
            System.exit(0);
        }

        // For loop as an outer loop to iterate for each tree and get user input for number of coconuts for each tree.
        for (int tree = 1; tree <= numTrees; tree++)
        {
            // Prompt and store user input for number of coconuts.
            System.out.println("Enter the number of coconuts for tree " + tree + ": ");
            numCoconuts = keyboard.nextInt(); 
            keyboard.nextLine();  // Consume remaining newline.
            
            // Validate user input and re-prompt input if user enters a number less than 1.
            while (numCoconuts < 1)
            {
                System.out.println("Invalid. Enter 1 or greater: ");
                numCoconuts = keyboard.nextInt();
                keyboard.nextLine();
            }

            totalNumCoconuts += numCoconuts;  // Add coconut count to overall coconut count.

            // Prompt user input for weight of each coconut.
            System.out.println("Enter the weight, in kilograms, for each coconut.");   

            // For loop as an inner loop to iterate for each coconut and get user input for weight of each coconut.
            for (int coconut = 1; coconut <= numCoconuts; coconut++)

            {
                // Prompt and store user input for weight of each coconut.
                System.out.println("Tree " + tree + " coconut " + coconut + ": ");
                weight = keyboard.nextDouble();
                keyboard.nextLine();  // Consume remaining newline.

                totalWeight += weight;  // Add weight to accumulator.

                // Validate user input and re-prompt if user enters a weight less than 1.    
                while (weight < 1)
                {
                    System.out.println("Invalid. Enter 1 or greater: ");
                    weight = keyboard.nextDouble();
                    keyboard.nextLine();  // Consume remaining newline.
                }

                // If statements to store smallest and largest weights input by user as the overall minimum and maximum.
                if (minWeight > weight)
                { 
                    minWeight = weight;
                }

                if (maxWeight < weight)
                {
                    maxWeight = weight;
                }

            }
            
            // Calculate average overall weight.
            average = totalWeight / totalNumCoconuts;

        }

        // Display the total number of coconuts and maximum, minimum and average overall weights.
        System.out.println("Number of coconuts: " + totalNumCoconuts);
        System.out.println("Maximum weight of coconuts: " + maxWeight);
        System.out.println("Minimum weight of coconuts: " + minWeight);
        System.out.println("Average coconut weight: " + average);
        
    }
}
