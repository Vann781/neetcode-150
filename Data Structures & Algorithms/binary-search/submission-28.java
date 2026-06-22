class Solution {

  public  int mid(int i , int j){
        return i + (j - i) / 2;

    }

    public int iterate(int[] arey  ,int target , int i , int j){
        if (i>j) return -1;
        int m = mid(i,j);
        if (arey[m]==target){
            return m;
        }

        if (target<arey[m]){
        return iterate(arey,target,i,m-1);}
        else {
            return iterate(arey,target,m+1,j);
        }
       
    }

    public int search(int[] nums, int target) {
     return iterate(nums,target,0,nums.length-1);
            }
           
        }


