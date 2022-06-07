import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int profit=0;
        int m=Integer.MAX_VALUE;
        for(int i=0;i<prices.size();i++){
            if(prices.get(i)<m){
                m=prices.get(i);
            }
            else if(prices.get(i)-m>profit){
                profit=prices.get(i)-m;
            }
        }
        return profit;
    }
}
