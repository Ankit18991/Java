import java.util.*;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number for table: ");
        int num = sc.nextInt();
        int iterator = 1;
        
        System.out.println("The table of " + num + " is displayed below :- ");
        while (iterator <= 10) {
            System.out.println("\t\t\t\t" + (iterator * num));
            iterator++;
        }

        sc.close();
    }
}
