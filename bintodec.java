public class bintodec{
    public static void binTodec(int bin){
        int pow = 0;
        int dec = 0;

        while (bin>0) {
            int rem = bin%10;
            dec = dec+(rem*(int)Math.pow(2, pow));
            pow++;
            bin = bin/10;
        }

        System.out.println("Decimal: "+ dec);
    }
    public static void main(String[] args) {
        binTodec(1000);
    }
}