/*Q3: print the following pattern: 
            *
            **
            ***
            ****
*/

package question;

import java.util.Scanner;

public class patternPrintingThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern: ");
        int r = sc.nextInt();
        // No significance of column in the triangular pattern :)

        for(int i = r ; i >= 1 ; i--){
            for (int j = i ; j <= r ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
