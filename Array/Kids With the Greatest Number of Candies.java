//brute force

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> arr=new ArrayList<>();
        int flag=0;
        for(int i=0;i<candies.length;i++){
            int d=candies[i]+extraCandies;
            for(int j=0;j<candies.length;j++){
                if(d<candies[j]){
                    flag=1;
                    arr.add(false);
                    break;
                }
            }
            if(flag==0)
               arr.add(true);
            flag=0;
        }
        return arr;
    }
}

//Another Method

import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> arr=new ArrayList<>();
        //sort method 
         Arrays.sort(candies);
      
        //max element in the array
        int max=candies[candies.length-1];
  
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies;>=max)
                arr.add(true);
            else
                arr.add(false);
        }
        return arr;
    }
}

//optimal approach

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> arr=new ArrayList<>();

        int max=-1;
        for(int i=0;i<candies.length;i++){
             max=Math.max(max,candies[i]);
        }
    
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max)
                arr.add(true);
            else
                arr.add(false);
        }
        return arr;
    }
}

