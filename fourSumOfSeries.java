/* 4.> Calculate the sum of the below given Series: -
            1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 +....... + n
*/


package question;
import java.util.Scanner;

public class fourSumOfSeries {
    public static void main(String[] args) {
        System.out.println("Enter the number of terms in the series: ");
        Scanner sc = new Scanner(System.in);
        int series = sc.nextInt();
        int sum = 0;

        for (int i = 1 ; i <= series ; i++)
        {
            if (i % 2 == 0){
                sum = sum  - i;
            }

            else {
                sum = sum + i;
            }
        }

        System.out.println("The sum of the series  = " + sum);
        sc.close();
    }
}
