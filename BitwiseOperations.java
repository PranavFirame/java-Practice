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

    static void getIthBit(int num, int i){
        // LEFT shift - 00001 - 00100 if i = 2
        int bitmask = 1<<i;

        if ((num & bitmask) == 0) {
            System.out.println(0);
        } 
        else {
            System.out.println(1);
        }
    }

    static void setIthBit(int num, int i){
        int bitmask = 1<<i;
        System.out.println(num | bitmask);
    }

    static void clearIthBit(int num, int i){
        // 1010 & ~(0010) = 1000 where ~(0010) = 1101 and i = 1 num = 10
        int bitmask = ~(1<<i);
        System.out.println(num & bitmask);
    }

    static void updateBit(int num, int i, int newBit){
        if (newBit == 0) {
            clearIthBit(num, i);
        } else {
            setIthBit(num, i);
        }
    }

    static void clearLastI(int num, int i){
        int bitmask = (-1)<<i;
        System.out.println("cleared last i bits: "+ (num & bitmask));
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = sc.nextInt();
        isOddOREven(n);
        getIthBit(1001, 3);
        setIthBit(10, 2);
        clearIthBit(10, 1);
        updateBit(10, 2, 1);
        clearLastI(21, 2);
        sc.close();
    } 
}
