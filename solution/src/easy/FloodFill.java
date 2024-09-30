package easy;

import java.util.Arrays;

public class FloodFill {

    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sc = 1;
        int sr = 1;
        int color = 2;

        int[][] result = floodFill(image, sc, sr, color);
        System.out.println(Arrays.deepToString(result));
    }

    private static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }

        int initialColor = image[sr][sc];
        fillImage(image, sr, sc, initialColor, color);
        return image;
    }

    private static void fillImage(int[][] image, int sr, int sc, int initialColor, int replaceColor) {
        int h = image[0].length;
        int w = image.length;

        if (sr < 0 || sc < 0 || sr >= w || sc >= h || image[sr][sc] != initialColor) {
            return;
        }

        image[sr][sc] = replaceColor;

        final int[] POS = {0, -1, 0, 1, 0};

        for (int i = 0; i < POS.length - 1; i++) {
            fillImage(image, sr + POS[i], sc + POS[i + 1], initialColor, replaceColor);
        }
    }
}
