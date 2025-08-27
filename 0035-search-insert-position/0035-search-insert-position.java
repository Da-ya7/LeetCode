import java.util.ArrayList;
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0 , u = nums.length-1 , mid;
        boolean flag = false ;
        ArrayList<Integer>list = new ArrayList<>();
        list.add(target);
        Arrays.sort(nums);
       while(l<=u){   
           mid = (l+u)/2;
           if(nums[mid]==target){
            flag= true;
            return mid;
           }
       
        else if (nums[mid]< target)
        {
            l =mid+1; 
        }
        else  
        {
            u = mid -1;
        }
       }
      return l;
       }  
        }

