class Solution {

    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Step 1 : Insert into HashSet
        for (int num : nums) {
            set.add(num);
        }

        int answer = 0;

        // Step 2 : Traverse Array
        for (int num : nums) {

            // Start of Sequence
            if (!set.contains(num - 1)) {

                int current = num;
                int length = 1;

                while (set.contains(current + 1)) {

                    current++;
                    length++;

                }

                answer = Math.max(answer, length);
            }
        }

        return answer;
    }
}