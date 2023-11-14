package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int [][] mat={ {1,2,3},
                {4,5,6},
                {7,8,9}   };
        //List<Integer> ans=spiralOrder(mat);
        //System.out.println(ans);

        int[][] ans=generateMatrix(3);
        for(int[] arr: ans)
            System.out.println(Arrays.toString(arr));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> retList=new ArrayList<>();
        List<List<Integer>> as=new ArrayList<>();

        if(matrix ==  null)
            return retList;

        int left=0,top=0;
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;

        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                retList.add(matrix[top][i]);
            }
            top++;
            for(int j= top;j<=bottom;j++){
                retList.add(matrix[j][right]);
            }
            right--;
            if (!(left<=right && top<=bottom)){
                break;
            }
            for(int k=right;k>=left;k--){
                retList.add(matrix[bottom][k]);
            }
            bottom--;
            for(int l=bottom;l>=top;l--){
                retList.add(matrix[l][left]);

            }
            left++;
        }
        return retList;
    }


    public static int[][] generateMatrix(int n) {
        int[][] ret=new int[n][n];



        int left=0,top=0;
        int bottom=n-1;
        int right=n-1;
        int counter=1;

        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                ret[top][i]=counter++;
            }
            top++;

            for(int j= top;j<=bottom;j++){
                ret[j][right]=counter++;
            }
            right--;

            if (!(left<=right && top<=bottom)){
                break;
            }
            for(int k=right;k>=left;k--){
                ret[bottom][k]=counter++;
            }
            bottom--;
            for(int l=bottom;l>=top;l--){
                ret[l][left]=counter++;
            }
            left++;
        }
        return ret;
    }
}
