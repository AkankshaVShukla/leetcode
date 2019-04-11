class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int maxLength=0, len=0;
        for(int i=0, j=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                j=Math.max(j, map.get(ch)+1);
            }
            map.put(ch, i);
            maxLength = Math.max(i-j+1, maxLength);
        }
        return maxLength;
    }
}
