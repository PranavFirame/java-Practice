public class rrayss {
    static void reverseArr(int arr[]){
        int start, end, temp;
        start = 0;
        end = arr.length-1;
        while (start<end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
    }
    static void traverse(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int linearSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if (arr[i] == key) {
                System.out.println("index: "+i);
                return i;
            }
        }
        System.out.println("the key is not found...");
        return -1;
    }

    static int binarySearch(int arr[], int key){
        int first, end, mid;
        first = 0;
        end = arr.length -1;
        while (first<=end) {
            mid = (first + end) /2;
            if (arr[mid] == key) {
                return mid;
            }else if(arr[mid]<key){
                first = mid +1;
            }else if (arr[mid]>key) {
                end = mid -1;
            }
        }
        return -1;
    }

    static void pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                System.out.print("(" +arr[i]+", "+arr[j]+")");
            }
            System.out.println();
        }
    }

    static void subArray(int arr[]){
        for(int i= 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                System.out.print("[ ");
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.print("]");
            }
            System.out.println();
        }
    }

    static void bubboleSort(int arr[]){
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void selectionSort(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            int index = i, temp;
            for(int j=i+1; j<arr.length;j++){
                if (arr[j]<arr[index]) {
                    index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void main(String args[]){
        // int arr[] = new int[5];
        int arr[] = {100,20,3,4,5};
        reverseArr(arr);
        traverse(arr);
        linearSearch(arr, 2);
        System.out.println(binarySearch(arr, 100));
        pairs(arr);
        subArray(arr);
        bubboleSort(arr);
        selectionSort(arr);
        traverse(arr);
    }
}
