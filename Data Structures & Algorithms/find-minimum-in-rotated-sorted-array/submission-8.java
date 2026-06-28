class Solution {

    int findMid(int left, int right) {
        return left + (right - left) / 2;
    }

    public int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = findMid(left, right);

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }
}