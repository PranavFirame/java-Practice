public class Recursion {
    public static void printnum(int n){
        if (n == 0) {
            return;
        }

        printnum(n-1);
        System.out.print(n+" ");
    }

    public static boolean isOrdered(int arr[], int i){
        if (i == 0) {
            System.out.println("the array is ordered");
            return true;
        }

        if(arr[i]<arr[i-1]){
            System.out.println("the array is not ordered");
            return false;
        }
        return isOrdered(arr, i-1);
    }

    // first occurance - both by - and + i;

    public static int firstOcc(int arr[], int i, int key){
        if (i<0) {
            return -1;
        }
        
        int position = firstOcc(arr, i-1, key);
        if (arr[i]== key) {
            return i;
        }
        return position;
    }

    public static int lastOcc(int arr[], int i, int key){
        if(i== arr.length){
            return -1;
        }
        int occurance = lastOcc(arr, i+1, key);

        if(occurance == -1 && arr[i]== key){
            return i;
        }

        return occurance;
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        return x * power(x, n-1);
    }

    public static int powerlog(int x, int n){
        if(n==0){
            return 1;
        }
        int halfpower = powerlog(x, n/2);
        int result = halfpower * halfpower;
        if (n%2!= 0) {
            result = result*x;
        }
        return result;
    }

    public static int tiles(int n){ //2*n (length * breadth) and the colom is 2*1
        //base case
        if (n==0 || n == 1) {
            return 1;
        }
        //vertical
        int fnm1 = tiles(n-1);

        // horizontally 
        int fnm2 = tiles(n-2);

        return fnm1 + fnm2 ;
    }

    public static int amazonproblemstatement(int n){ //4*n (length * breadth) and the colom is 4*1
        //base case
        if(n==0|| n==1){
            return 1;
        }

        //vertical
        int fnm1 = amazonproblemstatement(n-1);

        //horizontal
        int fnm2 = amazonproblemstatement(n-4);

        return fnm1 + fnm2;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,3};
        // isOrdered(arr, arr.length-1);
        // System.out.println(lastOcc(arr, 0, 3));
        // System.out.println(power(2, 10));
        // System.out.print(powerlog(2, 10)); // LOG N time complexity and also less memory acusition;
        System.out.println(tiles(4));
    }
}




