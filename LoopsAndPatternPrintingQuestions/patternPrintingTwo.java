// Q2.> Print the pattern:    ****
                        //    *  *
                        //    *  *
                        //    ****

package question;

import java.util.Scanner;

public class patternPrintingTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern: ");
        int r = sc.nextInt();

        System.out.println("Enter the no of columns in the pattern: ");
        int c = sc.nextInt();

        for (int i = 0; i < r; i++) {
            if (i == 0 || i == r - 1) {
                for (int j = 0; j < c; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }

            else {
                for (int j = 0; j < c; j++) {
                    if(j == 0 || j==(c-1)){
                        System.out.print("*");
                    }

                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        sc.close();
    }
}
