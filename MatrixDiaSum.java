package Arrays;

public class MatrixDiaSum {

    class Solution {
        public int diagonalSum(int[][] mat) {

  /*      int count=0;

        for(int r=0;r<mat.length;r++){
            for(int c=0;c<mat[r].length;c++){
                if(r==c){
                    count +=mat[r][c];
                }
                else if( (r+c) ==  (mat.length  -1)){
                    count += mat[r][c];
                }
            }
        }
       return count; */

            int sum = 0;
            for(int i=0;i<mat.length;i++){
                sum = sum+mat[i][i];
                if(i!=mat.length-i-1)
                    sum = sum+mat[i][mat.length-i-1];
            }
            return sum;

        }
    }
}
