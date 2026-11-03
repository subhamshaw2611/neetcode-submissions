class TimeMap {

    public TimeMap() {
        
    }

    HashMap<String,List<List<Object>>> map = new HashMap<>();
    
    public void set(String key, String value, int timestamp) {
        List<Object> list1 = new ArrayList<>(Arrays.asList(value,timestamp));
        if(map.containsKey(key)){
            List<List<Object>> l = map.get(key);
            l.add(list1);
        }else{
            List<List<Object>> list2 = new ArrayList<>();
            list2.add(list1);
            map.put(key,list2);
        }
    }
    
    public String get(String key, int timestamp) {
        if(map.containsKey(key)){
            List<List<Object>> l = map.get(key);
            int left = 0;
            int right = l.size()-1;
            while(left<=right){
                int mid = left+(right-left)/2;
                List<Object> l2 =  l.get(mid);
                if((int) l2.get(1)==timestamp){
                    return (String) l2.get(0);
                }else if((int) l2.get(1)>timestamp){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            if(right!=-1){
                List<Object> l3 =  l.get(right);
                return (String) l3.get(0);
            }
        }
        return "";
    }
}
