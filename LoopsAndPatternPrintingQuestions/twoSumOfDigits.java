// 2.> Find the sum of the digits of the number entered after taking the user input from the user.

package question;

import java.util.Scanner;

public class twoSumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter The number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int copy_num = num;

        System.out.println("The entered Number = " + num);

        while(copy_num >= 1){
            copy_num = num % 10;
            sum = sum + copy_num;
            num = num /10;
        }

        System.out.println("The sum of digits in the entered number = " + sum);
        sc.close();
    }
}
