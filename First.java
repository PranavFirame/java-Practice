import java.util.Scanner;

public class First{
    public static void main(String args[]){
        System.out.print("Enter a num to cal Factorial: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double fact = 1;
        for(int i = 1; i<= num; i++){
            fact = fact * i;
        }
        System.out.println(fact);
        sc.close();
    }
}