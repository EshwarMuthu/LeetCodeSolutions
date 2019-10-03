public class ReverseInteger {
	public int reverse(int x) {
        int temp=0;
        int z=0;
        int prevz,i=0;
        if(x>=Integer.MIN_VALUE && x<=(Integer.MAX_VALUE-1)){
        while(temp==0){
            if(i==0){
                prevz=0;
                i++;
            }else{
                prevz=z;
            }
            int y=x%10;
            x=x/10;
            z=(z*10)+y;
            if(x==0){
                temp=1;
                //there may arise a case where z gets value exceeding
                //2 power of 31. For that value z/10 will be checked with previous z
                //value to end up with returning 0. If the value is less that 2power31
                //then it goes normal
                if((z/10)!=prevz){
                z=0;
            }
            }
        }
        return z;
        }
        else{
            return 0;
        }
        
    }
	public static void main(String[] args) {
		ReverseInteger r=new ReverseInteger();
		System.out.println(r.reverse(121));
		System.out.println(r.reverse(-121));
		//this is the case stated in line 19
		System.out.println(r.reverse(1234567899));
	}

}
