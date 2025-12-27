import java.util.*;



public class patterns {
    static void piramid(int num){
        System.out.println("hey..! function called... Pyramid: ");
        for(int i = 1; i<=num; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void invertPiramid(int num){
        System.out.println("hey..! function called... Inverte: ");
        for(int i = num; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void numPiramid(int num){
        System.out.println("hey..! function called... NUMPyramid: ");
        for(int i = 1; i<=num; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void charPiramid(int num){
        char a = 'A';
        System.out.println("hey..! CharPyramid: ");
        for(int i = 1; i<=num; i++){
            for(int j = 1; j<=i; j++){
                System.out.print((a++) + " ");
            }
            System.out.println();
        }
    }
    static void hollowRec(int rows, int col){
        for(int i = 1; i<=rows; i++){
            for(int j = 1; j<=col; j++){
                if (i==1||i==rows||j==1||j==col) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

        static void mirrorPyramid(int rows){
        for(int i = rows; i>=1; i--){
            for(int j = 1; j<=rows; j++){
                if (j<i) {
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void butterflyPattern(int num){
        System.out.println("butterflyPattern: ");
        for(int i = 1; i<=num; i++){
            for(int j =1; j<= num*2; j++){
                if (j>i && j<=(num*2)-i) {
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for(int i = num; i>=1; i--){
            for(int j =1; j<= num*2; j++){
                if (j>i && j<=(num*2)-i) {
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int col = sc.nextInt();
        hollowRec(rows, col);
        butterflyPattern(rows);
        sc.close();
    }
}
