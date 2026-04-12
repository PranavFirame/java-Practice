import java.util.*;

public class functions {
    static double facto(int num){
        if (num == 1 || num == 0) {
            return 1;
        }
        return num * facto(num-1);
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("-------------------------");
        System.out.println("value of a: "+a);
        System.out.println("value of b: "+b);
    }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num to calculate factorial: ");
        int num = sc.nextInt();
        double fact = facto(num);
        System.out.println("the factorial of "+num+" is: "+ fact);


        
        // call by value...
        System.out.print("Enter a number in a: ");
        int a = sc.nextInt();
        System.out.print("Enter a number in b: ");
        int b = sc.nextInt();
        swap(a, b);


        sc.close();
    }
}
