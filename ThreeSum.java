package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};

        System.out.println(threeSum(nums).toString());

    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> answerList = new ArrayList<>();

        if (nums.length < 3) {
            return answerList;
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if(i==0 || ( i>0 && nums[i] != nums[i-1])){//remove duplicates for i
                int j = i + 1, k = nums.length - 1;
                int sum=0-nums[i];

                while (j < k) {

                    if ((nums[j] + nums[k] == sum) ){
                            answerList.add(List.of(nums[i], nums[j], nums[k]));

                        while(j<k && nums[j] == nums[j+1])//remove duplicates
                            j++;
                        while(j<k && nums[k] == nums[k-1])
                            k--;
                        j++;
                        k--;

                    }  else if (nums[j] + nums[k]  < sum) {
                        j++;
                    } else if (nums[j] + nums[k]  > sum) {
                        k--;
                    }

                }
            }
        }
        return answerList;
    }



}



