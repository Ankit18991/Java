/*Q5: print the following pyramid pattern: 
             *
            ***
           *****
          *******   --> Derived a  Pattern between no of rows and columns
*/

package question;

import java.util.Scanner;

public class patternPrintingFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern: ");
        int r = sc.nextInt();

        for (int i = 0; i < r; i++) { // traversing over rows
            for (int j = 1; j <= (r - i); j++) {
                // Print (r-i) spaces
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i) - 1; k++) {
                // 2i-1 stars
                System.out.print("*");
            }

            System.out.println();
            sc.close();
        }
    }
}
