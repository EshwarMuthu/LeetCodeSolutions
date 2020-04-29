public class ImplementstrStr {
	public int strStr(String haystack, String needle) {
        int index=haystack.indexOf(needle);
        return index;
    }
	public static void main(String[] args) {
		ImplementstrStr is=new ImplementstrStr();
		System.out.println(is.strStr("hello", "ll"));
		System.out.println(is.strStr("aaaaa", "bba"));
		System.out.println(is.strStr("eshwar", ""));
	}

}
