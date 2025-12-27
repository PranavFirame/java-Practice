import java.util.*;

public class functions {
    static double facto(int num){
        if (num == 1 || num == 0) {
            return 1;
        }
        return num * facto(num-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num to calculate factorial: ");
        int num = sc.nextInt();
        double fact = facto(num);
        System.out.println("the factorial of "+num+" is: "+ fact);
        sc.close();
    }
}
