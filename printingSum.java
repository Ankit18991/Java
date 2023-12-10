import java.util.*;

public class printingSum {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t Enter the value of a: ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();

        System.out.println("\t\t\t\tEnter the Value of b: ");
        float b = sc.nextFloat();

        float sum;
        sum = a + b;
        System.out.println("\t\t\t\t The sum of the numbers = ");
        System.out.println(sum);
        sc.close();
    }
}
