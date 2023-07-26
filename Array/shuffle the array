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
