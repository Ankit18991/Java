/*Q4: print the following pattern: 
            ****
            ***
            **
            *
*/

package question;
import java.util.Scanner;

public class patternPrintingFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern: ");
        int r = sc.nextInt();
        // No significance of column in the triangular pattern :)

        for(int i = 1 ; i <= r ; i++){
            for (int j = i ; j <= r ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
