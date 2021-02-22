import java.util.Scanner;  

/** 
    This program takes user input for a number of bags, items per bag and the weight of each item, and calculates the average, maximum, and minimum of the weights overall.
*/

public class WeightCalculator {
    public static void main(String[] args)
    {
        int numBags;  // Variable to hold number of bags.
        int numItems;  // Variable to hold number of items in a given bag.
        double weight;  // Variable to hold the weight of each item.
        double totalWeight = 0;  // Accumulator to hold overall weight of item.
        int totalNumItems = 0;  // Accumulator to hold total number of items.
        double minWeight = Double.MAX_VALUE;  // Variable to hold the minimum weight, initialised at the maximum value of a double.
        double maxWeight = 0;  // Variable to hold the maximum weight.
        double average = 0;  // Variable to hold the overall average weight.
        
        // Create scanner object to take user input, prompt and store user input for number of bags.
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter the number of bags: ");
        numBags = keyboard.nextInt();
        keyboard.nextLine();  // Consume remaining newline.

        // Error message and termination of program if user enters number less than 1.
        if (numBags < 1) 
        {
            System.out.println("The number of bags is less than 1. Program will exit.");
            System.exit(0);
        }

        // For loop as an outer loop to iterate for each bag and get user input for number of items for each bag.
        for (int bag = 1; bag <= numBags; bag++)
        {
            // Prompt and store user input for number of items.
            System.out.println("Enter the number of item for bag " + bag + ": ");
            numItems = keyboard.nextInt(); 
            keyboard.nextLine();  // Consume remaining newline.
            
            // Validate user input and re-prompt input if user enters a number less than 1.
            while (numItems < 1)
            {
                System.out.println("Invalid. Enter 1 or greater: ");
                numItems = keyboard.nextInt();
                keyboard.nextLine();
            }

            totalNumItems += numItems;  // Add item to overall item count.

            // Prompt user input for weight of each item.
            System.out.println("Enter the weight, in kilograms, for each item.");   

            // For loop as an inner loop to iterate for each item and get user input for weight of each item.
            for (int item = 1; item <= numItems; item++)

            {
                // Prompt and store user input for weight of each item.
                System.out.println("Bag " + bag + " item " + item + ": ");
                weight = keyboard.nextDouble();
                keyboard.nextLine();  // Consume remaining newline.

                totalWeight += weight;  // Add weight to accumulator.

                // Validate user input and re-prompt if user enters a weight less than 1.    
                while (weight < 1)
                {
                    System.out.println("Invalid. Enter 1 or greater: ");
                    weight = keyboard.nextDouble();
                    keyboard.nextLine();  
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
            average = totalWeight / totalNumItems;

        }

        // Display the total number of items and their maximum, minimum and average overall weights.
        System.out.println("Number of bags: " + totalNumItems);
        System.out.println("Maximum weight of items: " + maxWeight);
        System.out.println("Minimum weight of items: " + minWeight);
        System.out.println("Average item weight: " + average);
        
    }
}
