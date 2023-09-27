package Arrays;

import java.util.HashMap;

/*1512. Number of Good Pairs
Easy

3153

167

Add to List

Share
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.



Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.*/

public class GoodPairs {
    public static void main(String[] args) {
        int[] nums={1,1,1,1};
        System.out.println(numIdenticalPairs(nums));

    }

    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        int count=0;

        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int occurances=hm.get(nums[i]);
                count=count+occurances;
                hm.put(nums[i],occurances+1);

            }
            else
                hm.put(nums[i],1);

        }
        return count;
    }

    public int numIdenticalPairs2(int[] nums) {
        int[]  fa=new int[101];

        int count=0;

        for(int i=0;i<nums.length;i++){
            count=count+fa[nums[i]];
            fa[nums[i]]++;

        }
        return count;
    }

}


