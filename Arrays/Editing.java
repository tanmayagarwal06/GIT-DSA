package Arrays;

public class Editing {
    
    public static int[] Insertion(int arr[], int pos, int num){
        int newarray[] = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newarray[i] = arr[i];
        }

        newarray[pos] = num;

        for (int i = pos; i < arr.length; i++) {
            newarray[i + 1] = arr[i];
        }

        return newarray;
   }

   public static int[] Deletion(int arr[], int pos){
        if (pos < 0 || pos >= 0) {
            System.out.println("Invalid Position");
        }
 
        for (int i = pos; i < arr.length - 1; i++) {        // the array is needed to be shift 1 position left from the position of deletion
            arr[i] = arr[i+1];
        }
        return arr;
   }

   
    
   
}
