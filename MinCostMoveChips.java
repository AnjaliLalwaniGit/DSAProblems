package Arrays;

public class MinCostMoveChips {

    public int minCostToMoveChips(int[] position) {

        /*
        * CASE STUDY

Considering that the minimum cost can be obtained by bringing all the coins to index 0.
Let's see some examples for that

Cost For bringing coin from 'x' index to 0

0 to 0 -> 0, since all coins are at same position.
1 to 0 -> bringing all the coins from index1 to index 0 one by one will cost same as total number coins at index 0.
2 to 0 -> bringing all the coins from index 2 to index 0 will cost 0 for each coin as index 0 is at 2 - 2.
3 to 0 -> bring all the coins from index 3 to index 1 in cost 0. Now to bring all the coins from index 1 to index 0 will cost same as above i.e. number of coins now at index 1. This means the cost will be total number of coins at index 3.
OBSERVATION

To bring all the coins at index 0, total cost will be number of coins at odd indices. This is same for any of the even index.

Similarly, if we try to bring all the coins at any odd index (Let's say 1) then cost will be count of coins at Even indices.

Hence, the minimum cost would be minimum of count of coins at even indices and at odd indices.

*/
        int even = 0 ;
        int odd = 0 ;
        for (int i : position)
        {
            if (i%2 == 1)
            {
                odd++;
            }
            else
            {
                even++;
            }
        }
        return Math.min(odd , even) ;
    }
}
