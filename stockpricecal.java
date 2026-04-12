public class stockpricecal {

    public static int calProfit(int prices[]){
        int maxProfit = 0;
        int buying[] = new int[prices.length];
        buying[0] = prices[0];

        for(int i=1; i<prices.length; i++){
            if (prices[i]>buying[i-1]) {
                int profit = prices[i]-buying[i-1];
                maxProfit = Math.max(maxProfit, profit);
                buying[i] = buying[i-1];
            }else{
                buying[i] = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6,  4};
        System.out.println("maximum profit you could make is: "+calProfit(prices));
    }
}
