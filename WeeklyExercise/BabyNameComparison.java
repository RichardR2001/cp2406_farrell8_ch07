// BabyNameComparison.java
// Ask user for three first names and concatenates them in every possible two name combination
import java.util.*;

public class BabyNameComparison {
    public static void main(String[] args)
    {
        String fname1, fname2, fname3;      // store the firstnames
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a first name: ");
        fname1 = in.nextLine();
        System.out.print("Enter the second first name: ");
        fname2 = in.nextLine();
        System.out.print("Enter the third first name: ");
        fname3 = in.nextLine();
        System.out.println("The possible name combinations are:");
        System.out.println(fname1+ " " +fname2);
        System.out.println(fname1+ " " +fname3);
        System.out.println(fname2+ " " +fname1);
        System.out.println(fname2+ " " +fname3);
        System.out.println(fname3+ " " +fname1);
        System.out.println(fname3+ " " +fname2);
    }
}
