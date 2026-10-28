class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] arr = new int[nums.length-k+1];
        int index=0;
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            if(i>=k-1){
                arr[index]=nums[dq.peekFirst()];
                index++;
            }
        }
        return arr;
    }
}
