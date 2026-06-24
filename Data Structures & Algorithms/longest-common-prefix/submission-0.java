class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Traverse characters of first string
        for (int i = 0; i < strs[0].length(); i++) {

            char ch = strs[0].charAt(i);

            // Compare same index in all strings
            for (int j = 1; j < strs.length; j++) {

                // Check boundary or mismatch
                if (i == strs[j].length() || strs[j].charAt(i) != ch) {

                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }
}