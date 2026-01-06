package Strings;

import java.util.Scanner;

public class Comparision {
    
    public boolean compareString(String str1, String str2){
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str1 = s.next();
        String str2 = s.next();

        Comparision obj = new Comparision();
        if (obj.compareString(str1,str2)) {
            System.out.println("Strings are equal" );
            
        }
        else{
                System.out.println("Strings not equal");
            }
    }
}
