class Solution {  
    public int[] searchRange(int[] nums, int target) {
       int first=firstOccurence(nums,target);
       if (first==-1)  return new int[]  {-1,-1};
       int last=lastOccurence(nums,target);
       return new int[] {first,last};
    }
    int firstOccurence(int[] arr,int target){
       int n=arr.length;
       int low=0;
       int high=n-1;
       int first=-1;
       while(low<=high){
        int mid=(high+low)/2;
        if(arr[mid]==target){
            first=mid;
            high=mid-1;
        }else if(arr[mid]<target){
            low=mid+1;
        }else{
            high=mid-1;

        }
       }
       return first;

    }

    int lastOccurence(int[] arr,int target){
       int n=arr.length;
       int low=0;
       int high=n-1;
       int last=-1;
       while(low<=high){
        int mid=(high+low)/2;
        if(arr[mid]==target){
            last=mid;
           low=mid+1;
        }else if(arr[mid]<target){
            low=mid+1;
        }else{
            high=mid-1;

        }
       }
       return last;

    }
}