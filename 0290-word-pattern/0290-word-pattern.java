class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        HashMap<Object, Integer> map = new HashMap<>();
        for(int i=0; i<pattern.length();i++){
            
            Integer charIndex = map.put(pattern.charAt(i),i);
            Integer wordIndex = map.put(words[i], i);
            if(!java.util.Objects.equals(charIndex,wordIndex)){
                return false;
            }
        }
        return true;
    }
}