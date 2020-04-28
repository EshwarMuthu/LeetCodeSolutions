public class RemoveElement {
	public int removeElement(int[] nums, int val) {
        int pointer1=0;
        for(int pointer2=0;pointer2<nums.length;pointer2++){
            if(nums[pointer2]!=val){
                nums[pointer1]=nums[pointer2];
                pointer1++;
            }
        }
        return pointer1;
    }
	public static void main(String[] args) {
		RemoveElement r=new RemoveElement();
		int nums[]= {1,2,3,4,5,6,7,8,9,0,3,24,45,6,3,25,7,3};
		int nums2[]= {0,0,0,0,0,1,1,1,1,4,4};
		int nums3[]= {1};
		int nums4[]=new int[0];
		int len = r.removeElement(nums, 3);
		int len2=r.removeElement(nums2, 0);
		int len3=r.removeElement(nums3, 1);
		int len4=r.removeElement(nums4, 5);
		for (int i = 0; i < len; i++) {
		    System.out.print(nums[i]+" ");
		}
		System.out.print("\n");
		for (int i = 0; i < len2; i++) {
		    System.out.print(nums2[i]+" ");
		}
		System.out.print("\n");
		for (int i = 0; i < len3; i++) {
		    System.out.print(nums3[i]+" ");
		}
		System.out.print("\n");
		for (int i = 0; i < len4; i++) {
		    System.out.print(nums4[i]+" ");
		}
	}

}
