class Solution {
    public int mostFreqEle(int[] arr) {
        // code here
        Arrays.sort(arr);
        int ans=arr[0];
        int count =1;
        int maxcount=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
                }
                else{
                    count=1;

                }
                if(count>=maxcount){
                    maxcount=Math.max(maxcount,count);
                    ans=arr[i];
                }
        }
        return ans;

    }
}