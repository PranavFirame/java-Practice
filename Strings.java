import java.util.Scanner;

public class Strings {
    static void memoryOptimization(String s){
        StringBuilder sb = new StringBuilder(s);
        for(char ch='a'; ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }

    static void compress(String str){
        StringBuilder sb = new StringBuilder();
        int size = str.length()-1;
        
        for (int i=0; i<=size;i++){
            Integer count = 1;

            while (i<size && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));

            if (count>1) {
                sb.append(count.toString());
            }
        }
        
        System.out.println(sb.toString());
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a string: ");
        String ss = sc.nextLine();
        String s = new String("aaaaabbbbddddd");
        // memoryOptimization(ss);
        System.out.println(s.equals(ss));   // check isEqual
        compress(s);
        sc.close();
    }
}
