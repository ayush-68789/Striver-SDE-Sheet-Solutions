public class LC_121_Stocks_Buy_and_Sell {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4} ;
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] arr) 
    {
        int buyprice = arr[0] ;
        int maxprofit = 0 ;
        for(int i = 1 ; i < arr.length ; i++)
        {
            if(buyprice > arr[i])
            {
                buyprice = arr[i] ;
            }
            maxprofit = Math.max(maxprofit , arr[i] - buyprice) ;
        }
        return maxprofit ;
    }
}
