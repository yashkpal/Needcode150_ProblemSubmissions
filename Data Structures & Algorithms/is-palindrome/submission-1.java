class Solution {
    public boolean isPalindrome(String s) {
        String alphnumberic = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase(); //isLetterOrDigit()

        if(alphnumberic.length() <=1) return true;
        int start =0 , end = alphnumberic.length()-1;

        while(start < end){
            if(alphnumberic.charAt(start) != alphnumberic.charAt(end)){
                return false;
            }
            else{
                start+=1;
                end-=1;
            }
        }
        return true;

        
    }
}
