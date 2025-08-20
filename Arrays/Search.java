package Arrays;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = s.nextInt();

        int a[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();  // store input in array
        }

        System.out.print("Enter number to search: ");
        int number = s.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (a[i] == number) {
                System.out.println("Found at index: " + i);
                found = true;
                break;  // stop after finding first occurrence
            }
        }

        if (!found) {
            System.out.println(-1); // if not found
        }

        s.close();
    }
}
