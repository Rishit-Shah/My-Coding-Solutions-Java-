class Solution {
    public boolean validPalindrome(String s) {
        int i= 0;
        int j = s.length() - 1;

        return valid(s, i, j, false);
    }

    public boolean valid(String s, int i, int j, boolean validity){
        if(i>j ){
            return true;
        }

        if(s.charAt(i) == s.charAt(j)){
            return valid(s, i+1, j-1, validity);
        }

        if(validity){
            return false;
        }
        validity = true;
        return valid(s, i+1, j, validity) || valid(s, i, j-1, validity);
    }
}
