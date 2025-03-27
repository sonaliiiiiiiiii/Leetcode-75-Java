class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String large= str1.length()>str2.length() ? str1:str2;
        String small= str1.length()>str2.length() ? str2:str1;
        if(small.equals(large)){
            return large;
        }
        if(!large.startsWith(small)){
            return "";
        }
        return gcdOfStrings(large.substring(small.length()), small);
    }
}