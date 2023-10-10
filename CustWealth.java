package Arrays;

import java.util.HashMap;
import java.util.List;

public class CustWealth {
    public int maximumWealth(int[][] accounts) {

        int maxWealth=0;


        for(int i=0;i<accounts.length;i++){
            int currWealth=0;
            for(int j=0;j<accounts[i].length;j++){
                currWealth += accounts[i][j];
                if(currWealth > maxWealth) maxWealth=currWealth;
            }
        }


        return maxWealth;
    }




}
