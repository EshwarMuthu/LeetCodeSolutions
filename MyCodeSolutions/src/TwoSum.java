public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        int res[]=new int[2];
        //check the sum of ith element and i+1th element with target
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int sum=nums[i]+nums[j];
                if(sum==target){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;
    }
	public static void main(String[] args) {
		TwoSum t=new TwoSum();
		int nums[]= {2,7,11,13};
		System.out.println(t.twoSum(nums, 9)[0]);
		System.out.println(t.twoSum(nums, 9)[1]);
	}

}
