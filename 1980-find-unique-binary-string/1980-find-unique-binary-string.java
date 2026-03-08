class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int m = nums.length;
        int size = (int)Math.pow(2,m);
        int[] nu = new int[size];
        for(String num : nums){
            int val = Integer.parseInt(num,2);
            nu[val]++;
        }
        for(int i=0;i<size;i++){
            if(nu[i]==0){
                String ans=Integer.toBinaryString(i);
                return "0".repeat(m-ans.length())+ans;
            }
        }
        return "0".repeat(m);
    }
}