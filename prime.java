import java.util.Scanner;



public class prime{

    public static boolean isprime(int num){
        if (num==2) {
            return true;
        }

        for(int i=2; i<=Math.sqrt(num); i++){
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void primerange(int len){
        System.out.println("---------------------------");
        for(int i=2; i<=len; i++ ){
            if (isprime(i)) {
                System.out.print(i+"\t");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Check Prime: ");
        int num = sc.nextInt();
        System.out.println();
        System.out.println(isprime(num));
        System.out.print("enter a range: ");
        int len = sc.nextInt();
        primerange(len);
    }
}