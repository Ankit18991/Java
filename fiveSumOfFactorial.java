// 5.> Find the sum of first n factorial numbers
package question;
import java.util.Scanner;

public class fiveSumOfFactorial {
    public static int factorial(int input){
        int res=1;
        if(input == 1){
            return 1;
        }

        else{
            for(int i = input ; i > 0 ; i--){
                res = res * i;
            }

            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of natural numbers whose sum of factorials you want to calculate: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1 ; i <= n ; i++){
            sum = sum + factorial(i);
        }        

        System.out.println("The sum of the factorial of the first " + n + " Natural Numbers" + "  = " + sum);

        sc.close();
    }
}
