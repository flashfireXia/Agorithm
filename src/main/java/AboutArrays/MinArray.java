package AboutArrays;

/*剑指offer第11题：旋转数组的最小数字*/

public class MinArray {
    public static void main(String[] args) {
        int[] nums1 = new int[] {3, 4, 5, 1, 2};
        int[] nums2 = new int[] {2, 2, 2, 0, 1};
        Solution3 s = new Solution3();
        System.out.println(s.minArray(nums1));
        System.out.println(s.minArray(nums2));
    }
}

class Solution3 {
    /*二分法，时间复杂度O(logN)，空间复杂度O(1)*/
    public int minArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                int x = left;
                for (int k = left + 1; k < right; k++) {
                    if (nums[k] < nums[x]) {
                        x = k;
                    }
                }
                return nums[x];
            }
        }
        return nums[left];
    }
}
