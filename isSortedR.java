public class isSortedR {
    public static boolean isSortedArray(int arr[],int idx){
        if(idx==arr.length-1){
            System.out.println("True");
            return true;
        }

        if(arr[idx]<arr[idx+1]){
            //array is sorted till now
            return isSortedArray(arr, idx+1);
        }else{
            return false;
        }
    }

    public static void main(String args[]){
      int arr[]  ={1,3,5};
      System.out.println(isSortedArray(arr, 0));
    }
}
