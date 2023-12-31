/*Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].
 */

package Arrays;

public class FlipImage {

    public int[][] flipAndInvertImage(int[][] image) {


        if(image == null )
            return image;


        for(int[] row : image){
            int i=0;
            int j=row.length-1;
            while(i<=j){
                int temp=row[i];
                row[i]=1-row[j];
                row[j]=1-temp;
                i++;
                j--;
            }

        }
        return image;
    }
}
