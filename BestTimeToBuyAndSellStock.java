public class BestTimeToBuyAndSellStock{
  public static void main(String[] args){
    int[] prices = new int[] {7, 6, 4, 3, 1};

    System.out.println(maxProfit(prices));
  }

  public static int maxProfit(int[] prices){
    int max = 0;

    for (int i = 0; i < prices.length; i++){
      for (int j = i + 1; j < prices.length; j++){
        int diff = prices[j] - prices[i];
        if (diff > max){
          max = diff;
        }
      }
    }

    return max;
  }
}