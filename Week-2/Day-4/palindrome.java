class Solution {
    public boolean isPalindrome(String s) {
        String rev = "";
        String cleanText = s.toLowerCase().replaceAll("[^a-z0-9]", ""); 

        for (int i = 0; i < cleanText.length(); i++){
             char k = cleanText.charAt(i);
             rev = k + rev;
       }
       if (rev.equals(cleanText)){
         return true;
       }
       else{
        return false;
       }



    }
}