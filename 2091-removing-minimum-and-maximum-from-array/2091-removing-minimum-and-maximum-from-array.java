class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minIndex=-1;
        int maxIndex=-1;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
                minIndex=i;
            }
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }
        }
        int deleteFront=Math.max(minIndex,maxIndex)+1;
        int deleteBack=n-Math.min(minIndex,maxIndex);
        int deleteMixed=Math.min(minIndex,maxIndex)+1+(n-Math.max(minIndex,maxIndex));
        return Math.min(deleteFront,Math.min(deleteBack,deleteMixed));
    }
}