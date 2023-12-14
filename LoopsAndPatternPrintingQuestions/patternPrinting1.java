/* Print the following pattern
                ******
                ******
                ******
 */

package question;

public class patternPrinting1 {
    public static void main(String[] args) {
        for(int i = 0; i < 3 ; i++){
            System.out.println(" ");
            for (int j = 0; j < 6 ; j++){
                System.out.print("*");
            }
        }
    }
}
