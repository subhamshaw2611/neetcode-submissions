class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        List<Integer>[] arr = new ArrayList[nums.length+2];
        for(int key:map.keySet()){
            int val = map.get(key);
            if(arr[val]==null){
                arr[val]=new ArrayList<>(List.of(key));
            }else{
                arr[val].add(key);
            }
        }
        int[] arr2 = new int[k];
        int temp=0;
        for(int i=nums.length+1;i>=0;i--){
            if(arr[i]!=null){
                for(int j:arr[i]){
                    arr2[temp]=j;
                    temp++;
                    if(temp==k) return arr2;
                }
            }
        }
        return new int[]{-1};
    }
}
