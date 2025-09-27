package Assignment_2;

public class Merge_Sorted_Array {
    
    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        answer(nums1,m,nums2,n);
        for (int i : nums1) {
            System.out.print(i+" ");
        }
    }

    public static void answer(int[] nums1, int m ,int[] nums2, int n){
        int i = m-1;
        int j = n-1;
        int k = n+m-1;

        while(j>=0  && i>=0){
            if(nums1[i]<nums2[j]){
                nums1[k] = nums2[j];
                k--; 
                j--;
            }
            else if(nums1[i]>= nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }
        }
        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    // public void answer2(int[] nums1, int m, int[] nums2, int n){
    //     int i = m;
    //     int j = 0;
    //     while(j<n){
    //         nums1[i++] = nums2[j++];
    //     }
    //     Arrays.sort(nums1);
    // }
}
