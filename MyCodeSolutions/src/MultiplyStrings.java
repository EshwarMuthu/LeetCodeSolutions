import java.math.BigInteger;

public class MultiplyStrings {
	public String multiply(String num1, String num2) {
        BigInteger a=new BigInteger(num1);
        BigInteger b=new BigInteger(num2);
        BigInteger c=a.multiply(b);
        return c.toString();
    }
	public static void main(String[] args) {
		MultiplyStrings ms=new MultiplyStrings();
		System.out.println(ms.multiply("2","3"));
		System.out.println(ms.multiply("34324324234234342343242223", "749839840983759835870348"));
	}
}
