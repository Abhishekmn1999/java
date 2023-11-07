
public class recursion1_5 {
    public static void printNumb(int n) {
        if (n == 6) { //base case
            return;
        }
        System.out.println(n);
        printNumb(n+1); //recursion
    }

    public static void main(String args[]) {
        int n = 1;
        printNumb(n); //n=1 
    }
}