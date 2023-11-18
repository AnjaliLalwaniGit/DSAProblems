package Arrays;

public class HighestAltitude {

    public int largestAltitude(int[] gain) {



        int[]  alt=new int[gain.length+1];
        int maxGain=alt[0];

        for(int i=1;i<alt.length;i++){
            alt[i]=alt[i-1]+gain[i-1];
            if(alt[i]>maxGain)
                maxGain=alt[i];
        }
        return maxGain;
    }
}


