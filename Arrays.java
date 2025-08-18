import java.util.Scanner;

public class Arrays {
    public static int largest(int[] a){
        int largestnumber = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largestnumber) {
                largestnumber = a[i];
            }
            
        }
        return largestnumber;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int max = largest(a);
        System.out.println(max);

    }
}
