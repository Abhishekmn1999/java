import java.util.*;

public class LinearSearch {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Size of Array");
        int size = scan.nextInt();

        int numbers[] = new int[size];

        // input
        System.out.println("Enter The ELements of Array");
        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }

        // Printing array elements in a single line
        System.out.print("Entered array elements: ");
        for (int i = 0; i < numbers.length; i++) {  //i<size also working
            System.out.print(numbers[i] + " ");
        }

       System.out.println(); // Print new line

        System.out.println("Enter the Key Element to search");
        int x = scan.nextInt();// key element for search

        // output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("x found at index : " + i);
            }
        }
    }
}