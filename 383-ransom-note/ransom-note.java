class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()) return false;
        int[] counter=new int[26];
               for (char c : magazine.toCharArray())
                  counter[c-'a']++;

        for (char c : ransomNote.toCharArray()){
            if (counter[c-'a'] == 0) return false;
             counter[c-'a']--;
        }
        return true;

        
    }
}