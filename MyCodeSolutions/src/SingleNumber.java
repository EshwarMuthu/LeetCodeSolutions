
public class SingleNumber {
	
	public int singleNumber(int[] nums) {
        int result=0;
        for(int i:nums){
            result=result^i;
        }
        return result;
    }
	public static void main(String[] args) {
		SingleNumber sn=new SingleNumber();
		System.out.println(sn.singleNumber(new int[] {4,5,3,1,1,4,5}));
		System.out.println(sn.singleNumber(new int[] {2,2,1}));
	}
}
