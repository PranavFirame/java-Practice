public class stringPalindrom {
    static boolean isPalindrom(String s){
        int n = s.length() - 1;
        int i = 0;
        while(i<=(n/2)){
            if(s.charAt(i)!=s.charAt(n-i)){
                System.out.println("this string is not palindrom");
                return false;
            }
            i++;
        }
        System.out.println("palindrom string...");
        return true;
    }

    public static void main(String args[]){
        String name = new String("HEH");
        isPalindrom(name);
    }    
}
