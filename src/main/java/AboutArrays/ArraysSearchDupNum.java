package AboutArrays;

import java.util.*;

/*剑指offer第3题：数组中的重复数字*/
public class ArraysSearchDupNum {
    public static void main(String[] args) {
        int[] a = new int[] {2, 3, 1, 0, 2, 5, 3};
        Solution1 solution = new Solution1();
        int res = solution.findRepeatNumber2(a);
        System.out.println(res);
    }
}

class Solution1 {
    /*方法1：原地交换——时间复杂度O(N)，空间复杂度O(1)*/
    public int findRepeatNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i) {
                i++;
                continue;
            }
            if (nums[i] == nums[nums[i]]) {
                return nums[i];
            }
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;
        }
        return -1;
    }

    /*方法2：哈希表——时间复杂度O(N)，空间复杂度O(N)*/
    public int findRepeatNumber2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return -1;
    }
}
