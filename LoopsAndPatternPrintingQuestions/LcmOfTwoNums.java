//  A java program to get the LCM of two entered numbers
import java.util.*;

public class LcmOfTwoNums {
    public static void main(String[] args) {
        System.out.println("Enter the second number for the LCM : ");
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        
        System.out.println("Enter the second number for the LCM : ");
        int second = sc.nextInt();

        int one = first;
        int two = second;
        
        for(; !((first % one== 0) && (first % two == 0));){
            first += one;
            // No need of the code here. The Updation in the variable is mentioned above
        }

        System.out.println("The LCM of " + one + " and " + two + " = " + first);
        sc.close();
    }    
}
