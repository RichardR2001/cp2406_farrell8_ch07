// CountWords.java
// Ask user to key in password that must satisfy the criteria

import java.util.*;
public class CountWords
{
    public static void main(String[] main)
    {
        String str;
        Scanner in = new Scanner(System.in);
        char ch;    // store the character as ch
        int x;
        int count = 0;
        int length;
        boolean previousCharWasPunc = false;
        System.out.print("Enter a string: ");
        str = in.nextLine();
        length = str.length();
        for(x=0; x<length; x++)     // using for loop to check since there is a finite number of characters
        {
            ch = str.charAt(x);
            if(ch == ' ' || ch == '.' || ch == ';' || ch == ',' || ch == '!' || ch == '-')
            {
                ++count;
                if (previousCharWasPunc)
                    --count;
                previousCharWasPunc = true;
            }
            else
                previousCharWasPunc = false;
        }
        if(!previousCharWasPunc)
            ++count;
        System.out.println("There are " + count + " words in the string");
    }

}
