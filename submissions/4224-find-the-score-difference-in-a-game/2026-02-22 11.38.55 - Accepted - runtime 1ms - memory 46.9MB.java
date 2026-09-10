class Solution {
    public int scoreDifference(int[] nums) {
        int p1=0, p2=0;
        int n = nums.length;

        boolean p1Active = true;
        for(int i=0; i<n; i++){
            if(nums[i]%2!=0){
                p1Active = !p1Active;
            }

            if(i%6==5){
                p1Active = !p1Active;
            }

            if(p1Active) p1 += nums[i];
            else p2 += nums[i];
        }

        return p1-p2;
    }
}