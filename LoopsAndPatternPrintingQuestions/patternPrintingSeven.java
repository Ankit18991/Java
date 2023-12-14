/* 
    Q7: 123456
        123456
        123456
        123456
*/

package question;
import java.util.Scanner;

public class patternPrintingSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of rows: ");
        int r = sc.nextInt();

        System.out.println("Enter the Number of Columns in the Pattern");
        int c = sc.nextInt();

        for(int i = 1 ; i <= r ; i++){
            for(int j = 1 ; j <= c ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
    
}
