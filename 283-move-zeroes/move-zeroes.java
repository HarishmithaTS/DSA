class Solution {
    public void moveZeroes(int[] nums) {
       int index=0;
       int i;
       for(i=0;i<nums.length;i++){
        if(nums[i]!=0){
            nums[index]=nums[i];
            index++;
        }
       } 
       for(i=index;i<nums.length;i++){
        nums[i]=0;
       }
       System.out.println(Arrays.toString(nums));
    }
}