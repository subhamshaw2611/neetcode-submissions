//right index meh +1 isiliye kyuki humlog cahate hai ki mid index right side pare nahi left side 
//samajhna thoda dhayan se 
//kyuki floor value lene ke karan mid hamesha left ke side padta hai
//nhi toh first array pura exclude possible nahi h [if both lenth are same]
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        if(nums1.length>nums2.length){
            int[] temp = nums1;
            nums1=nums2;
            nums2=temp;
        }

        int totalLength = nums1.length+nums2.length;
        int left = 0;
        int right = nums1.length;

        while(left<=right){
            int partitionX = left+(right-left)/2;
            int partitionY = (totalLength+1)/2 - partitionX ;

            int l1 = partitionX-1==-1? Integer.MIN_VALUE:nums1[partitionX-1];
            int r1 = partitionX==nums1.length? Integer.MAX_VALUE:nums1[partitionX];

            int l2 = partitionY-1==-1? Integer.MIN_VALUE:nums2[partitionY-1];
            int r2 = partitionY==nums2.length? Integer.MAX_VALUE:nums2[partitionY];

            if(l1<=r2 && l2<=r1){
                if(totalLength%2 == 0){
                    l2 = (l1>l2? l1:l2);
                    r1 = (r1>r2? r2:r1);
                    return (l2+r1)/2.0;
                }else{
                    return (l1>l2? l1:l2);
                }
            }

            if(l1>r2){
                right=partitionX-1;
            }else{
                left=partitionX+1;
            }
        }
        return 0;
    }
}

//teen chiz dhayan dena
