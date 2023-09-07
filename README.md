# java
JAVA PROGRAMS
Output of 0-1 Triangle

#Code
public class b {
    public static void main(String args[]) {
        int n = 5;

        // outer loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

![image](https://github.com/Abhishekmn1999/java/assets/117501828/4a9628b9-40a3-4ce4-889b-8aea6464674e)
