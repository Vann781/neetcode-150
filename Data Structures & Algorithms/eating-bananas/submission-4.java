class Solution {
        
    public int calculateHours(int[] piles, int k) {
        int totalHours = 0;

        for (int pile : piles) {
            totalHours += (pile + k - 1) / k;   
        }

        return totalHours;
    }

    public int minEatingSpeed(int[] piles, int h) {

        // find max pile
        int max = piles[0];
        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }


        // performing binary search 
        int low = 1;
        int high = max;
        int ans = max;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int totalHours = calculateHours(piles, mid);

            if (totalHours <= h) {
                ans = mid;          // can be the answer but what if there is a better answer
                high = mid - 1;     // trying another  slowrr one
            } else {
                low = mid + 1;      // trying faster eating speed
            }
        }

        return ans;
    }
    }

