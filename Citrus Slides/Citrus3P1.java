import java.util.ArrayList;

public class Citrus3P1 {
    public static void main(String[] args) {
        
        // ----- MAX VALUE -----
        int[] numbers = {45, 72, 18};  // Array with at least 3 integers
        
        int max = numbers[0]; // Assume first number is the max
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        
        System.out.println("Maximum value in the array: " + max);
        
        
        // ----- AVERAGE VALUE -----
        ArrayList<Double> doubleList = new ArrayList<>();
        
        // Add at least 5 doubles
        doubleList.add(10.5);
        doubleList.add(20.0);
        doubleList.add(15.7);
        doubleList.add(30.3);
        doubleList.add(12.8);
        
        // Add any 3 more doubles
        doubleList.add(8.4);
        doubleList.add(25.1);
        doubleList.add(40.6);
        
        // Calculate average
        double sum = 0;
        for (double value : doubleList) {
            sum += value;
        }
        
        double average = sum / doubleList.size();
        System.out.println("Average value in the ArrayList: " + average);
    }
}