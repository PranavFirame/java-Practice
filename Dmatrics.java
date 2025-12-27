public class Dmatrics {

    static void traverse(int matrics[][]){
        for(int i = 0;i<matrics.length;i++){
            System.out.print("[ ");
            for(int j=0;j<matrics[0].length;j++){
                System.out.print(matrics[i][j]+" ");
            }
            System.out.println("]");
        }
    }

    static void spiralPrint(int matrics [][]){
        // m X n 
        int startRow = 0, startCol = 0, endCol = matrics[0].length-1, endRow = matrics.length-1;
        while (startRow<=endRow && startCol <= endCol) {

            // Top
            for(int i= startCol; i<=endCol;i++){
                System.out.print(matrics[startRow][i]+" ");
            }

            // Right
            for(int j = startRow+1; j<=endRow;j++){
                System.out.print(matrics[j][endCol]+" ");
            }


            // Bottom
            for(int i = endCol-1;i>=startCol;i--){
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrics[endRow][i]+" ");
            }

            // Left
            for(int i = endRow-1;i>=startRow+1;i--){
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrics[i][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    static boolean binarySearch(int arr[][], int key){
        int rows = 0;
        int col  = arr[0].length-1;
        while (rows<arr.length && col>=0) {
            if (arr[rows][col]==key) {
                System.out.println("the "+arr[rows][col]+" is found at: ("+rows+","+col+")");
                return true;
            }
            else if (arr[rows][col]>key) {
                col--;
            }else{
                rows++;
            }
        }
        System.out.println("the value is not present in the array");
        return false;
    }
    public static void main(String args[]){
        int matrics[][] = { {1,2,3},
                            {4,5,6},
                            {7,8,9}};

        int sortedArray[][] = { {10,20,30},
                                {15,25,35},
                                {32,33,39} };
        
        // traverse(matrics);
        spiralPrint(matrics);
        binarySearch(sortedArray, 10); 
    }
}
