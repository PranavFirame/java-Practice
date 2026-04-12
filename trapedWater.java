public class trapedWater {

    public static int calTrapeWater(int values[]){
        //calculate left max height
        int leftHeight[] = new int[values.length];
        leftHeight[0] = values[0];

        for(int i=1; i<values.length; i++){
            if (leftHeight[i-1]>values[i]) {
                leftHeight[i] = leftHeight[i-1];
            }else{
                leftHeight[i] = values[i];
            }
        }

        //calculate right max height
        int rightH[] = new int[values.length];
        rightH[values.length-1] = values[values.length-1];
        for(int i=values.length-2; i>=0;i--){
            if (rightH[i+1]>values[i]) {
                rightH[i]=rightH[i+1];                
            }else{
                rightH[i] = values[i];
            }
        }
        int totalwtrapped = 0;
        for(int i=0;i<values.length;i++){
            //waterheight =  min (leftH, rightH)
            int waterheight = Math.min(leftHeight[i], rightH[i]);
            int trapedWater = waterheight - values[i];
            totalwtrapped = totalwtrapped + trapedWater;
        }
        
        return totalwtrapped;
    }

    public static void main(String[] args) {
        int val1[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1}; // out: 6
        int val2[] = {4, 2, 0, 3, 2, 5}; // out: 9
        System.out.println(calTrapeWater(val2));
    }
}
