public class BestTimeToBuyAndSellStock{
  public static void main(String[] args){
    int[] prices_1 = new int[] {7, 1, 5, 3, 6, 4};
    int[] prices_2 = new int[] {7, 6, 4, 3, 1};

    System.out.println(maxProfit(prices_1));
    System.out.println(maxProfit(prices_2));
  }

  public static int maxProfit(int[] prices){
    // assume zero profit to begin with
    int max = 0;
    // keep track of buying and selling price
    int buy = 0, sell = 1;

    if (prices.length == 1){
      return max;
    }

    while (sell < prices.length){
      if (prices[buy] > prices[sell]){
        buy = sell;
      }
      else{
        int profit = prices[sell] - prices[buy];
        max = Math.max(max, profit);
      }
      sell += 1;
    }

    return max;
  }
}