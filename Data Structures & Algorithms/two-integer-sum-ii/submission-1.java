class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int x = 0;
        int y = numbers.length-1;
        while(x<y){
            if(numbers[x]+numbers[y]>target){
                y--;
            }else if(numbers[x]+numbers[y]<target){
                x++;
            }else{
                //x+y==target
                return new int[]{x+1,y+1};
            }
        }
        return new int[]{-1,-1};
    }
}
