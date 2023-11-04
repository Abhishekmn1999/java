import java.util.*;

public class updateBit {
   public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      int oper = scan.nextInt();
      // oper = 1 : set
      // oper = 0 : clear
      int n = 5;// binary code of 5 = 0101
      int pos = 1;
      int bitMask = 1 << pos;

      if (oper == 1) {
         // set
         int newNumber = bitMask | n;
         System.out.println(newNumber);
      } else {
         int newBitMask = ~(bitMask);
         int newNumber = newBitMask & n;
         System.out.println(newNumber);
      }
   }
}
