class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max) max=piles[i];
        }
        int left=1;
        int right=max;
        while(left<=right){
            int mid = left+(right-left)/2;
            long totalHour=0;
            for(int i=0;i<piles.length;i++){
                int res = piles[i]/mid;
                if(piles[i]%mid!=0) res++;
                totalHour=totalHour+res;
            }
            if(totalHour<=h){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}
