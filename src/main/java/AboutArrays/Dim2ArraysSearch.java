package AboutArrays;

/*剑指offer第4题，二维数组中的查找*/
public class Dim2ArraysSearch {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 8;
        Solution2 s = new Solution2();
        boolean res = s.findNumberIn2DArray(matrix, target);
        System.out.println(res);
    }
}

class Solution2 {
    // 从右上角(当然也可以是左下角)查找，遇到目标值小于当前值则左移列，目标值大于当前值则下移行，若相等，返回True
    // 时间复杂度O(M + N)，空间复杂度O(1)
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = n - 1;
        while (row < m - 1 && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
