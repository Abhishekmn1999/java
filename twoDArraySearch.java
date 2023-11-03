import java.util.*;

public class twoDArraySearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();

        System.out.println("Enter the numbers of columns");
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];

        //input
        //rows
        for (int i = 0; i < rows; i++) {
            //no of colums
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter the number for " + i + " row " + j + " column:");
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your entered array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the key element to search in array");
        int x = sc.nextInt();// key element

        // output searching for element
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // compare with x
                if (numbers[i][j] == x) {
                    System.out.println("x found at location (" + i + "," + j + ")");
                }
            }
        }
    }
}