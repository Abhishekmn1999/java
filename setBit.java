import java.util.*;

public class setBit {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // setBit 
        //get bitmask
        //(OR operator)

        int n = 5;// binary code of 5 = 0101
        int pos = 1;
        int bitMask = 1 << pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}