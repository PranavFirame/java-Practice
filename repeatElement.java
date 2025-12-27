public class repeatElement{

    static void countElement(int arr[]){
        boolean visited[] = new boolean[arr.length];
        int count = 0;
        for(int i =0; i<arr.length; i++){
            if (visited[i]) {
                continue;
            }
            count = 1;
            for(int j=i+1;j<arr.length; j++){
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count>1) {
                System.out.println("the count of "+arr[i]+" is: "+count);
            }
        }
    }


    public static void main(String args[]){
        int arr[] = {1,5,1,1,5};
        countElement(arr);
    }
}