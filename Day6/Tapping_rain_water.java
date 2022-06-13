class Solution {
    public int trap(int[] height) {
        
        //Brute force approach
//         int n=height.length;
//         int water=0;
        
//         for(int i=0;i<n;i++){
//             int j=i;
//             int leftmax=0,rightmax=0;
//             while(j>=0){
//                 leftmax=Math.max(leftmax,height[j]);
//                 j--;
//             }
//             j=i;
            
//             while(j<n){
//                 rightmax=Math.max(rightmax,height[j]);
//                 j++;
//             }
            
//             water+=Math.min(leftmax,rightmax) - height[i];
            
//         }
//         return water;
        
        
        //Using two extra arrays
        //TC =o(N) SC=O(N)+O(N);
//         int n=height.length;
//         int pre[]=new int[n];
//         int suf[]=new int[n];
        
//         pre[0]=height[0];
//         for(int i=1;i<n;i++)
//         {
//             pre[i]=Math.max(height[i],pre[i-1]);
//         }
        
//         suf[n-1]=height[n-1];
//         for(int i=n-2;i>=0;i--){
//             suf[i]=Math.max(suf[i+1],height[i]);
//         }
        
//         int water=0;
//         for(int i=0;i<n;i++){
//              water+=Math.min(suf[i],pre[i])-height[i];
//         }
//         return water;
        
        
        
        //optimised approach two pointer
        int n=height.length;
        int left=0;
        int right=n-1;
        int leftmax=0;
        int rightmax=0;
        int water=0;
        while(left<=right){
            if(height[left]<=height[right])
            {
                if(height[left]>=leftmax){
                    leftmax=height[left];
                }
                else{
                    water+=leftmax-height[left];
                }
                left++;
            }
            else
            {
                if(height[right]>=rightmax){
                    rightmax=height[right];
                }
                else{
                    water+=rightmax-height[right];
                }
                right--;
            }
        }
        return water;
    }
}
