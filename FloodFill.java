package Arrays;

import java.util.Comparator;

/*
733. Flood Fill
Easy

5813

560

Add to List

Share
An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.

You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].

To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with color.

Return the modified image after performing the flood fill.
 */
public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if(image[sr][sc] == color) return image;

        fill(image,sr,sc,color);

        return image;
    }

    public void fill(int[][] image,int sr,int sc,int color){

        int oldColor=image[sr][sc];
        image[sr][sc]= color;
        int[] delrow={-1,0,+1,0};
        int[] delcol={0,+1,0,-1};

        for(int i=0;i<4;i++){
            int nrow=sr+ delrow[i];
            int ncol=sc + delcol[i];

            if(nrow >=0 && nrow<image.length && ncol>=0 && ncol<image[0].length && image[nrow][ncol] == oldColor){
                fill (image, nrow, ncol, color);
            }


        }


    /*
        if(sr>0  && (oldColor == image[sr-1][sc]))
            fill (image, sr-1, sc, color);

        if( sr<image.length-1 && (oldColor == image[sr+1][sc]))
            fill( image, sr+1, sc, color);

        if(sc>0 && (oldColor == image[sr][sc-1]))
            fill (image, sr, sc-1, color);

        if( sc<image[sr].length-1 && (oldColor == image[sr][sc+1]))
            fill (image, sr, sc+1, color);
    */

    }
}
