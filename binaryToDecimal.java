import java.util.*;

public class binaryToDecimal {

    static int biToDecimal(int binary) {
        int i = 0;
        int result = 0;

        while (binary > 0) {
            int last = binary % 10;

            if (last == 1) {
                result += Math.pow(2, i);
            }

            i++;
            binary = binary / 10;
        }
        return result;
    }

    public static void main(String args[]) {
        System.out.print("Enter the binary number: ");
        Scanner sc = new Scanner(System.in);

        int binary = sc.nextInt();
        System.out.println("Decimal value: " + biToDecimal(binary));

        sc.close();
    }
}

