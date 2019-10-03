
public class Palindrome {
	public boolean isPalindrome(int x) {
        if(x<0) return false;
        int z=0, xx=x;
        int temp=0;
        while(temp==0){
            int y=x%10;
            x=x/10;
            z=z*10+y;
            if(x==0) temp=1;
        }
        if(xx==z) return true;  
        else return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome p=new Palindrome();
		System.out.println(p.isPalindrome(121));
		System.out.println(p.isPalindrome(-121));
		System.out.println(p.isPalindrome(123));
	}

}
