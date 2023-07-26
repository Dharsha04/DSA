//create another array cause space complexity
class Solution {
    public int[] shuffle(int[] arr, int n) {
        int dup[]=new int[arr.length];
        int j=0,k=n;
        for(int i=0;i<arr.length;i++){
             if(i%2==0){
                 dup[i]=arr[j];
                 j++;
             }
             else{
                 dup[i]=arr[k];
                 k++;
             }
        }
        return dup;
    }
}

//without creating another array.

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        for(int i = n; i < len; i++) {
            nums[i] = (nums[i] * 1024) + nums[i - n];
        }
        
        int index = 0;
        for(int i = n; i < len; i++, index += 2) {
            nums[index] = nums[i] % 1024;
            nums[index + 1] = nums[i] / 1024;
        }
        
        return nums;
    }
}
