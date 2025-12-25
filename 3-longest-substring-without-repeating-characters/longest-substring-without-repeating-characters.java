class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxLen=0;
        int[] freq=new int[256];
        for(int right=0; right < s.length(); right++){
             char c=s.charAt(right);
              freq[c]++;
             while(freq[c]>1){
                char leftchar=s.charAt(left);
                freq[leftchar]--;
                left++;
              }
              maxLen=Math.max(maxLen, right-left+1);
        }
       return maxLen;
    }
}