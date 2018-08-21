package Day13;

import java.util.Random;

public class Test06 {
    public static void main(String[] args) {
        Random random = new Random();
        int rows = random.nextInt(5);
        rows = (rows % 2 == 0) ? rows + 3 : rows + 2;
        int[][] matrix = new int[rows][rows];
        int magicNum = 1;
        int i = 0;
        int j = rows / 2;
        while (magicNum <= rows * rows) {
            int i_pre = i + 2;
            int j_pre = j - 1;
            if (i < 0 || j >= rows || i_pre < 0 || j_pre >= rows) {
                i = (i + rows) % rows;
                i_pre = (i_pre + rows) % rows;
                j = (j + rows) % rows;
                j_pre = (j_pre + rows) % rows;
            }
            if (matrix[i][j] != 0) {
                i = i_pre;
                j = j_pre;
            }
            matrix[i][j] = magicNum;
            i -= 1;
            j += 1;
            magicNum += 1;
        }
        for (int[] aMatrix : matrix) {
            for (int anAMatrix : aMatrix) {
                System.out.print(anAMatrix + " ");
            }
            System.out.println();
        }
    }
}
