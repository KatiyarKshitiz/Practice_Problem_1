import java.util.Random;

public class MinMaxRandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int[] numbers = new int[5];
        
        // Generating 5 random 3-digit numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(900) + 100;  // Generates a number between 100 and 999
        }
        
        // Initializing min and max values with the first number
        int min = numbers[0];
        int max = numbers[0];
        
        // Finding the min and max values
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
        // Output the result
        System.out.println("Generated Numbers: ");
        for (int num : numbers) {
            System.out.println(num);
        }
        System.out.println("Minimum Value: " + min);
        System.out.println("Maximum Value: " + max);
    }
}
