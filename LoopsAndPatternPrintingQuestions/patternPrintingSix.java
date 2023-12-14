/* Q6 : 1 2 3 4 5 6 7
        2 3 4 5 6 7 1
        3 4 5 6 7 1 2 
        4 5 6 7 1 2 3
        5 6 7 1 2 3 4 
        6 7 1 2 3 4 5 
        7 1 2 3 4 5 6 
*/

package question;
import java.util.Scanner;

public class patternPrintingSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows: ");
        int r= sc.nextInt();

        for(int i = 1; i <= r ; i++){
            for(int j = i; j <= (r); j++){
                System.out.print(j + " ");
                
            }

            if(i >= 1 ){
                for(int k = 1 ; k <= (i - 1); k++){
                    System.out.print(k + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}


/* Logic: R1 -> 1 -> 7 
          R2 -> 2 -> 7 , 1
          R3 -> 3 -> 7 , 1,2
          R4 -> 4 -> 7 , 1, 2, 3
          R5 -> 5 -> 7 , 1,2,3,4 
*/