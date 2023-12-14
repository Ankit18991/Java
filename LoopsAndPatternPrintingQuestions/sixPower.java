// Q6.> Raise a to the power b, without using amth functions

package question;
import java.util.Scanner;

public class sixPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        System.out.println("Enter the Power it is raised to : ");
        int power = sc.nextInt();
        int neutral = 1;

        for(int i = 0 ; i < power ; i++){
            neutral = num * neutral;
        }

        System.out.println(num + " Raised to the power " + power + " = " + neutral);
        sc.close();
    }
}
