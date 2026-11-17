//right index meh +1 isiliye kyuki humlog cahate hai ki mid index right side pare nahi left side 
//samajhna thoda dhayan se 
//kyuki floor value lene ke karan mid hamesha left ke side padta hai
//nhi toh first array pura exclude possible nahi h [if both lenth are same]
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            int[] temp = nums1;
            nums1 = nums2;
            nums2=temp;
        }
        int left=0;
        int right=nums1.length;
        int totalLength = nums1.length+nums2.length;
        while(left<=right){
            int partitionX = left+(right-left)/2;
            int partitionY = ((totalLength+1)/2)-partitionX;

            int l1 = partitionX-1==-1?Integer.MIN_VALUE:nums1[partitionX-1];
            int r1 = partitionX==nums1.length?Integer.MAX_VALUE:nums1[partitionX];

            int l2 = partitionY-1==-1?Integer.MIN_VALUE:nums2[partitionY-1];
            int r2 = partitionY==nums2.length?Integer.MAX_VALUE:nums2[partitionY];

            if(l1>r2){
                right=partitionX-1;
            }else if(r1<l2){
                left=partitionX+1;
            }else{
                if(totalLength%2==0){
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }else{
                    return Math.max(l1,l2);
                }
            }
        }
        return -1;
    }
}

//teen chiz dhayan dena
//1) even ke time r1 & l2 ka value disturbing ho sakta hai jab pura ekside ka value lena ho
//       ekside ka pura kaat sakta hai dangerous situation
//2) joh chota array hoga woh nums1 banega humesha
//3) right index ek bara lena?
