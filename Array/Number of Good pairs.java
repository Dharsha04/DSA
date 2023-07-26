/*Imagine this problem like, There is a gathering organized by some guy, the guest list is [1,2,3,1,1,3].
The problem with the guest is they only handshake with like minded people. (Like minded here is basically the digit should be same,
for example, 1 will handshake with 1 only, 2 will handshake with 2 only and so on)
*/
//question may be asked in the story-based way.
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int r=map.getOrDefault(nums[i],0);
            count+=r;
            map.put(nums[i],r+1);
        }
        return count;
    }
}

OR
//you can use brute force approach:-O(n^2)
  
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                    if(nums[i]==nums[j])
                          count++;
            }
        }
        return count;
    }
}
  
