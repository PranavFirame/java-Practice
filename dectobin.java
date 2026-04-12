public class dectobin {
    public static void decToBin(int dec){
        int pow = 0;
        int bin = 0;

        while (dec>0) {
            int rem = dec%2;
            bin = bin + (rem*(int)Math.pow(10, pow));
            dec = dec/2;
            pow++;
        }
        System.out.println("binary num: "+bin);
    }
    public static void main(String[] args) {
        decToBin(8);
    }
}
