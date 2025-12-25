class Solution {
    public boolean isPalindrome(String s) {
        // remove non-alphanumeric characters and lowercase
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String rev = "";
        String original_str = s;

        // build reverse manually using characters
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        // check if equal
        return original_str.equals(rev);
    }
}
