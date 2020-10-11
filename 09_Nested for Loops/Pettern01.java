/*
* Code: Printing Following Pattern in screen
*   *
*   **
*   ***
*   ****
*   *****
*   ******
* Author: Victor Banerjee
* Modified: Aditya Bardhan
*/

import java.util.*;

public class Pettern01 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {//modified i=1
            for (int j = 1; j <= i; j++) {//modified i=1
                System.out.print("*");
            } // define Columns
            System.out.println(); // define row
        }
        in.close();
    }
}
