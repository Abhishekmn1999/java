import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add element
        list.add(0);
        list.add(8);
        list.add(3);
        list.add(2);
        System.out.println(list);

        //get element
        int element=list.get(2); // 2 is index
        System.out.println(element);

        //add the element between
        list.add(2,10); //2 is index and 10 element added to the index 2
        System.out.println(list);

        //set element at specified position
        list.set(0,1); //0 is index and element 1 is added to the index 1 
        System.out.println(list);

        //delete element
        list.remove(3);  //3 is index
        System.out.println(list);

        //size of the ArrayList
        int size= list.size();
        System.out.println(size);

        //loop in array
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //sorting in ArrayList
        Collections.sort(list);
        System.out.println(list);
    }
}
