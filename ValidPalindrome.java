class Solution {
	public boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1){
            return true;
        }
        int left = 0;
        int right = s.length() - 1;

        while (left < right){
            char chl = Character.toLowerCase(s.charAt(left));
            char chr = Character.toLowerCase(s.charAt(right));
            
            while (!Character.isLetterOrDigit(chl)){
                ++left;
                if (left >= s.length()){
                    break;
                }
                chl = Character.toLowerCase(s.charAt(left));
            }
            while (!Character.isLetterOrDigit(chr)){
                --right;
                if (right < 0){
                    break;
                }
                chr = Character.toLowerCase(s.charAt(right));
            }
            
            if (Character.isLetterOrDigit(chl) && Character.isLetterOrDigit(chr) && chl != chr){
                return false;
            }

            ++left;
            --right;
        }
        
        return true;
    }
}
