import java.util.*;

public class ZigZagConversion {
	public String convert(String s, int numRows) {
        if(numRows==1) return s;
        else{
        HashMap<Integer,String> hm=new HashMap();
        int pointer=0;
        boolean reverse=false;
        for(int i=0;i<s.length();i++){
            if(reverse==false){
                if(i<numRows){
                hm.put(i,Character.toString(s.charAt(i)));
                pointer++;
                }else{
                    String stringFromHash=hm.get(pointer);
                    String resString=stringFromHash+Character.toString(s.charAt(i));
                    hm.replace(pointer,resString);
                    pointer++;
                }
                if(pointer==numRows) {
                    reverse=true;
                    pointer--;
                }
            }else{
                pointer--;
                String stringFromHash=hm.get(pointer);
                String resString=stringFromHash+Character.toString(s.charAt(i));
                hm.replace(pointer,resString);
                if(pointer==0){
                    reverse=false;
                    pointer++;
                }
                
            }
        }
        String result="";
        for(Map.Entry entry:hm.entrySet()){
            result=result+entry.getValue();
            // System.out.println(entry.getValue());
        }
        return result;
        }
    }

	public static void main(String[] args) {
		ZigZagConversion zzc=new ZigZagConversion();
		System.out.println(zzc.convert("PAYPALISHIRING",4));
		System.out.println(zzc.convert("PAYPALISHIRING",3));
	}

}

//P     I    N
//A   L S  I G
//Y A   H R
//P     I
