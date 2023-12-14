package question;
import java.util.Scanner;

public class threeReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter The number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int copy_num = num;
        int reversed_no = 0;

        System.out.println("The entered Number = " + num);

        while(copy_num >= 1){
            copy_num = num % 10;
            reversed_no = reversed_no * 10 + copy_num;
            num = num /10;
        }

        System.out.println("The reverse of the Entered no " + num + " = " + reversed_no / 10);

        sc.close();
    }
}
