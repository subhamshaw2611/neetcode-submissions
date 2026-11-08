class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        //Map Work
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        //Array Work
        List[] arr = new List[nums.length+1];
        for(int n:map.keySet()){
            int val = map.get(n);
            if(arr[val]==null){
                List<Integer> list = new ArrayList<>(Arrays.asList(n));
                arr[val]=list;
            }else{
                List<Integer> list2 = arr[val];
                list2.add(n);
            }
        }

        //Main Task
        int[] resArr = new int[k];
        int idx = 0;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]!=null){
                List<Integer> list3 = arr[i];
                for(int num:list3){
                    resArr[idx]=num;
                    idx++;
                    if(idx==k) return resArr;
                }
            }
        }

        return resArr;
    }
}
