class Solution {

    // Encode
    public String encode(List<String> strs) {

        StringBuilder encoded = new StringBuilder();

        for (String str : strs) {

            encoded.append(str.length());
            encoded.append("#");
            encoded.append(str);

        }

        return encoded.toString();
    }

    // Decode
    public List<String> decode(String s) {

        List<String> answer = new ArrayList<>();

        int i = 0;

        while (i < s.length()) {

            int j = i;

            while (s.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(s.substring(i, j));

            j++;

            String word = s.substring(j, j + length);

            answer.add(word);

            i = j + length;
        }

        return answer;
    }
}