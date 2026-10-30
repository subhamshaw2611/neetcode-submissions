class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxBanana=piles[0];
        for(int i=1;i<piles.length;i++){
            if(piles[i]>maxBanana) maxBanana=piles[i];
        }
        int minBanana=1;
        while(maxBanana>=minBanana){
            int mid= (maxBanana + minBanana) / 2;
            long hour=0;
            for(int i=0;i<piles.length;i++){
                int res = piles[i]/mid;
                if(piles[i]%mid != 0) res++;
                hour=hour+res;
            }
            if(hour>h){
                minBanana=mid+1;
            }else{  
                maxBanana=mid-1;
            }
        }
        return minBanana;
    }
}
