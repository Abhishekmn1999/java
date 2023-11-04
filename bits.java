
public class bits {
    public static void main(String args[]) {

        // get bitmask
        // (AND opertor)
        int n = 5;// binary code of 5 = 0101
        int pos = 2;
        int bitMask = 1 << pos;

        if ((bitMask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("Bit was one");
        }
    }
}