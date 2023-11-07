
public class recursion5_1 {
    public static void printNumb(int n) {
        if (n == 0) { //base case
            return;
        }
        System.out.println(n);
        printNumb(n - 1); //recursion
    }

    public static void main(String args[]) {
        int n = 5;
        printNumb(n); //n=5
    }
}