import java.util.*;

public class clearBit {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // clearBit (NOT and AND operator)
        // 1.bitMask
        // 2.not with bitmask
        // 3.after AND

        int n = 5;// binary code of 5 = 0101
        int pos = 2;
        int bitMask = 1 << pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}