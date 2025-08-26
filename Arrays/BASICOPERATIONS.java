package Arrays;
import java.util.Scanner;

public class BASICOPERATIONS {
    

    public static void forEachLoop(int[] arr) {
        System.out.print("for-each loop: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int minimumElement(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

    public static int[] runtimeAssignment(int n, Scanner sc) {
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        return arr;
    }

    public static int sumOfAllElements(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    public static int returnArraySum(int[] arr) {
        return sumOfAllElements(arr);
    }

    public static int largestNumber(int[] arr) {
        int max = arr[0];
        for (int num : arr) if (num > max) max = num;
        return max;
    }

    public static int largestElementInArray(int[] arr) {
        return largestNumber(arr);
    }

    public static int secondLargestElement(int[] arr) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;        // Update secondMax before max
                max = num;              // Update max
            } else if (num > secondMax && num != max) {     // Ensure num is not equal to max
                secondMax = num;
            }
        }
        return secondMax;
    }

    public static void swapAlternate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void defaultValuesDemo() {
        int[] arr = new int[5];
        System.out.print("Default values: ");
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }

    public static void memoryAllocationDemo() {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) arr[i] = i + 1;
        System.out.print("Memory allocated: ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }

    public static void predictOutput1() {
        int[] arr = {10, 20, 30};
        System.out.println("Predict Output 1 (arr[0] + arr[2]): " + (arr[0] + arr[2])); // 40
    }

    public static void arraysInMethods() {
        int[] arr = {1, 2, 3};
        modifyArray(arr);
        System.out.print("After modifyArray(): ");
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }

    public static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) arr[i]++;
    }

    public static int[] returnAnArray() {
        return new int[]{100, 200, 300};
    }

    public static void predictOutput2() {
        int[] a = {1, 2, 3};
        int[] b = a;
        b[0] = 10;
        System.out.println("Predict Output 2 (a[0]): " + a[0]); // 10
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user to enter array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = runtimeAssignment(n, sc);

        System.out.println("Minimum Element: " + minimumElement(arr));
        System.out.println("Sum of all Elements: " + sumOfAllElements(arr));
        System.out.println("Returned Array Sum: " + returnArraySum(arr));
        System.out.println("Largest Number: " + largestNumber(arr));
        System.out.println("Largest Element: " + largestElementInArray(arr));
        System.out.println("Second Largest Element: " + secondLargestElement(arr));

        System.out.print("Before swapAlternate: ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
        swapAlternate(arr);
        System.out.print("After swapAlternate: ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();

        System.out.println();
        forEachLoop(arr);
        defaultValuesDemo();
        memoryAllocationDemo();
        predictOutput1();
        arraysInMethods();

        int[] newArr = returnAnArray();
        System.out.print("Returned Array: ");
        for (int i : newArr) System.out.print(i + " ");
        System.out.println();

        predictOutput2();

        sc.close();
    }
}


