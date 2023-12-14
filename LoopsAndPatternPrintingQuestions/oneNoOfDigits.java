/* The Issue is actually related to the package structure and folder hierarchy. When using packages in Java, the directory atructure should mirror rhe package structure. 
 * 
 *  Ensure it to run the java file of the sub-folder from the parent folder location. This way , the package structure will be recognized correctly
*/

//1.> Find out the number of digits in the entered number 'num' 

package question;

import java.util.Scanner;

public class oneNoOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter The number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        System.out.println("The entered Number = " + num);

        int i = 1;
        for (; !((num / 10) == 0);) {
            num = num / 10;
            i++;
        }

        System.out.println("The no of digits in the entered number = " + i);
        sc.close();
    }
}
