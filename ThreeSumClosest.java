package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums={-1,2,1,-4};
        System.out.println(threeSumClosest(nums,1));
    }

    public static int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int finalSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<nums.length-2; i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(sum<target)
                    j++;
                else
                    k--;
                if(Math.abs(sum-target)<Math.abs(finalSum-target))
                    finalSum=sum;

            }

        }


        if(finalSum == Integer.MIN_VALUE){
            return sum;
        }
        else {
            return finalSum;
        }


    }

}
