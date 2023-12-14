/* Q8.> Print the following Pattern :-
                121212
                212121
                121212
                212121
*/

package question;

import java.util.Scanner;

public class patternPrintingEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the Pattern: ");
        int r = sc.nextInt();

        System.out.println("Enter the number of columns in the pattern: ");
        int c = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(2);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

/* 
      Solution : COnsider it as a matrix and if the sum of the indices of the postion of the matrix is even , 1 is printer and if not, 2 is printed, i.e., (i+j)
*/