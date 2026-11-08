class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] leftArr = new int[length];
        int[] rightArr = new int[length];
        int[] resArr = new int[length];

        //Creating Left Array
        leftArr[0]=1;
        for(int i=1;i<length;i++){
            leftArr[i]=leftArr[i-1]*nums[i-1];
        }

        //Creating Right Array
        rightArr[length-1]=1;
        for(int i=length-2;i>=0;i--){
            rightArr[i]=rightArr[i+1]*nums[i+1];
        }

        //Creating Final Result Array
        for(int i=0;i<length;i++){
            resArr[i]=leftArr[i]*rightArr[i];
        }

        return resArr;
    }
}
