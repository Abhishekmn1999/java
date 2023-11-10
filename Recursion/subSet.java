import java.util.*;

public class subSet {
    public static void printSubSet(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubSets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubSet(subset);
            return;
        }

        // add
        subset.add(n);
        findSubSets(n-1, subset);

        // not add
        subset.remove(subset.size() - 1);
        findSubSets(n-1, subset);
    }

    public static void main(String args[]) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubSets(n, subset);
    }
}
