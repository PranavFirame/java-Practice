import java.util.Scanner;

public class BitwiseOperations {
    static void isOddOREven(int n){
        // AND operation on binary - 000000 & 000001 = 0 | 000001 & 000001 = 000001
        int bitwizer = 1;
        if ((n&bitwizer)==0) {
            System.out.println("The "+n+" is even");
        }else{
            System.out.println("The "+n+" is odd");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = sc.nextInt();
        isOddOREven(n);
        sc.close();
    } 
}
