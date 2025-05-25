public class BestTimeToBuyAndSellStock{
  public static void main(String[] args){
    int[] prices_1 = new int[] {7, 1, 5, 3, 6, 4};
    int[] prices_2 = new int[] {7, 6, 4, 3, 1};

    System.out.println(maxProfit(prices_1));
    System.out.println(maxProfit(prices_2));
  }

  public static int maxProfit(int[] prices){
    int max = 0;

    for (int i = 0; i < prices.length; i++){
      for (int j = i + 1; j < prices.length; j++){
        if (prices[j] < prices[i]){
          continue;
        }
        else{
          int diff = prices[j] - prices[i];
          if (diff > max){
            max = diff;
          }
        }
      }
    }

    return max;
  }
}